interface Refuelable {
    void refuel();
}

class VehicleX {
    int maxSpeed;
    String model;

    VehicleX(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

class ElectricVehicle extends VehicleX {
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    void charge() {
        System.out.println(model + " is charging...");
    }
}

class PetrolVehicle extends VehicleX implements Refuelable {
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println(model + " is refueling with petrol...");
    }
}

public class HybridVehicleTest {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

        ev.charge();
        pv.refuel();
    }
}

