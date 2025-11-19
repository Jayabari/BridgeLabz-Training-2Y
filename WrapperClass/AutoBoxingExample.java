import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);   
        list.add(20);
        list.add(5);
        list.add(15);
        list.add(5);
        int sum = 0;
        for (Integer num : list) {
            sum += num;   
        }
        System.out.println("Sum of numbers = " + sum);
    }
}

