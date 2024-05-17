
package Assesment01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the Quiz App!");
        System.out.println("Choose: 1) Register 2) Login 3) Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.print("Enter username: ");
            String username = scanner.next();
            System.out.print("Enter password: ");
            String password = scanner.next();
            if (UserManager.registerUser(username, password)) {
                System.out.println("Registered successfully.");
            } else {
                System.out.println("Registration failed. User already exists.");
            }
        } else if (choice == 2) {
            System.out.print("Enter username: ");
            String username = scanner.next();
            System.out.print("Enter password: ");
            String password = scanner.next();
            if (UserManager.authenticateUser(username, password)) {
                System.out.println("Welcome: "+ username);
            } else {
                System.out.println("Login failed. Wrong username or password.");
            }
        } else if (choice == 3) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }






        Quiz quiz = new Quiz();
        quiz.play();
    }
}
