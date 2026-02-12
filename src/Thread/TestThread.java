package Thread;

public class TestThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();  // calls run method
        MyTask my = new MyTask();
        Thread t2 = new Thread(my);
        t2.start();
    }
}
