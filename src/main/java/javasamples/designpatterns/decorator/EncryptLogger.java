package javasamples.designpatterns.decorator;

/**
 * Logger que "encripta" (simplificado) el mensaje antes de delegar.
 */
public class EncryptLogger extends LoggerDecorator {
    public EncryptLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        String encrypted = encrypt(msg);
        logger.log(encrypted);
    }

    private String encrypt(String s) {
        // Simple sustitución rot13-like para ejemplo
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append((char) ('a' + (c - 'a' + 13) % 26));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('A' + (c - 'A' + 13) % 26));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
