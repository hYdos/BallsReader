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
public class SourceParser {
    private static final String[] ACCESS_MODIFIERS = {"public", "private", "protected"};
    private static final String[] OTHER_MODIFIERS = {"final"}; //TODO: I cant think of more off the top of my head. Is this it?
    private final String fileSource;
    private final List<Class> imports = new ArrayList<>();
    private String filePackage;

    public SourceParser(InputStream stream) {
        this(toString(stream));
    }

    public SourceParser(String fileSource) {
        this.fileSource = fileSource;

        for (String s : fileSource.split("\n")) {
            s = cleanString(s);
            String[] tokenSplit = s.split(";");
            for (String token : tokenSplit) {
                token = cleanString(token);
                if (token.startsWith("import"))
                    parseImport(token);

                if (token.startsWith("package"))
                    parsePackage(token);

                List<String> result = Arrays.stream(ACCESS_MODIFIERS).filter(token::startsWith).collect(Collectors.toList());
                if (result.size() == 1) { // If it's more than 0, the class is beyond repair
                    String accessModifier = result.get(0);
                    if (token.startsWith("class", accessModifier.length() + 1))
                        System.out.println(token.substring(accessModifier.length()));

                    if (token.startsWith("class", accessModifier.length() + 1))
                        System.out.println(token.substring(accessModifier.length()));
                } else if (result.size() > 1) {
                    throw new RuntimeException("Invalid Class! (Has more than one access modifier?)");
                }
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
     * Sometimes, developers are dumb and put weird spacing in their strings. Let's fix that.
     * Example:
     * "                      import     some.import.here;"
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
