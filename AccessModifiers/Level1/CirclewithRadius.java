class Circle {
    double radius;

    // Default constructor
    Circle() {
        this(1.0); // constructor chaining
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class CirclewithRadius {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Area (default): " + c1.getArea());
        System.out.println("Area (radius 5): " + c2.getArea());
    }
}

