package javasamples.solid.isp.good;

/**
 * Implementación económica que solo imprime.
 */
public class EconomicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("EconomicPrinter: Printing cheaply...");
    }
}
