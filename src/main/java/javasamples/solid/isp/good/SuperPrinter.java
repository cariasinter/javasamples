package javasamples.solid.isp.good;

/**
 * Dispositivo avanzado que implementa impresión, escaneo y fax.
 */
public class SuperPrinter implements Printer, Scanner, FaxMachine {
    @Override
    public void print() {
        System.out.println("SuperPrinter: Printing high-quality document...");
    }

    @Override
    public void scan() {
        System.out.println("SuperPrinter: Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("SuperPrinter: Sending fax...");
    }
}
