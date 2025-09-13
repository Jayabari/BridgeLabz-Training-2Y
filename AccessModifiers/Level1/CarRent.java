class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    void displayTotalCost() {
        double total = rentalDays * costPerDay;
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays + " days.");
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Alice", "Honda City", 5);
        cr.displayTotalCost();
    }
}

