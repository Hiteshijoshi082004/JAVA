class MyThread extends Thread {
    public MyThread(String name) {
        super(name); 
    }
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " is running, iteration: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted.");
            }
        }
        System.out.println(getName() + " has finished execution.");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        System.out.println("HITESHI JOSHI");
        System.out.println("17032249057");
        System.out.println("The use of thread priorities and different thread  methods available in thread lifecycle" );
        System.out.println("----------------------------------------------------------------------------------------");
        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("High Priority Thread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        // Display priorities
        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());

        // Start threads
        t1.start();
        t2.start();

        // Check if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        // Final check
        System.out.println("Is " + t1.getName() + " alive after join? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive after join? " + t2.isAlive());

        System.out.println("Main thread ends.");
    }
}