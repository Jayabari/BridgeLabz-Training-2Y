import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();
        String msg = "Hello World";
        int len = getLength.apply(msg);
        System.out.println("Message length: " + len);
        if (len > 10)
            System.out.println("Message too long");
        else
            System.out.println("Message OK");
    }
}

