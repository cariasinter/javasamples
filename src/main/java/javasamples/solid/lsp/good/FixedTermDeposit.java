package javasamples.solid.lsp.good;

/**
 * Depósito a plazo fijo: permite depósito pero no retiradas antes del vencimiento.
 * Implementa solo la interfaz que le corresponde (Depositable) para respetar LSP.
 */
public class FixedTermDeposit extends BankAccount implements Depositable {
    private final int termInMonths;

    public FixedTermDeposit(double balance, int termInMonths) {
        super(balance);
        this.termInMonths = termInMonths;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    public int getTermInMonths() {
        return termInMonths;
    }
}
