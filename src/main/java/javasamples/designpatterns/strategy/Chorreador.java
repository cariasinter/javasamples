package javasamples.designpatterns.strategy;

public class Chorreador implements MetodoPreparacion {

    @Override
    public void prepararCafe() {
        System.out.println("Colocando bolsita de tela...");
        System.out.println("Agregando café molido...");
        System.out.println("Vertiendo agua caliente lentamente...");
        System.out.println("Dejando filtrar...");
        System.out.println("Café listo con Chorreador.");
    }
}