/*
 Program - 12
 Aim: Write a progam for Bank which has functionalities like
 CeateAccount()
 Withdraw()
 Deposit()
 DisplayAccount()
 DeleteAccount()
*/

import java.util.Scanner;

class Bank {

    String Name;
    int Acc_No;
    String Type_Of_Acc;
    int Balance;
    Scanner inp = new Scanner(System.in);

    void CreateAccount() {
        System.out.println("Welcome to the Account Creation Wizard");
        System.out.println("Please enter the asked details");
        System.out.println("Enter the name of account holder");
        Name = inp.next();
        System.out.println("Enter the Account number");
        Acc_No = inp.nextInt();
        System.out.println("Enter the Type of Account");
        Type_Of_Acc = inp.next();
        System.out.println("Enter the Balance you want to initially deposit");
        Balance = inp.nextInt();
    }

    void Withdraw() {
        int amount;
        System.out.println("Enter the amount you want to withdraw");
        amount = inp.nextInt();
        if (amount > Balance) {
            System.out.println("Insufficent balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Your account is debited by Rs. " + amount);
            System.out.println("Remaining balance : " + Balance);
        }
    }

    void Deposit() {
        int amount;
        System.out.println("Enter the amount you want to deposit");
        amount = inp.nextInt();
        Balance = Balance + amount;
        System.out.println("Your account is creadited by Rs. " + amount);
        System.out.println("Current balance : " + Balance);

    }

    void DisplayAccount() {
        System.out.println("The Account Details are as follows: ");
        System.out.println("Name of Account Holder: " + Name);
        System.out.println("Account Number: " + Acc_No);
        System.out.println("Account Type: " + Type_Of_Acc);
        System.out.println("Available Balance: " + Balance);
    }

    void DeleteAccount() {
        System.out.println("Account Deleted Successfully");
    }

}

public class Program12 {
    public static void main(String args[]) {

        Bank obj = new Bank();
        Scanner inp = new Scanner(System.in);
        System.out.println("Operation menu:");
        System.out.println("Create Account: 1");
        System.out.println("Deposit: 2");
        System.out.println("Withdraw: 3");
        System.out.println("Display Account: 4");
        System.out.println("Delete Account: 5");
        System.out.println("Exit: 6");
        int flag = 1;
        while (flag == 1) {
            System.out.println("Enter your choice");
            int n;
            n = inp.nextInt();
            switch (n) {
                case 1:
                    obj.CreateAccount();
                    break;
                case 2:
                    obj.Deposit();
                    break;
                case 3:
                    obj.Withdraw();
                    break;
                case 4:
                    obj.DisplayAccount();
                    break;
                case 5:
                    obj.DeleteAccount();
                    break;
                case 6:
                    flag = 0;
                    break;
            }
        }
        System.out.println("Thank You");
    }
}
