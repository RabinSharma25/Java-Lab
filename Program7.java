/*
 Program - 7
 Aim: Design a calculator using java programming language, which can perform mathematical operations in two integers.
*/

import java.util.Scanner;

class Program7 {
    public static void main(String args[]) {

        int num1, num2, x;
        System.out.print("\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator Initialized ...... ..... .... ");
        System.out.println("This Calculator can perform +,-,*,/ on any two integers");
        while (true) {
            System.out.println("Which operation do you want to perform?");
            System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division \n 5. Exit");
            x = input.nextInt();
            if (x == 5)
                break;
            System.out.println("Enter number 1:");
            num1 = input.nextInt();
            System.out.println("Enter number 2:");
            num2 = input.nextInt();

            switch (x) {
                case 1:
                    System.out.println("The result of " + num1 + " + " + num2 + " is : " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("The result of " + num1 + " - " + num2 + " is : " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("The result of " + num1 + " x " + num2 + " is : " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("The result of " + num1 + " / " + num2 + " is : " + (num1 / num2));
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }
        input.close();
        System.out.println("Thank You");

    }
}