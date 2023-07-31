/*
Program - 15
Aim: Write a java program to catch the following pre defined exception:
1. Arithmeic Exception
2. Array Index out of bound exception
3. Number format Exception
Demonstrate exception handling with the try catch finally clause.*/


import java.util.Scanner;

class exercise
{
	

	public static void main(String args[])
	{
		int a;
		int b;
		int[] arr= new int[5];
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("\n\n***Array Index out of Bound Exception***");	
		try
		{
			
			System.out.println("Enter five elements of the array:");
			for(int i=0;i<6;i++)
			{	
				arr[i]=input.nextInt();
			}
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
            System.out.println("Exception caught for Array index out of bound.");
        	}
		finally
		{
			System.out.println("The elements of array are:");
			for(int i=0;i<5;i++)
			{	
				System.out.println(arr[i]);
			}
			
			
			System.out.println("\n\n***Arithmetic Exception***");
			try
			{
				a=arr[2];
				b=a/0;
			}
			catch(ArithmeticException ex)
			{
            		System.out.println("Exception caught in for Arithmetic Exception");
			}
			finally
			{
				System.out.println("\n\n***Number Format Exception***");	

				try
				{
					Integer i = new Integer(" HEHE ");
					//int x=Integer.parseInt("hahfhjshf");
				}
				catch(NumberFormatException exp)
				{
            		System.out.println("Exception caught in for Number format Exception");
	
				}
			}
				
		}
	}

}
