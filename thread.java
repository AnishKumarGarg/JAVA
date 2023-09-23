public class thread {
    public static void main(String[] args) {
        Object lock = new Object(); // shared object for synchronization

        Thread threadA = new Thread(() -> {
            synchronized (lock) {
                for (int i = 2; i <= 10; i += 2) {
                    System.out.println("Thread A: " + i);
                    lock.notify(); // notify waiting thread
                    try {
                        lock.wait(); // wait for other thread to print
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify(); // notify waiting thread to exit
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 9; i += 2) {
                    System.out.println("Thread B: " + i);
                    lock.notify(); // notify waiting thread
                    try {
                        lock.wait(); // wait for other thread to print
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify(); // notify waiting thread to exit
            }
        });

        threadA.start(); // start Thread A
        threadB.start(); // start Thread B

        try {
            threadA.join(); // wait for Thread A to finish
            threadB.join(); // wait for Thread B to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
