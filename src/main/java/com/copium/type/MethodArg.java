package com.copium.type;

import java.io.IOException;

public class MethodArg {
    public final String name;
    public final String type;

    public MethodArg(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void write(StringBuilder writer) throws IOException {
        writer.append(this.name).append(": ").append(this.type);
    }
}
