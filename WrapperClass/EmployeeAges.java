import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {25, 42, 30, 19, 55, 28};
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : ages) {
            ageList.add(age);
        }
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);
        System.out.println("Youngest Age = " + youngest);
        System.out.println("Oldest Age = " + oldest);
    }
}

