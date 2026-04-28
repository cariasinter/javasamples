package javasamples.polymorphism;

public class Violin extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Un violín tocando la nota " + n);
    }
}
