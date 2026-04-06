package javasamples.solid.srp.good;

/**
 * Modelo simple de factura (solo datos). Cumple SRP: solo contiene estado y acceso a datos.
 */
public class Bill {
    private final String id;
    private double amount;

    public Bill(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{id='" + id + "', amount=" + amount + '}';
    }
}
