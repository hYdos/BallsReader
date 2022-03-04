package com.copium.type;

import com.copium.type.statements.Statement;

import java.util.List;

public class Function {
    public final String name;
    public final String returnType;
    public final List<MethodArg> arguments;
    public final List<Statement> statements;

    public Function(String name, List<MethodArg> arguments, String returnType, List<Statement> statements) {
        this.name = name;
        this.arguments = arguments;
        this.returnType = returnType;
        this.statements = statements;
    }
}
