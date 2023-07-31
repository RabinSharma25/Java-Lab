
/*
 Program - 3
 Aim: WAP to find the area of a circle.
*/
import java.util.Scanner;

class Program3 {
    public static void main(String args[]) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the radius");
        float a = inp.nextFloat();
        System.out.println("The area of circle is ");
        float b = 3.14f * a * a;
        System.out.println(b);
        inp.close();
    }
}