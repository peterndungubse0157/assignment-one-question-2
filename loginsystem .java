import java.util.Scanner;

// Simple Login System using Java
public class LoginSystem {

    // Fixed username and password
    static String USERNAME = "admin";
    static String PASSWORD = "1234";

    // Method to validate login
    static boolean login(String user, String pass) {
        return USERNAME.equals(user) && PASSWORD.equals(pass);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String user = sc.nextLine();

            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            if (login(user, pass)) {
                System.out.println("Login Successful");
                break;
            } else {
                attempts--;
                System.out.println("Login Failed. Attempts left: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}
