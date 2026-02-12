package Thread.sharedData;

public class Test {
    public static void main(String[] args) {

        PrintEvenNum sharedObj = new PrintEvenNum();

        Thread1 t1 = new Thread1(sharedObj);
        Thread2 t2 = new Thread2(sharedObj);

        t1.start();
        t2.start();
    }
}
