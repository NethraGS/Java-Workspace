package StaticFinal;


public class Test {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.x = 10;
        obj.x++;
        System.out.println(obj.x);
        Sample obj1 = new Sample();
        obj1.x = 20;
        obj1.x++;
        System.out.println(obj1.x);
        Sample obj2 = new Sample();
        obj2.x = 30;
        obj2.x++;
        System.out.println(obj2.x);

        Sample.y = 100;
        System.out.println(Sample.y);
        Sample.y++;
        System.out.println(Sample.y);
        Sample.y++;
        System.out.println(Sample.y);
        Sample.y++;
        System.out.println(Sample.y);

        // Basically the static is a single variable initialization
        // all objects use and modify single variable
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        System.out.println(Employee.count);

        // Final members are initialized in creation
        // or in the constructor if the final variable is inside a class
        // Once initialized that can't be changed
        // Value is only for that particular object
        SampleFinal sf = new SampleFinal();

//        sf.y = 200;
        SampleFinal sf1 = new SampleFinal(200);
        SampleFinal sf2 = new SampleFinal(1000, 4000);

        System.out.println(Math.PI);
    }
}
