package UserDefinedException;

public class Recruitment {
    public void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age, can't join the org");
        }
        else {
            System.out.println("You are hired");
        }
    }
}
