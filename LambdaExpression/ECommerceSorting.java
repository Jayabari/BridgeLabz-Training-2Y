import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String toString() {
        return name + " | ₹" + price + " | ⭐ " + rating + " | 💸 " + discount + "%";
    }
}

public class ECommerceSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        list.add(new Product("Mobile", 20000, 4.5, 10));
        list.add(new Product("Laptop", 70000, 4.7, 15));
        list.add(new Product("TV", 40000, 4.2, 5));
        System.out.println("Sort by (price/rating/discount): ");
        String option = sc.nextLine().toLowerCase();
        if (option.equals("price")) {
            list.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        } else if (option.equals("rating")) {
            list.sort((p1, p2) -> Double.compare(p2.rating, p1.rating)); 
        } else if (option.equals("discount")) {
            list.sort((p1, p2) -> Double.compare(p2.discount, p1.discount)); 
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        System.out.println("\nSorted Products:");
        for (Product p : list) {
            System.out.println(p);
        }

        sc.close();
    }
}
