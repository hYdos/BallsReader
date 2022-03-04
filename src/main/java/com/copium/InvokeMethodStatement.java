package com.copium;

import java.util.List;

public class InvokeMethodStatement {
    public final boolean isMacro;
    public final String functionName;
    public final List<String> arguments;

    public InvokeMethodStatement(boolean isMacro, String functionName, List<String> arguments) {
        this.isMacro = isMacro;
        this.functionName = functionName;
        this.arguments = arguments;
    }
}
