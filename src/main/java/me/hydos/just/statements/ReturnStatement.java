package me.hydos.just.statements;

public record ReturnStatement(String returnValue) implements Statement {

    @Override
    public void write(StringBuilder writer) {
        writer.append(returnValue).append("\n");
    }
}
