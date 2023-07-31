/*  
Program - 6
Aim: Write a program in java to display date using Date class in format dd/MM/yy
*/
import java.util.Date;
import java.text.SimpleDateFormat;

class Program6 {
    public static void main(String args[]) {
        System.out.println("Displaying the date in the format dd/MM/yy using the Date class");
        Date val = new Date();
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yy");
        String val2 = d.format(val);
        System.out.println(val2);
    }
}