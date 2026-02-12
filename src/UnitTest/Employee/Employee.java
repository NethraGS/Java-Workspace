package UnitTest.Employee;

public class Employee {

    int id;
    String name;
    double salary;
    String designation;
    int leavesTaken;

    static final int TOTAL_ALLOWED_LEAVES = 32;

    public Employee(int id, String name, double salary, String designation, int leavesTaken) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.leavesTaken = leavesTaken;
    }

    public void calculateSalary() {

        if (designation.equalsIgnoreCase("programmer")) {
            salary += salary * 0.10;
        }
        else if (designation.equalsIgnoreCase("designer")) {
            salary += salary * 0.20;
        }

        if (leavesTaken > TOTAL_ALLOWED_LEAVES) {
            int extraLeaves = leavesTaken - TOTAL_ALLOWED_LEAVES;
            double perDaySalary = salary / 30;
            salary -= extraLeaves * perDaySalary;
        }
    }

    public double getSalary() {
        return salary;
    }
}
