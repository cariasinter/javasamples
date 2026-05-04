package javasamples.generictypes;

public class Pareja {
    private Object primero;
    private Object segundo;

    public Pareja(Object primero, Object segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public Object getPrimero() {
        return primero;
    }
    public Object getSegundo() {
        return segundo;
    }

}
