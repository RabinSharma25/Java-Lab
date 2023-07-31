/* 
Program - 8
Aim: Using array write a  program to declare , instantiate an integer array..
*/

import java.util.Scanner;
class Program8{

public static void main(String args[]){

Scanner inp = new Scanner(System.in);
System.out.println("Enter the size of your array");
int size = inp.nextInt();
int arr[] = new int[size];
for(int i=0;i<size;i++){
System.out.println("Enter the value at index " + i);
arr[i] = inp.nextInt();
}
System.out.println("Displaying the elements of the array");
for (int item:arr){
System.out.print( item+ "  ");
}

}

}