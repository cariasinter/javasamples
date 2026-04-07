package javasamples.solid.lsp.good;

/**
 * Clase base para cuentas con comportamiento compartido (id y balance).
 * No obliga a soportar tanto deposit como withdraw, las capacidades se expresan mediante interfaces.
 */
public abstract class BankAccount {
    protected double balance;

    protected BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
