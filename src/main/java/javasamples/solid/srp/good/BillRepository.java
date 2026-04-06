package javasamples.solid.srp.good;

/**
 * Interfaz que define operaciones de persistencia para facturas.
 */
public interface BillRepository {
    void save(Bill bill);
}
