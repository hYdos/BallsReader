package com.maldloader.stripandstub;

import java.util.Arrays;

public class Class {
    private final String name;
    private final String pkg;
    private String[] modifiers;

    public Class(String name, String pkg, String[] modifiers) {
        this.name = name;
        this.pkg = pkg;
        this.modifiers = modifiers;
    }

    /**
     * Converts a direct reference of a class to a {@link Class}. a direct reference is something such as "this.is.a.package.ClassName".
     */
    public static Class parseDirectReference(String directReference) {
        String[] split = directReference.split("\\.");
        String className = split[split.length - 1];

        return new Class(className, String.join(".", Arrays.copyOf(split, split.length - 1)), null);
    }

    public String getName() {
        return name;
    }

    public String getPkg() {
        return pkg;
    }

    public String[] getModifiers() {
        return modifiers;
    }

    public void setModifiers(String[] modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    public String toString() {
        return "Class{" + "name='" + name + '\'' + ", pkg='" + pkg + '\'' + ", modifiers=" + Arrays.toString(modifiers) + '}';
    }
}
