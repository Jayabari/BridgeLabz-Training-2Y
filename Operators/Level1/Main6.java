class Vehicle {
    static double registrationFee = 5000.0;

    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicle() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + 
                               ", Reg No: " + registrationNumber + 
                               ", Fee: " + registrationFee);
        }
    }
}

public class Main6 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rohit", "Car", "MH12AB1234");
        Vehicle v2 = new Vehicle("Sneha", "Bike", "MH14XY9876");

        v1.displayVehicle();
        v2.displayVehicle();

        Vehicle.updateRegistrationFee(6000.0);
        v1.displayVehicle();
    }
}

