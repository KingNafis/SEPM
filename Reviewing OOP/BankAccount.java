// File: BankAccount.java
// Demonstrates Encapsulation in OOP

public class BankAccount {
    // Private fields to restrict direct access
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter for account number (no setter to prevent changing account number)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance (no direct setter to prevent illegal balance update)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money (adds validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money (adds validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
}
