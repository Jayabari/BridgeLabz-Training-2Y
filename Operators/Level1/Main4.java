class Product {
    static double discount = 10.0; // %
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID + ", Name: " + productName + 
                               ", Price: " + price + ", Qty: " + quantity +
                               ", Discount: " + discount + "%");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 2);
        Product p2 = new Product(102, "Phone", 20000, 5);

        p1.displayProduct();
        p2.displayProduct();

        Product.updateDiscount(15.0);
        p1.displayProduct();
    }
}

