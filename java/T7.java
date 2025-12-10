import java.util.ArrayList;

abstract class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    abstract void calculateInterest();
    abstract void withdraw(double amount);
    abstract void deposit(double amount);
}

class SavingsAccount extends Account {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Account Interest: " + interest);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited into Savings: " + amount + ", Balance: " + balance);
    }
}

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
        balance -= amount;
        System.out.println("Withdrawn from Current: " + amount + ", Balance: " + balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited into Current: " + amount + ", Balance: " + balance);
    }
}

class LoanAccount extends Account {
    LoanAccount(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.10;
        System.out.println("Loan Account Interest: " + interest);
    }

    @Override
    void withdraw(double amount) {
        System.out.println("Withdrawals not allowed from Loan Account");
    }

    @Override
    void deposit(double amount) {
        balance -= amount;
        System.out.println("Loan repayment: " + amount + ", Remaining Loan Balance: " + balance);
    }
}

public class T7 {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1000));
        accounts.add(new CurrentAccount(2000));
        accounts.add(new LoanAccount(5000));

        for (Account acc : accounts) {
            acc.calculateInterest();
            acc.deposit(500);
            acc.withdraw(300);
            System.out.println();
        }
    }
}