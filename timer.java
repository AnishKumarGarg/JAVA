// Create a program that simulates a countdown timer using threads. The main thread should start a separate thread that counts down from 10 to 1, printing each number with a one-second delay between them. Once the countdown is complete, the main thread should print "Timer complete!".

public class timer {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Timer complete!");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Benchooooo....Exception aa");
            }
        }
    }
}
