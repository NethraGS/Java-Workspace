package Thread.sharedData;

public class PrintEvenNum {

    public synchronized void printNum() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
