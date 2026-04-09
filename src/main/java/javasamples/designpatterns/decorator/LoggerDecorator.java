package javasamples.designpatterns.decorator;

/**
 * Decorador base que implementa Logger y delega a otro Logger.
 * Nota: el término "wrapper" también se usa a menudo para este patrón.
 */
public abstract class LoggerDecorator implements Logger {
    protected final Logger logger;

    public LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String msg) {
        logger.log(msg);
    }
}
