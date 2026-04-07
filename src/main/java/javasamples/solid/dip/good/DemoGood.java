package javasamples.solid.dip.good;

public class DemoGood {
    public static void main(String[] args) {

        // Inyectamos la dependencia en NotificationService
        NotificationService notificationService = Configuration.getNotificationService();

        // Enviamos una notificación
        notificationService.sendNotification("¡Hola, este es un mensaje de notificación!");
    }
}
