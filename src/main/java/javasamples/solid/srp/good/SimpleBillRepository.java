package javasamples.solid.srp.good;

/**
 * Implementación simple de BillRepository que simula almacenamiento.
 */
public class SimpleBillRepository implements BillRepository {
    @Override
    public void save(Bill bill) {
        System.out.println("[Repository] Saving bill " + bill.getId() + " to storage...");
        System.out.println("[Repository] Saved.");
    }
}
