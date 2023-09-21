import java.math.BigInteger;

public class MainThreadExample {
    public static void main(String[] args) {
        // Create and start worker threads
        for (int i = 1; i <= 5; i++) {
            WorkerThread worker = new WorkerThread(i);
            worker.start();
        }

        // Wait for user input to terminate program
        System.out.println("Press enter to terminate program.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Terminate worker threads
        WorkerThread.terminate();
    }
}

class WorkerThread extends Thread {
    private int n;
    private static boolean terminate = false;

    public WorkerThread(int n) {
        this.n = n;
    }

    public void run() {
        while (!terminate) {
            BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Factorial of " + n + " is " + result);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void terminate() {
        terminate = true;
    }
}
