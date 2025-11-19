import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        int letters = 0;
        int digits = 0;
        int specials = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letters++;
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else if (!Character.isWhitespace(ch)) {
                specials++;
            }
        }
        System.out.println("Total Letters: " + letters);
        System.out.println("Total Digits: " + digits);
        System.out.println("Total Special Characters: " + specials);
    }
}

