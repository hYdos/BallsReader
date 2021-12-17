package com.maldloader.stripandstub;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Very simple parser which ignores the content of methods.
 */
public class ClassParser {
    private static final String[] ACCESS_MODIFIERS = {"public", "private", "protected"};
    private static final String[] OTHER_MODIFIERS = {"final"}; //TODO: I cant think of more off the top of my head. Is this it?
    private final String fileSource;
    private final List<Class> imports = new ArrayList<>();
    private String filePackage;

    public ClassParser(InputStream stream) {
        this(toString(stream));
    }

    public ClassParser(String fileSource) {
        this.fileSource = fileSource;

        for (String s : fileSource.split("\n")) {
            s = cleanString(s);
            if (Arrays.stream(ACCESS_MODIFIERS).anyMatch(s::startsWith)) {
                // Assume we have made it past all imports and only classes, fields, and methods are ahead.
            } else {
                if (s.startsWith("import"))
                    parseImport(s.substring(0, s.indexOf(';')));

                if (s.startsWith("package"))
                    parsePackage(s.substring(0, s.indexOf(';')));
            }
        }
    }

    private void parseImport(String str) {
        imports.add(Class.parseDirectReference(str.split(" ")[1]));
    }

    private void parsePackage(String str) {
        this.filePackage = str.split(" ")[1];
    }

    /**
     * Sometimes, developers are dumb and put weird spacing in their strings. Lets fix that.
     * Example:
     * "                      import some.import.here;"
     * would get converted to:
     * "import some.import.here"
     */
    private String cleanString(String original) {
        original = original
                .replace("\t", " ")
                .replaceAll(" [ ]+", " ");
        if (original.length() > 0 && original.charAt(0) == ' ') {
            return original.substring(1);
        } else {
            return original;
        }
    }

    /**
     * Returns the source file of the class passed in.
     */
    public String getFileSource() {
        return fileSource;
    }

    /**
     * Returns a list of imports used in the source file
     */
    public List<Class> getImports() {
        return imports;
    }

    public String getFilePackage() {
        return filePackage;
    }

    private static String toString(InputStream stream) {
        return new BufferedReader(new InputStreamReader(stream)).lines().collect(Collectors.joining("\n"));
    }
}
