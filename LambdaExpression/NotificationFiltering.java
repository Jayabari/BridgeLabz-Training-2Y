// Lambda Example 3: Notification Filtering
import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }
}
public class NotificationFiltering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Alert> alerts = Arrays.asList(
                new Alert("Critical", "Oxygen level low!"),
                new Alert("Normal", "Patient stable."),
                new Alert("Critical", "Heart rate too high!"),
                new Alert("Info", "New health report ready.")
        );
        System.out.println("Enter alert type to show (Critical/Normal/Info): ");
        String type = sc.nextLine();
        Predicate<Alert> filterByType = alert -> alert.type.equalsIgnoreCase(type);
        System.out.println("\nShowing " + type + " alerts:");
        alerts.stream()
              .filter(filterByType)
              .forEach(a -> System.out.println(a.type + ": " + a.message));
        sc.close();
    }
}
