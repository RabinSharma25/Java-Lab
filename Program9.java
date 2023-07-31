/*
Design a class Student and Admin with data members as Name, Dept, Reg No, Address, Sub1, Sub2, Sub3. Implement default constructor, paramaterized constructor and instantiate an object. 
Write method such as Insertdata(), Display() to store 5 records. 

*/

import java.util.Scanner;

class Student {
    String Name;
    String Dept;
    String RegNo;
    String Address;
    String Sub1;
    String Sub2;
    String Sub3;

    Student() {
        System.out.println("New object creation Detected");
    }

    Student(String Nam) {
        Name = Nam;
    }

    void Insertdata(String Nam, String Dep, String Reg, String Add, String S1, String S2, String S3) {
        Name = Nam;
        Dept = Dep;
        RegNo = Reg;
        Address = Add;
        Sub1 = S1;
        Sub2 = S2;
        Sub3 = S3;
    }

    void Display() {
        System.out.println("The name of the sudent is " + Name);
        System.out.println("The Dept of the sudent is " + Dept);
        System.out.println("The RegNo of the sudent is " + RegNo);
        System.out.println("The address of the sudent is " + Address);
        System.out.println("The Subject 1 offered by  the sudent is " + Sub1);
        System.out.println("The Subject 2 offered by  the sudent is " + Sub2);
        System.out.println("The Subject 3 offered by  the sudent is " + Sub3);
    }
}

class Admin {
    public static void main(String args[]) {
        String name;
        String Dept;
        String RegNo;
        String Add;
        String sub1;
        String sub2;
        String sub3;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number of students whose data is to be inserted");
        int size;
        size = inp.nextInt();
        Student stud[] = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the details of Student " + (i + 1));
            stud[i] = new Student();
            System.out.println("Enter the name of the student");
            name = inp.next();
            System.out.println("Enter the Department of the student");
            Dept = inp.next();
            System.out.println("Enter the reg number of the student");
            RegNo = inp.next();
            System.out.println("Enter the address of the student");
            Add = inp.next();
            System.out.println("Enter subject-1 of the student");
            sub1 = inp.next();
            System.out.println("Enter subject-2 of the student");
            sub2 = inp.next();
            System.out.println("Enter subject-3 of the student");
            sub3 = inp.next();
            stud[i].Insertdata(name, Dept, RegNo, Add, sub1, sub2, sub3);
            System.out.println("The details of studnet " + (i + 1) + " is as follows:");
            stud[i].Display();
        }
    }

}