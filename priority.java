public class priority {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Anish");
        MyThread thread2 = new MyThread("Aanya");
        MyThread thread3 = new MyThread("Sandeep");
        MyThread thread4 = new MyThread("Manju");

        thread1.setPriority(MyThread.MAX_PRIORITY); // Now Anish will print first
        thread2.setPriority(MyThread.MIN_PRIORITY);
        thread3.setPriority(MyThread.MIN_PRIORITY);
        thread4.setPriority(MyThread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);   // Parent constructor mein kuch pass karna ho super se hota hai
    }

    public void run() {   // Here run is not a member of Thread class, It is just another function made by you....You can name this method anything you like...Hence you dont need to give @Override
        System.out.println("Hello " + this.getName());
    }
}

// class MyThr1 extends Thread{
// public MyThr1(String name){
// super(name);
// }
// public void run(){
// int i = 34;

// while(true){
// // System.out.println("I am a thread");
// System.out.println("Thank you: " + this.getName());
// }

// }
// }

// public class priority {
// public static void main(String[] args) {
// // Ready Queue: T1 T2 T3 T4 T5
// MyThr1 t1 = new MyThr1("Harry1");
// MyThr1 t2 = new MyThr1("Harry2");
// MyThr1 t3 = new MyThr1("Harry3");
// MyThr1 t4 = new MyThr1("Harry4");
// MyThr1 t5 = new MyThr1("Harry5 (most Important)");
// t5.setPriority(Thread.MAX_PRIORITY);
// t1.setPriority(Thread.MIN_PRIORITY);
// t2.setPriority(Thread.MIN_PRIORITY);
// t3.setPriority(Thread.MIN_PRIORITY);
// t4.setPriority(Thread.MIN_PRIORITY);
// t5.setPriority(Thread.MIN_PRIORITY);

// t1.start();
// t2.start();
// t3.start();
// t4.start();
// t5.start();

// }
// }
