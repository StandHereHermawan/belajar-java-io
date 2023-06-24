package ariefbelajarjava.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriterTest {

    @Test
    void writer() {
        Path path = Path.of("writer.txt");
        try (Writer writer = Files.newBufferedWriter(path)){
            for (int i = 0; i < 30; i++) {
                writer.write("Hello World\n");
                writer.flush();
            }
        } catch (Exception e) {
            Assertions.fail(e);
        }
    }
}
