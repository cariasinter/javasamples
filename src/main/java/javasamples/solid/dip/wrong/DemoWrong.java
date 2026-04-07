package javasamples.solid.dip.wrong;

public class DemoWrong {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("¡Hola, este es un mensaje de notificación!");
    }
}
