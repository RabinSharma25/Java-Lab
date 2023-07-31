/*
Program - 10
Aim: Design a class employee with the following data members 
name -- string
id -- int
Address - stirng 
write a java program to define instance metod for setting and retriving value of instance variables  and instantiate its object.
*/

import java.util.Scanner;

class Employee {

    String Name;
    int Id;
    String Address;

    void SetValue(String nam, int id, String add) {
        Name = nam;
        Id = id;
        Address = add;
    }

    void GetValue() {
        System.out.println();
        System.out.println("Employee Details");
        System.out.println("The name of the employee is " + Name);
        System.out.println("The Id of the employee is " + Id);
        System.out.println("The Address of the employee is " + Address);
    }

}

class Program10 {

    public static void main(String args[]) {
        Employee e1 = new Employee();
        Scanner inp = new Scanner(System.in);
        String Name;
        int Id;
        String Address;

        System.out.println("Enter the name of the employee");
        Name = inp.next();
        System.out.println("Enter the ID of the employee");
        Id = inp.nextInt();
        System.out.println("Enter the Address of the employee");
        Address = inp.next();
        inp.close();
        e1.SetValue(Name, Id, Address);
        e1.GetValue();
    }
}
