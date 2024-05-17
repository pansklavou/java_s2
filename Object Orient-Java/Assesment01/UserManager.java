package Assesment01;

import java.util.ArrayList;
public class UserManager {
    private static final ArrayList<User> users = new ArrayList<>();


    public static boolean registerUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("User exists.");
                return false;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);

        return true;
    }

    public static boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }else {}
        }
        return false;
    }
}
