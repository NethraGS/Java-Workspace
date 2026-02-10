package Basic;

public class Course {
    int id;
    String title;

    public Course(int id,String title) {
        this.id = id;
        this.title = title;
    }
    public void display(){
        System.out.println("The title is"+title);
    }
}
