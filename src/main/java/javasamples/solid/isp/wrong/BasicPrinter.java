package javasamples.solid.isp.wrong;

public class BasicPrinter implements SmartDevice {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("This printer does not support scanning.");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("This printer does not support faxing.");
    }
}
