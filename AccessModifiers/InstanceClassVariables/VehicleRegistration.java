class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(1500);
        Vehicle v2 = new Vehicle("Alice", "Bike");
        v2.displayVehicleDetails();
    }
}

