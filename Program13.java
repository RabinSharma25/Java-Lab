/*
Program - 13 
Aim: Create a class Employee with the following data members such as name, emp_id, basic_salary, prov_fund. 
Method to accept and display data. To calculate salary, Salary = basic_salary + Prov_fund. Extend the 
class Manager from employee with data members house_allowance, travel_alowance and add method to accept
and display data. To calculate salary, Salary = basic_salary + prov_fund + house_allowance + 
travel_allowance. Extend class Director from Manager with data members holiday_allowance, bonus and 
method to accept and dispolay data. To calculate salary, Salary = basic_salary + prov_fund + 
house_allowance + travel_allowance + holidat_allowance + bonus. Create object of Employee, Manager, 
Director and find the total salary of the three. Demonstrate the concept of multilevel inheritance.*/

import java.util.jar.Attributes.Name;
import java.util.Scanner;

class Employee {

    String Name;
    int Emp_Id;
    int Basic_Salary;
    int Prov_Fund;
    int salary = 100;
    int total_sal;

    void SetDataE() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        Name = inp.next();
        System.out.println("Enter the Employee Id: ");
        Emp_Id = inp.nextInt();
        System.out.println("Enter the Basic Salary of the employee:");
        Basic_Salary = inp.nextInt();
        System.out.println("Enter the Provident Fund of the employee: ");
        Prov_Fund = inp.nextInt();
    }

    void GetDataE() {
        salary = Basic_Salary + Prov_Fund;
        System.out.println("The salary of the Employee is " + salary);
        total_sal = salary;

    }

    // salary = basic_salary + prov_fund;
}

class Manager extends Employee {

    int House_Allowance;
    int Travel_Allowance;
    int salary;

    void SetDataM() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the House allowance of the employee:");
        House_Allowance = inp.nextInt();
        System.out.println("Enter the Travel Allowance of the employee: ");
        Travel_Allowance = inp.nextInt();
    }

    void GetDataM() {
        salary = super.salary + House_Allowance + Travel_Allowance;
        System.out.println("The salary of the Employee is " + salary);
        total_sal += salary;

    }

}

class Director extends Manager {

    int Holiday_Allowance;
    int Bonus;
    int salary;
    int total;

    void SetDataD() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Holiday allowance of the employee:");
        Holiday_Allowance = inp.nextInt();
        System.out.println("Enter the Bonus of the  employee: ");
        Bonus = inp.nextInt();
    }

    void GetDataD() {
        salary = super.salary + Holiday_Allowance + Bonus;

        System.out.println("The salary of the Employee is " + salary);
        total_sal += salary;

    }
}

public class Program13 {

    public static void main(String args[]) {

        Director D1 = new Director();

        D1.SetDataE();
        D1.GetDataE();

        D1.SetDataM();
        D1.GetDataM();

        D1.SetDataD();
        D1.GetDataD();

        System.out.println("The Total Salary of the employee, manager and director is " + (D1.total_sal));

    }
    // create object of employee, manager, director and find the total salary of
    // the three, demonstate the concept of multi level inheritance
}
