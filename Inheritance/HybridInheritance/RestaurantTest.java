interface Worker {
    void performDuties();
}

class PersonX {
    String name;
    int id;

    PersonX(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends PersonX implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Chef " + name + " is cooking food.");
    }
}

class Waiter extends PersonX implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Waiter " + name + " is serving food.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker w1 = new Chef("Raj", 1);
        Worker w2 = new Waiter("Mohan", 2);

        w1.performDuties();
        w2.performDuties();
    }
}

