package javasamples.designpatterns.decorator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Logger que escribe en un archivo. Implementación robusta que crea el archivo si no existe.
 */
public class FileLogger extends LoggerDecorator {
    private final Path path;

    public FileLogger(Logger logger, Path path) {
        super(logger);
        this.path = path;
        try {
            if (!Files.exists(path)) {
                Files.createDirectories(path.getParent());
                Files.createFile(path);
            }
        } catch (IOException e) {
            throw new RuntimeException("No se pudo crear el archivo de log: " + path, e);
        }
    }

    @Override
    public void log(String msg) {
        logger.log(msg); // También delegamos a inner para mantener la cadena
        try (PrintWriter out = new PrintWriter(new FileWriter(path.toFile(), true))) {
            out.println(msg);
        } catch (IOException e) {
            throw new RuntimeException("Error escribiendo en archivo de log: " + path, e);
        }
    }
}
