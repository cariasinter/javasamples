package javasamples.designpatterns.strategy;

public class PrensaFrancesa implements MetodoPreparacion {

    @Override
    public void prepararCafe() {
        System.out.println("Agregando café grueso...");
        System.out.println("Vertiendo agua caliente...");
        System.out.println("Esperando 4 minutos...");
        System.out.println("Presionando el émbolo...");
        System.out.println("Café listo con Prensa Francesa.");
    }
}