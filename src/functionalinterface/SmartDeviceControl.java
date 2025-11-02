interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is ON");
    }
    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV is ON");
    }
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

public class SmartDeviceControl {
    public static void main(String[] args) {
        SmartDevice l = new Light();
        SmartDevice a = new AC();
        SmartDevice t = new TV();
        l.turnOn();
        a.turnOn();
        t.turnOn();
        l.turnOff();
        a.turnOff();
        t.turnOff();
    }
}
