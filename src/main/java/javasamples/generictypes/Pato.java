package javasamples.generictypes;

public class Pato extends Animal {

    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está picoteando granos");
    }
}
