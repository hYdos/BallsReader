package me.hydos.just;

import me.hydos.antlr.JustParser;
import me.hydos.just.type.Constant;
import me.hydos.just.type.Function;
import me.hydos.just.type.MethodArg;
import me.hydos.just.statements.InvokeMethodStatement;
import me.hydos.just.statements.LocalVariableDeclarationStatement;
import me.hydos.just.statements.ReturnStatement;
import me.hydos.just.statements.Statement;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class JustReaderVisitor {

    public final RustFile rustFile;

    public JustReaderVisitor(String fileName) {
        this.rustFile = new RustFile(fileName);
    }

    public void visitFieldDeclaration(JustParser.FieldDeclarationContext ctx) {
        JustParser.VariableDeclaratorContext raw = ctx.variableDeclarators().variableDeclarator(0);
        String type = get(ctx.typeType());
        String name = get(raw.variableDeclaratorId());
        String value = get(raw.variableInitializer());

        this.rustFile.constants.add(new Constant(Visibility.NONE, type, name, value));
    }

    public void visitMethodDeclaration(JustParser.MethodDeclarationContext ctx) {
        String methodName = get(ctx.identifier());
        List<MethodArg> args = getMethodArgs(ctx.formalParameters().formalParameterList());
        List<Statement> statements = getMethodStatements(ctx);
        String returnType = null;

        if (ctx.typeTypeOrVoid().typeType() != null) {
            returnType = get(ctx.typeTypeOrVoid().typeType().classOrInterfaceType().identifier(0).IDENTIFIER());
        }

        rustFile.functions.add(new Function(methodName, args, returnType, statements));
    }

    private List<Statement> getMethodStatements(JustParser.MethodDeclarationContext ctx) {
        List<Statement> statements = new ArrayList<>();
        for (JustParser.BlockStatementContext blockStatementContext : ctx.methodBody().block().blockStatement()) {
            // Figure out what's going on in the line

            if (blockStatementContext.statement() != null) {
                if (blockStatementContext.statement().RETURN() != null) {
                    statements.add(readReturn(blockStatementContext.statement()));
                } else if (blockStatementContext.statement().expression() != null) {
                    statements.add(readInvokeMethod(blockStatementContext.statement()));
                } else {
                    throw new RuntimeException("Unknown Block Statement.");
                }

            } else if (blockStatementContext.localVariableDeclaration() != null) {
                statements.add(readLocalVariableDeclaration(blockStatementContext.localVariableDeclaration()));
            } else {
                throw new RuntimeException("Unknown Statement");
            }

        }
        return statements;
    }

    private ReturnStatement readReturn(JustParser.StatementContext statement) {
        String returnValue = get(statement.children.get(1));

        return new ReturnStatement(returnValue);
    }

    private LocalVariableDeclarationStatement readLocalVariableDeclaration(JustParser.LocalVariableDeclarationContext localVarDecl) {
        JustParser.VariableDeclaratorContext variableDeclaratorContext = localVarDecl.variableDeclarators().variableDeclarator().get(0);
        TerminalNode rawType = localVarDecl.typeType().classOrInterfaceType().identifier().get(0).IDENTIFIER();
        String localType = null;

        if (rawType != null) {
            localType = get(rawType);
        }
        String localName = get(variableDeclaratorContext.variableDeclaratorId().identifier().IDENTIFIER());
        String localDefaultValue = get(variableDeclaratorContext.variableInitializer().expression().primary().literal());

        return new LocalVariableDeclarationStatement(localType, localName, localDefaultValue);
    }

    private InvokeMethodStatement readInvokeMethod(JustParser.StatementContext statement) {
        JustParser.MethodCallContext methodCallContext = (JustParser.MethodCallContext) statement.children.get(0).getChild(0);
        String invokingMethod = get(methodCallContext.identifier());
        boolean isMacro = get(methodCallContext.BANG()).equals("!");

        List<String> arguments = new ArrayList<>();
        for (JustParser.ExpressionContext expressionContext : methodCallContext.expressionList().expression()) {
            arguments.add(get(expressionContext));
        }

        return new InvokeMethodStatement(isMacro, invokingMethod, arguments);
    }

    private List<MethodArg> getMethodArgs(JustParser.FormalParameterListContext paramList) {
        List<MethodArg> args = new ArrayList<>();

        if (paramList != null) {
            var rawArgs = paramList.formalParameter();

            for (JustParser.FormalParameterContext rawArg : rawArgs) {
                for (int i = 0; i < rawArg.children.size(); i++) {
                    var type = get(rawArg.children.get(i));
                    var name = get(rawArg.children.get(i + 1));
                    i++;
                    args.add(new MethodArg(name, type));
                }
            }
        }

        return args;
    }

    private String get(ParseTree parseTree) {
        if (parseTree instanceof TerminalNode terminalNode) {
            return terminalNode.toString();
        } else {
            StringBuilder fullThing = new StringBuilder();
            for (ParseTree child : ((ParserRuleContext) parseTree).children) {
                fullThing.append(get(child));
            }
            return fullThing.toString();
        }
    }
}
