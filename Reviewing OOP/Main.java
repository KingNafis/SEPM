// File: Main.java
// Tests Encapsulation by using the BankAccount class

public class Main {
    public static void main(String[] args) {
        // Creating a bank account object
        BankAccount account = new BankAccount("Ayan", "ACC12345678", 1000.0);

        // Accessing and modifying data only through getters/setters
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Performing deposit and withdrawal using encapsulated methods
        account.deposit(500.0);
        account.withdraw(300.0);

        // Trying invalid operations
        account.withdraw(2000.0);
        account.deposit(-100.0);

        // Updated balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
