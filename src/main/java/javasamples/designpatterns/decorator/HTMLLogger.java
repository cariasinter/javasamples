package javasamples.designpatterns.decorator;

/**
 * Logger que envuelve el mensaje en etiquetas HTML.
 */
public class HTMLLogger extends LoggerDecorator {
    public HTMLLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        String html = makeHtml(msg);
        logger.log(html);
    }

    private String makeHtml(String msg) {
        return "<p>" + msg + "</p>";
    }

}
