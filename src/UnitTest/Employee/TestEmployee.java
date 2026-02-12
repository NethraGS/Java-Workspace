package UnitTest.Employee;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployee {

    @Test
    public void testProgrammerSalary() {
        Employee e1 = new Employee(101, "Nethra", 30000, "programmer", 2);
        e1.calculateSalary();

        Assert.assertEquals(e1.getSalary(), 33000.0);
    }

    @Test
    public void testDesignerWithExtraLeaves() {
        Employee e2 = new Employee(102, "Iha", 30000, "designer", 35);
        e2.calculateSalary();

        Assert.assertEquals(e2.getSalary(), 32400.0);
    }


    @Test
    public void testNoSalaryDeductionWhenLeavesWithinLimit() {
        Employee e3 = new Employee(103, "Arun", 30000, "designer", 32);
        e3.calculateSalary();
        Assert.assertEquals(e3.getSalary(), 36000.0);
    }
}
