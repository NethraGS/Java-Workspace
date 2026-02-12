package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        ExecutorService eServe1 = Executors.newFixedThreadPool(10);

        // Runnable Task
        Future<?> futu1 = eServe1.submit(() -> {
            System.out.println("I make a triangle, I am a Runnable");

            for (int i = 1; i <= 4; i++) {
                for (int j = 4; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("Runnable ending....");
        });

        // Callable Task
        Future<Integer> futu2 = eServe1.submit(() -> {
            System.out.println("I printed a summation, I'm Callable");
            return 100 + 100 + 500 + 23;
        });

        try {
            Integer result = futu2.get(5, TimeUnit.SECONDS);
            System.out.println("The summation is " + result);

            someFunnyTask(" have fun");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            eServe1.shutdown(); // Proper shutdown
        }
    }

    public static void someFunnyTask(String funnyname) {
        System.out.println("I'm not ExecutorService " + funnyname);
    }
}
