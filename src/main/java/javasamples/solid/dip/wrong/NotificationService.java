package javasamples.solid.dip.wrong;

public class NotificationService {

    // Dependencia directa de una clase concreta (EmailSender)
    private EmailSender emailSender;

    public NotificationService() {
        this.emailSender = new EmailSender(); // Dependencia concreta
    }

    public void sendNotification(String message) {
        emailSender.sendEmail(message); // Uso directo de la clase concreta
    }
}
