class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account | Balance: " + balance + " | Interest: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account | Balance: " + balance + " | Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit | Balance: " + balance + " | Maturity: " + maturityPeriod + " years");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount a1 = new SavingsAccount(1001, 50000, 5.5);
        BankAccount a2 = new CheckingAccount(1002, 30000, 20000);
        BankAccount a3 = new FixedDepositAccount(1003, 100000, 5);

        ((SavingsAccount)a1).displayAccountType();
        ((CheckingAccount)a2).displayAccountType();
        ((FixedDepositAccount)a3).displayAccountType();
    }
}

