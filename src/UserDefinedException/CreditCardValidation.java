package UserDefinedException;

import java.util.Scanner;

public class CreditCardValidation {


    static void validateCard(String cardNumber) throws InvalidCreditCardException {

        if (cardNumber.length() != 16) {
            throw new InvalidCreditCardException("Invalid Credit Card Number! Must be 16 digits.");
        }

        System.out.println("Credit Card Number is valid");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit card number: ");
        String cardNumber = sc.nextLine();

        try {
            validateCard(cardNumber);
        } catch (InvalidCreditCardException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
