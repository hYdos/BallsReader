import com.maldloader.stripandstub.SourceParser;

import java.io.InputStream;

public class ParsingTests {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SourceParser parser = create("main.jrs");
        System.out.println("Imports are " + parser.getImports());
        System.out.println("Package is " + parser.getFilePackage());
        assert parser.getFilePackage().equals("me.hydos.test");

        System.out.println("Parsing took " + (System.currentTimeMillis() - startTime) + "ms. Cry about it JavaParser");
    }

    private static SourceParser create(String resourceName) {
        InputStream clazz = ParsingTests.class.getResourceAsStream("/" + resourceName);
        if (clazz == null) {
            throw new RuntimeException("Failed to read " + resourceName);
        }
        return new SourceParser(clazz);
    }
}
