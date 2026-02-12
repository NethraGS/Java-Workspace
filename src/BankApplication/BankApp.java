package BankApplication;

import java.util.Scanner;
import java.util.ArrayList;


public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();
        Menu menu = new Menu();

        ArrayList<User> users = new ArrayList<>();


        users.add(new User("nethra", "nethra@gmail.com", "1234", 2000));
        users.add(new User("admin", "admin@gmail.com", "admin", 5000));

        System.out.println("-Banking System-");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        User currentUser = service.login(users, username, password);

        if (currentUser == null) {
            System.out.println("Invalid Credentials!");
            sc.close();
            return;
        }

        System.out.println("Login Successful!");

        int choice;

        do {
            menu.display();
            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        service.deposit(currentUser, depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        service.withdraw(currentUser, withdrawAmount);
                        break;

                    case 3:
                        service.checkBalance(currentUser);
                        break;

                    case 4:
                        sc.nextLine();
                        System.out.print("Enter new email: ");
                        String email = sc.nextLine();
                        service.editProfile(currentUser, email);
                        break;

                    case 5:
                        sc.nextLine();
                        System.out.print("Enter old password: ");
                        String oldPass = sc.nextLine();
                        System.out.print("Enter new password: ");
                        String newPass = sc.nextLine();
                        service.changePassword(currentUser, oldPass, newPass);
                        break;

                    case 6:
                        System.out.println("Logged out successfully!");
                        break;

                    default:
                        System.out.println("Invalid Option.");
                }

            } catch (MinimumBalanceException e) {
                System.out.println(e.getMessage());
            }

        } while (choice != 6);

        sc.close();
    }
}
//insufficient balance should be shown if withdrawal is greater than balance and also should be minimum balance 500