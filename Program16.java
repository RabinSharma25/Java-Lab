/*
Program - 16
Aim: Write a test program for creating threads using thread class
 1) Extending from the thread class
 2) Using Runnable interface
*/

// Extending form the thread class
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("ODD THREAD: " + i);
        }
    }
}

public class Program16 {
    public static void main(String[] args) {
        A obj = new A();
        obj.start();
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("EVEN THREAD: " + i);
        }
    }
}