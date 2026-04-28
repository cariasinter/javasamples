package javasamples.polymorphism;

public class Piano extends Instrument {

    @Override
    public void play(Note n) {
        System.out.println("Un piano tocando la nota " + n);
    }
}
