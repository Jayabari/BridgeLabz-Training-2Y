import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> isHot = t -> t > 40;
        double temp = 42.5;
        if (isHot.test(temp))
            System.out.println("Temperature alert!");
        else
            System.out.println("Temperature normal");
    }
}

