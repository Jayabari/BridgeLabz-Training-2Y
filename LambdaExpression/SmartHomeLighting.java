// Lambda Example 1: Smart Home Lighting
import java.util.Scanner;

// Step 1: Create a functional interface (only one abstract method)
interface LightAction {
    void activate(); // single abstract method
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter trigger (motion/time/voice): ");
        String trigger = sc.nextLine().toLowerCase();
        LightAction motion = () -> System.out.println("Lights turned ON due to motion detection!");
        LightAction time = () -> System.out.println("Lights turned ON as it’s evening!");
        LightAction voice = () -> System.out.println("Lights turned ON by voice command!");
        LightAction action;
        if (trigger.equals("motion")) {
            action = motion;
        } else if (trigger.equals("time")) {
            action = time;
        } else if (trigger.equals("voice")) {
            action = voice;
        } else {
            action = () -> System.out.println("Invalid trigger entered!");
        }
        action.activate();

        sc.close();
    }
}
