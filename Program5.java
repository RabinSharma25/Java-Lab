/*  
Program - 5
Aim: Write a program in java to display date and time using Date class in format dd/MM/yy:hh:mm:ss aa
Algorithm:
*/
import java.util.Date;
import java.text.SimpleDateFormat;

class Program5 {
    public static void main(String args[]) {
        System.out.println("Displaying the date and time in the format dd/MM/yy:hh:mm:ss aa using the Date class");
        Date val = new Date();
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yy:hh:mm:ss aa");
        String val2 = d.format(val);
        System.out.println(val2);
    }
}