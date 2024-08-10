package Mentor.Lesson17;
public class AuthenticateManagement {
    private static final String username1 = "feridkerimm";
    private static final String password1 = "Password123";

    public static void login(String username, String password) throws AuthenticationException {
        if (!username1.equals(username) || !password1.equals(password)) {
            throw new AuthenticationException("Invalid username or password.");
        }
    }
}

