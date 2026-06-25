package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Thread Class
class MyThread extends Thread {

 public void run() {
     System.out.println("thread class running");
 }
}

//Runnable Interface
class MyTask implements Runnable {

 public void run() {
     System.out.println("runnable interface running");
 }
}

public class MultiThreading {
	public static void main(String[] args)
            throws InterruptedException {

        // Thread Class
        MyThread t1 = new MyThread();
        t1.start();

        // Runnable Interface
        Thread t2 = new Thread(new MyTask());
        t2.start();

        t1.join();
        t2.join();

        Counter c = new Counter();
        Thread t3 = new Thread(() -> {
            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        Thread t4 = new Thread(() -> {

            for(int i = 1; i <= 1000; i++) {
                c.increment();
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("count using sync method = "+ c.count);

        // =========================
        // Synchronized Block
        // =========================

        Counter c2 = new Counter();
        Thread t5 = new Thread(() -> {

            for(int i = 1; i <= 1000; i++) {
                c2.incrementUsingBlock();
            }
        });

        Thread t6 = new Thread(() -> {

            for(int i = 1; i <= 1000; i++) {
                c2.incrementUsingBlock();
            }
        });

        t5.start();
        t6.start();

        t5.join();
        t6.join();

        System.out.println("count using sync block = "+ c2.count);

        // =========================
        // Local Variable Thread Safe
        // =========================

        Runnable localTask = () -> {

            int localCount = 0;

            localCount++;

            System.out.println(Thread.currentThread().getName() + " local count = "+ localCount);
};

        new Thread(localTask).start();
        new Thread(localTask).start();


        // Volatile Variable
        c.running = false;

        System.out.println("running status = "+ c.running);

        // Executor Service
        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        executor.submit(() ->
                System.out.println( "task 1 executed"));

        executor.submit(() ->
                System.out.println("task 2 executed"));

        executor.shutdown();
    }
}
