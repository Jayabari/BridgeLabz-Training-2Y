import java.util.*;

class Product {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public Product(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getCost() {
        return pricePerUnit * quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class Customer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0;
        for (Product p : customer.getProducts()) {
            total += p.getCost();
        }
        return total;
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        customer.addProduct(new Product("Apples", 3.0, 2)); // 2kg @ $3
        customer.addProduct(new Product("Milk", 2.0, 1));   // 1 liter @ $2

        BillGenerator billGen = new BillGenerator();
        double total = billGen.calculateTotal(customer);

        System.out.println("Customer: " + customer.getName());
        for (Product p : customer.getProducts()) {
            System.out.println(p.getName() + " (" + p.getQuantity() + " units @ $" 
                               + p.getPricePerUnit() + ") = $" + p.getCost());
        }
        System.out.println("Total Bill: $" + total);
    }
}

