package com.copium;

import java.util.List;

public class Function {
    public final String name;
    public final String returnType;
    public final List<MethodArg> arguments;
    public final List<InvokeMethodStatement> statements;

    public Function(String name, List<MethodArg> arguments, String returnType, List<InvokeMethodStatement> statements) {
        this.name = name;
        this.arguments = arguments;
        this.returnType = returnType;
        this.statements = statements;
    }
}
