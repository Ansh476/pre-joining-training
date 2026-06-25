package multithreading;

public class Counter {

    int count = 0;

    volatile boolean running = true;

    public synchronized void increment() {
        count++;
    }

    // synchronized block
    public void incrementUsingBlock() {
        synchronized(this) {
            count++;
        }
    }
}