class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter-like methods for controlled updates
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Madhunisha", 5000);
        acc.deposit(1000);
        acc.withdraw(2000);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
