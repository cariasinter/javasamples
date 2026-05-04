package javasamples.generictypes;

public class ParejaV2 {
    private Animal primero;
    private Animal segundo;

    public ParejaV2(Animal primero, Animal segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public Animal getPrimero() {
        return primero;
    }
    public Animal getSegundo() {
        return segundo;
    }
}
