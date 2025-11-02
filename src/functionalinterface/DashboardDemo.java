interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery level: 80%");
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }
}

public class DashboardDemo {
    public static void main(String[] args) {
        PetrolCar p = new PetrolCar();
        ElectricCar e = new ElectricCar();
        p.displaySpeed();
        e.displaySpeed();
        e.displayBattery();
    }
}

