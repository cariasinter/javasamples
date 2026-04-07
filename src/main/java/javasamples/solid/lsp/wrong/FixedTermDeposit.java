package javasamples.solid.lsp.wrong;

public class FixedTermDeposit extends BankAccount {
    private int termInMonths;

    public FixedTermDeposit(double balance, int termInMonths) {
        super(balance);
        this.termInMonths = termInMonths;
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawals are not allowed from a fixed-term deposit.");
    }
}
