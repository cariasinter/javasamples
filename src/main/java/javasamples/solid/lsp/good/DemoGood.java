package javasamples.solid.lsp.good;

public class DemoGood {
    public static void main(String[] args) {
        Depositable depositAccount = new FixedTermDeposit( 1000, 12);
        depositAccount.deposit(500);
        System.out.println("Account  balance after deposit: " + depositAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(200);
        savingsAccount.deposit(100);
        savingsAccount.withdraw(50);
        System.out.println("Savings final balance: " + savingsAccount.getBalance());

        // Polimorfismo sin romper LSP: si una función necesita retirar, requiere Withdrawable
        processWithdrawal(savingsAccount, 30);
        // No se intenta retirar de FixedTermDeposit porque no implementa Withdrawable
    }

    private static void processWithdrawal(Withdrawable account, double amount) {
        account.withdraw(amount);
        System.out.println("Processed withdrawal  new balance: " + account.getBalance());
    }
}
