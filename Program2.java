/*
 Program - 2
 Aim: WAP to show the use of arithmetic operators in Java.
*/

import java.util.Scanner;

class Program2 {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter two integers");
        int a = inp.nextInt();
        int b = inp.nextInt();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("The value of a + b is " + (a + b));
        System.out.println("The value of a - b is " + (a - b));
        System.out.println("The value of a * b is " + (a * b));
        System.out.println("The value of a / b is " + (a / b));
        System.out.println("The value of a % b is " + (a % b));
        inp.close();

    }
}