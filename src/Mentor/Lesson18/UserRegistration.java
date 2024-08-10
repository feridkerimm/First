package Mentor.Lesson18;

public class UserRegistration {
    String userName;
    String password;

    public UserRegistration(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static void registerUser(String userName, String password) throws UserRegistrationException {

        if (userName == null || userName.length() < 8 ){
            throw new UserRegistrationException("Username must be at least 4 characters. ");
        }

        if (password == null || password.length() < 8 || password.equals(password.toLowerCase())){
            throw new UserRegistrationException("Password must be at least 8 character and it has to have minimum an upperCase");
        }

        System.out.println("User registered successfully! ");


    }




}
