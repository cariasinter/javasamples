package javasamples.solid.lsp.good;

/**
 * Cuenta corriente que permite depósitos y retiradas.
 */
public class SavingsAccount extends BankAccount implements Depositable, Withdrawable {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }
}
