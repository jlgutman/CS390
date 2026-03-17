package lesson12.prob2;

public class TestClass {
    static void main() {
        CustomerAccount account = new CustomerAccount("Anna Smith", "20260316", 500.00);
        System.out.println(account);

        try {
            account.deposit(-200);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            account.withdraw(1000);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Balance after invalid deposit and withdraw: $%.2f%n", account.getBalance());
        try {
            account.withdraw(450);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        System.out.printf("Balance after withdraw warning: $%.2f%n", account.getBalance());

        try {
            account.deposit(300);
            System.out.printf("Deposited $300.00  → Balance: $%.2f%n", account.getBalance());

            account.withdraw(200);
            System.out.printf("Withdrew  $200.00  → Balance: $%.2f%n", account.getBalance());
        } catch (AccountException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.printf("%nFinal Balance: $%.2f%n", account.getBalance());
    }
}
