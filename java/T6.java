// Base class
abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
}

// Subclass 1
class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04; // 4% interest
        System.out.println("Savings Account Interest: " + interest);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited into Savings: " + amount + ", New Balance: " + balance);
    }
}

// Subclass 2
class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account has no interest.");
    }

    @Override
    void withdraw(double amount) {
        balance -= amount; // overdraft allowed
        System.out.println("Withdrawn from Current: " + amount + ", New Balance: " + balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited into Current: " + amount + ", New Balance: " + balance);
    }
}

// Subclass 3
class LoanAccount extends Account {
    LoanAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.10; // 10% loan interest
        System.out.println("Loan Account Interest: " + interest);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawals not allowed from Loan Account");
    }

    @Override
    void deposit(double amount) {
        balance -= amount; // paying back loan
        System.out.println("Loan repayment: " + amount + ", Remaining Loan Balance: " + balance);
    }
}

// Main class
public class T6 {
    public static void main(String[] args) {
        Account acc;

        acc = new SavingsAccount(1000);
        acc.calculateInterest();
        acc.deposit(500);
        acc.withdraw(300);

        acc = new CurrentAccount(2000);
        acc.calculateInterest();
        acc.deposit(1000);
        acc.withdraw(2500);

        acc = new LoanAccount(5000);
        acc.calculateInterest();
        acc.deposit(1000);
        acc.withdraw(500);
    }
}