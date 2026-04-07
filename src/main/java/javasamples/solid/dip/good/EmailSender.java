package javasamples.solid.dip.good;

public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        // Lógica para enviar un correo electrónico
        System.out.println("Enviando correo electrónico: " + message);
    }
}
