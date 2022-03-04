package com.copium;

import com.coping.leftNut;
import com.coping.leftNutBaseVisitor;
import com.coping.rightNut;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class JavaRust {

    public static RustFile convertFile(CharStream file) {
        leftNut balls2 = new leftNut(new CommonTokenStream(new rightNut(file)));
        leftNut.CompilationUnitContext compilationUnitContext = balls2.compilationUnit();
        RustFile rustFile = new RustFile(file.getSourceName().replace(".jrs", ".rs"));

        compilationUnitContext.accept(new leftNutBaseVisitor<>() {
            @Override
            public Object visitMethodDeclaration(leftNut.MethodDeclarationContext ctx) {
                leftNut.MethodBodyContext body = ctx.methodBody();
                leftNut.FormalParameterListContext paramList = ctx.formalParameters().formalParameterList();

                List<MethodArg> args = new ArrayList<>();
                if (paramList != null) {
                    var rawArgs = paramList.formalParameter();

                    for (leftNut.FormalParameterContext rawArg : rawArgs) {
                        for (int i = 0; i < rawArg.children.size(); i++) {
                            var type = getName(rawArg.children.get(i));
                            var name = getName(rawArg.children.get(i + 1));
                            i++;
                            args.add(new MethodArg(name, type));
                        }
                    }
                }

                String methodName = getName(ctx.identifier());

                List<InvokeMethodStatement> statements = new ArrayList<>();
                for (leftNut.BlockStatementContext blockStatementContext : body.block().blockStatement()) {
                    leftNut.StatementContext statement = blockStatementContext.statement();
                    if (statement.children.get(0).getChild(0) instanceof leftNut.MethodCallContext methodCallContext) {
                        String invokingMethod = getName(methodCallContext.identifier());
                        boolean isMacro = getName(methodCallContext.BANG()).equals("!");

                        List<String> arguments = new ArrayList<>();
                        for (leftNut.ExpressionContext expressionContext : methodCallContext.expressionList().expression()) {
                            arguments.add(getName(expressionContext));
                        }

                        statements.add(new InvokeMethodStatement(isMacro, invokingMethod, arguments));
                    } else {
                        throw new RuntimeException("Unknown Statement");
                    }

                }

                rustFile.functions.add(new Function(methodName, args, "unknown", statements));
                return super.visitMethodDeclaration(ctx);
            }

            private String getName(ParseTree parseTree) {
                if (parseTree instanceof TerminalNode terminalNode) {
                    return terminalNode.toString();
                } else {
                    StringBuilder fullThing = new StringBuilder();
                    for (ParseTree child : ((ParserRuleContext) parseTree).children) {
                        fullThing.append(getName(child));
                    }
                    return fullThing.toString();
                }
            }
        });

        return rustFile;
    }
}
