// Write a Java program that creates two threads, Thread A and Thread B. Thread A should print even numbers from 1 to 10, and Thread B should print odd numbers from 1 to 10. The output should be synchronized and in the correct order.

public class Odd_even {
    public static void main(String[] args) {
        MyThead1 thread1 = new MyThead1();
        MyThread2 thread2 = new MyThread2();
        thread1.start();
        thread2.start();
    }

    synchronized static void Even() {
        for (int i = 0; i < 11; i += 2) {
            System.out.println(i);
        }
    }

    synchronized static void Odd() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }
}

class MyThead1 extends Thread {
    public void run() {
        Odd_even.Even();
    }
}

class MyThread2 extends Thread {
    public void run() {
        Odd_even.Odd();
    }

}
