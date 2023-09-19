// Create Thread by implementing Runnable interface 

public class CreateThreadByRunnableInterface {
    public static void main(String[] args) {
        Thread1 bullet1 = new Thread1();    // Create a new bullet (new Thread1 object)
        Thread gun1 = new Thread(bullet1);  // Create a new gun(Thread) and load bullet(object) into it 

        Thread2 bullet2 = new Thread2();    // Create a new bullet (new Thread2 object)
        Thread gun2 = new Thread(bullet2);  // Load bullet2 into gun2

        gun1.start();
        gun2.start();

    }
}

class Thread1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am cooking");
            i++;
        }
    }
}

class Thread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("I am chatting");
            i++;
        }
    }
}
