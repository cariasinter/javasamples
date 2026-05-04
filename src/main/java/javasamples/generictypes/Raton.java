package javasamples.generictypes;

public class Raton extends Animal {

    public Raton(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo queso.");
    }
}
