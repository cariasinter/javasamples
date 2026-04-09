package javasamples.designpatterns.decorator;

/**
 * Logger que simula almacenar en una base de datos.
 * En este ejemplo no hacemos conexiones reales; solo imprimimos una marca para simular.
 */
public class DBLogger extends LoggerDecorator {
    public DBLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        // Simulación de persistencia en DB
        logger.log(msg);
        System.out.println("[DB] Guardando en base de datos: " + msg);
    }
}
