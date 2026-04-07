package javasamples.solid.lsp.good;

/**
 * Interfaz que define la capacidad de recibir depósitos.
 */
public interface Depositable {
    void deposit(double amount);
    double getBalance();
}
