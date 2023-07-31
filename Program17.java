/*
Program - 17
Aim: Write a test program for creating threads using thread class
 1) Extending from the thread class
 2) Using Runnable interface
*/

// Using Runnable interface 

class A implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("ODD THREAD: " + i);
            // sleep(1000);
        }
    }
}

public class Program17 {
    public static void main(String args[]) {
        A obj = new A();
        Thread t = new Thread(obj);
        t.start();
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("EVEN THREAD: " + i);
        }
    }
}
