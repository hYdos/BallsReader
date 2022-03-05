package me.hydos.just.type;

public class MethodArg {
    public final String name;
    public final String type;

    public MethodArg(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void write(StringBuilder writer) {
        writer.append(this.name).append(": ").append(this.type);
    }
}
