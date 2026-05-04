package javasamples.generictypes;

public class ParejaV3<TipoX extends Animal> {
    private TipoX primero;
    private TipoX segundo;

    public ParejaV3(TipoX primero, TipoX segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public TipoX getPrimero() {
        return primero;
    }
    public TipoX getSegundo() {
        return segundo;
    }
}
