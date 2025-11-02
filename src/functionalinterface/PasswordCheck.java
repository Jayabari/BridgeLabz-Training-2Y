interface SecurityUtils {
    static boolean isStrong(String password) {
        return password.length() >= 8 && password.matches(".*[0-9].*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String pass = "admin123";
        if (SecurityUtils.isStrong(pass))
            System.out.println("Strong password");
        else
            System.out.println("Weak password");
    }
}

