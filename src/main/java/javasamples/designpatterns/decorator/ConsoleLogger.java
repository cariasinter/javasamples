package javasamples.designpatterns.decorator;

/**
 * Implementación base que escribe en consola.
 */
public class ConsoleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}
