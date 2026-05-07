package javasamples.designpatterns.strategy;

public class CoffeeService {
    public static void main(String[] args) {
        PreparadorCafe preparador = new PreparadorCafe();

        System.out.println("Preparando café con método por defecto:");
        preparador.preparar();

        System.out.println("\nCambiando a método Chorreador:");
        preparador.setEstrategia(new Chorreador());
        preparador.preparar();

        System.out.println("\nCambiando a método Prensa Francesa:");
        preparador.setEstrategia(new PrensaFrancesa());
        preparador.preparar();
    }
}
