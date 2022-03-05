import me.hydos.just.Just;
import me.hydos.just.RustFile;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainRustTest {

    public static void main(String[] args) throws IOException {
        CodePointCharStream balls = CharStreams.fromString(new String(MainRustTest.class.getResourceAsStream("/main.jrs").readAllBytes(), StandardCharsets.UTF_8), "main.jrs");
        RustFile rustFile = Just.convertFile(balls);
        rustFile.write();

        System.out.println("Done!");
    }
}
