package javasamples.solid.srp.good;

/**
 * Responsable del cálculo del total de una factura. Cumple SRP: solo contiene lógica de negocio.
 */
public class BillingCalculator {
    private final double taxRate;

    public BillingCalculator(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateTotal(Bill bill) {
        double amount = bill.getAmount();
        double tax = amount * taxRate;
        double discount = amount > 100 ? 10.0 : 0.0;
        return amount + tax - discount;
    }
}
