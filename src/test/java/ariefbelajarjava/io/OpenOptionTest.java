package ariefbelajarjava.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class OpenOptionTest {

    @Test
    void append() {
        for (int i = 0; i < 10; i++) {
            Path path = Path.of("append.txt");
            try (Writer writer =Files.newBufferedWriter(path, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND)){

                writer.write("Hello World\n");
                writer.flush();

            } catch (Exception exception) {
                Assertions.fail(exception);
            }
        }
    }
}
