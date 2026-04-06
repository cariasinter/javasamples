package javasamples.solid.srp.good;

/**
 * Responsable de la presentación/impresión de facturas. Cumple SRP: solo formatea y muestra.
 */
public class BillPrinter {
    public void print(Bill bill, double total) {
        System.out.println("---- BILL ----");
        System.out.println("ID: " + bill.getId());
        System.out.printf("Subtotal: %.2f\n", bill.getAmount());
        System.out.printf("Total: %.2f\n", total);
        System.out.println("--------------");
    }
}
