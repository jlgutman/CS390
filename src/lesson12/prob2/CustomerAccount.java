package lesson12.prob2;
public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            throw new IllegalArgumentException("Illegal value, amount should be greater than 0");
        }
        //return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            if (balance < 100) {
                throw new AccountException("Low balance warning! Balance cannot go below $100.");
            }
            return true;
        } else {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        }
        //return false;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "cusName='" + cusName + '\'' +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
