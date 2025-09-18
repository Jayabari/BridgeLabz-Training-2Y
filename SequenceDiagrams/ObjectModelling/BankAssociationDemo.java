import java.util.*;

class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: $" + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    String bankName;
    List<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer c, double initialDeposit) {
        customers.add(c);
        c.deposit(initialDeposit);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }
}

public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1, 500);
        bank.openAccount(c2, 1000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

