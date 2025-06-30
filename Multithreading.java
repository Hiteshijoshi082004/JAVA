class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread using Thread class: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread using Runnable interface: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
    System.out.println("HITESHI JOSHI");
    System.out.println("17032249057");
    System.out.println("the concept of  Multithreading by extending thread class and implementing the Runnable interface");
    System.out.println("----------------------------------------------------");
        MyThread t1 = new MyThread();
        t1.start();
        MyRunnable runnable = new MyRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();

        
    }
}