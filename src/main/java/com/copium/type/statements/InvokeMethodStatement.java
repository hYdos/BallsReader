package com.copium.type.statements;

import java.util.List;

public class InvokeMethodStatement implements Statement {
    public final boolean isMacro;
    public final String functionName;
    public final List<String> arguments;

    public InvokeMethodStatement(boolean isMacro, String functionName, List<String> arguments) {
        this.isMacro = isMacro;
        this.functionName = functionName;
        this.arguments = arguments;
    }

    @Override
    public void write(StringBuilder writer) {
        writer.append(this.functionName);
        if (this.isMacro) {
            writer.append("!");
        }

        // Arguments
        writer.append("(");
        for (String argument : this.arguments) {
            writer.append(argument);

            if (this.arguments.get(this.arguments.size() - 1) != argument) {
                writer.append(", ");
            }
        }
        writer.append(");\n");
    }
}
