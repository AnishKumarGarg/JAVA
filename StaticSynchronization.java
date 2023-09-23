public class StaticSynchronization {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();

        
        thread1.start();
        thread2.start();
    }

    synchronized static void table(int n) {
        for (int i = 0; i < 10; i++) {
            System.out.println(n * i);
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        StaticSynchronization.table(2);
    }
}

class MyThread2 extends Thread {
    public void run() {
        StaticSynchronization.table(10);
    }
}
