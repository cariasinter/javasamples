package javasamples.designpatterns.strategy;

public class PreparadorCafe {

    private MetodoPreparacion estrategia;

    public PreparadorCafe () {
        setEstrategia(new CoffeeMaker());
    }

    public void setEstrategia(MetodoPreparacion estrategia) {
        this.estrategia = estrategia;
    }

    public void preparar() {
        estrategia.prepararCafe();
    }

}