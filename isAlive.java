public class isAlive {
    public static void main(String[] args) {
        MyThread thread = new MyThread(20);
        thread.start();
        try {
            thread.join();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        try {
            thread.sleep(400);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(thread.isAlive()); // Should print false
    }
}

class MyThread extends Thread {
    private int age;
    public MyThread(int age) {
        this.age=age;
    }

    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Hello " + age);
            i++;
        }
    }
}
