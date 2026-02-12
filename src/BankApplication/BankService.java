package BankApplication;

import java.util.ArrayList;

public class BankService {

    private static final double MIN_BALANCE = 500;

    public User login(ArrayList<User> users, String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) &&
                    user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void deposit(User user, double amount) {
        if (amount > 0) {
            user.setBalance(user.getBalance() + amount);
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw(User user, double amount)
            throws MinimumBalanceException {

        if (amount <= 0) {
            System.out.println("Invalid Amount.");
        }


        else if (amount > user.getBalance()) {
            System.out.println("Insufficient Balance.");
        }

        else if (user.getBalance() - amount < MIN_BALANCE) {
            throw new MinimumBalanceException(
                    "Minimum balance of ₹" + MIN_BALANCE + " must be maintained."
            );
        }


        else {
            user.setBalance(user.getBalance() - amount);
            System.out.println("Withdrawal Successful!");
        }
    }


    public void checkBalance(User user) {
        System.out.println("Current Balance: ₹" + user.getBalance());
    }

    public void editProfile(User user, String email) {
        user.setEmail(email);
        System.out.println("Profile Updated Successfully!");
    }

    public void changePassword(User user, String oldPass, String newPass) {
        if (user.getPassword().equals(oldPass)) {
            user.setPassword(newPass);
            System.out.println("Password Changed Successfully!");
        } else {
            System.out.println("Incorrect Old Password.");
        }
    }
}




