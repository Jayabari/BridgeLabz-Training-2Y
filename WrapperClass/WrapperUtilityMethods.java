public class WrapperUtilityMethods {
    public static void main(String[] args) {

        int num = Integer.parseInt("123");
        double pi = Double.parseDouble("3.14");
        boolean flag = Boolean.parseBoolean("true");
        String binary = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');

        System.out.println("Integer.parseInt(\"123\") = " + num);
        System.out.println("Double.parseDouble(\"3.14\") = " + pi);
        System.out.println("Boolean.parseBoolean(\"true\") = " + flag);
        System.out.println("Integer.toBinaryString(10) = " + binary);
        System.out.println("Character.isDigit('5') = " + isDigit);
        System.out.println("Character.toUpperCase('a') = " + upper);
    }
}

