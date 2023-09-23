// Implement a program where the main thread creates multiple worker threads. The worker threads should perform some time-consuming tasks, such as calculating factorial or Fibonacci series, in the background. The main thread should be a daemon thread that waits for a specific condition (e.g., user input) and terminates the program when that condition is met.

import java.util.*;
public class WorkerThreads {
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MyThread thread = new MyThread(3);
        thread.start(); 

        Thread mainThread=Thread.currentThread(); 
        mainThread.setDaemon(true);
        
        System.out.println("Press any key to exit");
        scanner.nextLine();

        System.exit(0);

        scanner.close();
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

class MyThread extends Thread {
    private int n;

    public MyThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Factorial of " + n + " is: " + WorkerThreads.factorial(n));
    }
}
