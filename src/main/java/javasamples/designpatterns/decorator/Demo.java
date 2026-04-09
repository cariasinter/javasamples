package javasamples.designpatterns.decorator;

import java.nio.file.Path;

public class Demo {
    public static void main(String[] args) {
        Logger console = new ConsoleLogger();

        // Encriptado -> HTML -> File -> DB
        Logger logger = new EncryptLogger(new HTMLLogger(new FileLogger(new DBLogger(console), Path.of("logs/app.log"))));

        logger.log("Hello, Decorator Pattern!");

        // Ejemplo alternativo: solo imprimir en consola y archivo
        Logger simple = new FileLogger(console, Path.of("logs/app.log"));
        simple.log("Simple log entry");
    }
}
