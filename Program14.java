/*
Program - 14
Aim: Create a class student with the following data members name, roll_no, mark1, marks2 and method to display data.Entends class result from student which implements an interface exams with a method to calculate the percentage and display the student details with percentage. Demonstrate
the concept of multiple inheritence.*/


import java.util.Scanner;

class student
{
	String name;
	int roll_no;
	int marks1;
	int marks2;
	Scanner input = new Scanner(System.in);

	void insert()
	{
		System.out.print("Enter Name:");
		name=input.nextLine();
		System.out.print("Enter Roll No:");
		roll_no=input.nextInt();
		System.out.print("Enter Marks1 out of 50:");
		marks1=input.nextInt();
		System.out.print("Enter Marks2 out of 50:");
		marks2=input.nextInt();
	}

	void display()
	{
		System.out.println("\n***RESULT***");
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+roll_no);
		System.out.println("Marks1:"+marks1);
		System.out.println("Marks2:"+marks2);
	}
}

interface exams
{	
	
	public void calculate();
	public void displayp();
}

class result extends student implements exams
{
	int percent;
	public void calculate()
	{
		percent = (super.marks1 + super.marks2);
	}

	public void displayp()
	{
		System.out.println("The percentage Mr "+super.name+" achieved is "+percent+"%.");
	}
}

class driver
{
	public static void main(String args[])
	{
		result r = new result();		
		r.insert();
		r.calculate();
		r.display();
		r.displayp();
		
	}
}
