class BankAccount {
    // Static variable shared by all accounts
    static String bankName = "SBI Bank";
    static int totalAccounts = 0;

    // Final variable (cannot be changed once assigned)
    final int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor using 'this'
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final variable initialized
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Display account details (checking instanceof)
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John", 101, 5000);
        BankAccount acc2 = new BankAccount("Alice", 102, 8000);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}

