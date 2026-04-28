package javasamples.polymorphism;

public class Guitar extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Una guitarra tocando la nota " + n);
    }
}
