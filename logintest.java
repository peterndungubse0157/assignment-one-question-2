// Test file for LoginSystem
public class LoginTest {

    public static void main(String[] args) {

        // Test case 1: Correct credentials
        System.out.println(LoginSystem.login("admin", "1234"));

        // Test case 2: Wrong username
        System.out.println(LoginSystem.login("user", "1234"));

        // Test case 3: Wrong password
        System.out.println(LoginSystem.login("admin", "0000"));
    }
}
