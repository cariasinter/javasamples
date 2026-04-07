package javasamples.solid.lsp.wrong;

public class DemoWrong {
    public static void main(String[] args) {
        BankAccount savings = new BankAccount(500);
        BankAccount fixed = new FixedTermDeposit(1000, 12);

        savings.deposit(200);
        System.out.println("Savings balance after deposit: " + savings.getBalance());

        savings.withdraw(100);
        System.out.println("Savings balance after withdraw: " + savings.getBalance());

        // Aquí está la violación de LSP: tratamos "fixed" como BankAccount
        // y esperamos poder retirar, pero lanza UnsupportedOperationException.
        System.out.println("Attempting withdrawal from fixed-term deposit...");
        fixed.withdraw(50);
        System.out.println("Fixed-term balance after withdraw: " + fixed.getBalance());
    }
}
