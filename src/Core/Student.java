package Core;

public class Student {
    int id;
    String name;
    Course c1;

    public Student(int id,String name,Course c1) {
        this.id = id;
        this.name=name;
        this.c1=c1;

    }

    public static void main(String[] args) {
        Course c1=new Course(100,"Java");
        c1.display();
    }
}
