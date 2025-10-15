import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jaya", "Ananshi", "Aisha");
        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());
        System.out.println("Uppercase Names:");
        upperNames.forEach(System.out::println);
    }
}
