package javasamples.solid.dip.good;

public class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        // Lógica para enviar un mensaje SMS
        System.out.println("Enviando SMS: " + message);
    }
}
