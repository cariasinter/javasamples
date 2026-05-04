package javasamples.efectossecundarios;

public class GeneradorNumerosAleatorios {

    private int max;
    private int valorActual;

    public GeneradorNumerosAleatorios(int max){
        this.max = max;
        valorActual = getNuevoValor();
    }

    public int getValorActual() {
        return valorActual;
    }

    public void generarSiguienteValor() {
        valorActual = getNuevoValor();
    }

    private int getNuevoValor() {
        return (int) (Math.random() * max);
    }

    public static void main(String[] args) {
        GeneradorNumerosAleatorios g = new GeneradorNumerosAleatorios(100);

        int numero = g.getValorActual();
        System.out.println("Número aleatorio generado: " + numero);
        boolean esTransparenteReferencialmente =
                g.getValorActual() * 2 == g.getValorActual() + g.getValorActual();

        System.out.println("¿Es transparente referencialmente? " + esTransparenteReferencialmente);

        g.generarSiguienteValor();
        numero = g.getValorActual();
        System.out.println("Segundo número aleatorio generado: " + numero);
    }





}
