package UserDefinedException;

public class Test {
    public static void main(String[] args) throws InvalidAgeException {
        Recruitment r = new Recruitment();
        r.checkEligibility(12);
    }
}
