public class ECommerceDemo {

    // Product as a static nested class so everything stays in one file
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }
    }

    // Order as a static nested class; uses fully-qualified java.util types to avoid import issues
    static class Order {
        private java.util.List<Product> products = new java.util.ArrayList<>();

        public void addProduct(Product p) {
            products.add(p);
        }

        public double getTotal() {
            double total = 0;
            for (Product p : products) total += p.getPrice();
            return total;
        }

        public void showOrderDetails() {
            System.out.println("Order Details:");
            for (Product p : products) {
                System.out.println(" - " + p.getName() + " ($" + p.getPrice() + ")");
            }
            System.out.println("Total: $" + getTotal());
        }
    }

    // Customer as a static nested class
    static class Customer {
        private String name;

        public Customer(String name) {
            this.name = name;
        }

        public void placeOrder(Order o) {
            System.out.println("\nCustomer: " + name);
            o.showOrderDetails();
        }
    }

    // main method
    public static void main(String[] args) {
        Customer c = new Customer("John");

        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Mouse", 20);
        Product p3 = new Product("Keyboard", 50);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        c.placeOrder(order);
    }
}

