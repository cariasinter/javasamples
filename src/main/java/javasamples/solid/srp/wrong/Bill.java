package javasamples.solid.srp.wrong;

/**
 * Ejemplo  de una clase que viola el principio SRP (God class).
 * Reúne responsabilidades de cálculo, presentación y persistencia.
 */
public class Bill {
    private final String id;
    private double amount;

    // Constructor
    public Bill(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    // Calcula el total aplicando impuestos y descuentos (lógica de negocio)
    // Si cambiamos la forma de calcular el total, esta clase se verá afectada, lo que viola el SRP
    public double calculateTotal() {
        double tax = amount * 0.12; // impuesto fijo del 12%
        double discount = amount > 100 ? 10.0 : 0.0; // descuento simple
        return amount + tax - discount;
    }

    // Imprime la factura (responsabilidad de presentación)
    // Si queremos cambiar el formato de impresión, esta clase se verá afectada, lo que viola el SRP
    public void printBill() {
        System.out.println("---- BILL ----");
        System.out.println("ID: " + id);
        System.out.printf("Subtotal: %.2f\n", amount);
        System.out.printf("Total: %.2f\n", calculateTotal());
        System.out.println("--------------");
    }

    // Almacena la factura en una base de datos (responsabilidad de persistencia)
    // Si queremos cambiar la forma de almacenamiento (por ejemplo, usar un archivo en lugar de una DB), esta clase se verá afectada, lo que viola el SRP
    public void storeInDB() {
        // Simulación de almacenamiento en DB; no usar en producción
        System.out.println("Storing bill " + id + " in database...");
        System.out.println("Stored.");
    }

    // Getters / Setters
    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
