package javasamples.polymorphism;

public class ElectricGuitar extends  Guitar {

    boolean turnedOn = false;

    public void turnOn() {
        turnedOn = true;
        System.out.println("La guitarra eléctrica está encendida.");
    }

    @Override
    public void play(Note n) {
        if (!turnedOn) {
            throw new RuntimeException("Error: La guitarra eléctrica está apagada!");
        }
        System.out.println("Una guitarra eléctrica tocando la nota " + n);
    }
}
