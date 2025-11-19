import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {25, 42, 30, 19, 55, 28};
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int a : ages) {
            ageList.add(a);
        }
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);
        System.out.println("Youngest Age = " + youngest);
        System.out.println("Oldest Age = " + oldest);
    }
}

