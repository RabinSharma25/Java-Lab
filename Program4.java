/*
 Program - 4
 Aim: WAP to convert the temperature from fahrenheit to celcius.
 Algorithm:
 1. Start
 2. Import the required libraries in the program.
 3. Use the Scanner() class and nextfloat() function to take the fahrenheit temperature as input
 4. Use the mathematical relation i.e (far - 32) * 5 / 9, to calculate the temperature in celcius where far is the temperature in fahrenheit
 5. Use the  println() function to display the results.
 6. complile the code
 7. if any errors occur in compilation got to step 1 else goto next step.
 8. Run the code.
 9. Verify the output
 10. If the output is wrong go to step 1 else goto next step.
 11. End
*/

import java.util.Scanner;
class Program4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temperature in Farhenheit :");
        float far = input.nextFloat();
        float cel = (far - 32) * 5 / 9;
        System.out.println("Temperature in Farhenheit :" + far);
        System.out.println("Temperature in Celcius :" + cel);
        input.close();

    }

}
