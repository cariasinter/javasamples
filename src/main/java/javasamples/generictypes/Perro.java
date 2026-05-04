package javasamples.generictypes;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void comer() {
        System.out.println(getNombre() + " está comiendo croquetas.");
    }
}
