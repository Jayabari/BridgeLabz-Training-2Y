class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, "John", 1000, 5.0);
        sa.deposit(500);
        sa.display();
    }
}
