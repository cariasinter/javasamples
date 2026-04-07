package javasamples.solid.lsp.good;

/**
 * Interfaz que define la capacidad de retirar fondos.
 */
public interface Withdrawable {
    void withdraw(double amount);
    double getBalance();
}
