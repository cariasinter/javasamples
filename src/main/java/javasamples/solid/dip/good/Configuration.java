package javasamples.solid.dip.good;

public class Configuration {
    public static MessageSender getMessageSender() {
        // Aquí podrías tener lógica para decidir qué implementación de MessageSender usar
        return new EmailSender(); // Por ejemplo, podrías retornar una instancia de EmailSender
    }

    public static NotificationService getNotificationService() {
        return new NotificationService(getMessageSender());
    }
}
