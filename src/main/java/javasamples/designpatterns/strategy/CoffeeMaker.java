package javasamples.designpatterns.strategy;

public class CoffeeMaker implements MetodoPreparacion {

    @Override
    public void prepararCafe() {
        System.out.println("Colocando filtro...");
        System.out.println("Agregando café molido...");
        System.out.println("Encendiendo coffee maker...");
        System.out.println("Esperando a que termine...");
        System.out.println("Café listo con Coffee Maker.");
    }
}
