/*
Program - 11
Aim: Design a class Rectangle with the following data members 
Length
Breadth
Write a method Area() using method overloading

*/

class Rectangle {

    double Length;
    double Breadth;

    void Area(int l, int b) {
        Length = l;
        Breadth = b;
        System.out.println("Overloaded -- 1");
        System.out.println("The area of the rectangle is " + (Length * Breadth));
    }

    void Area(double l, double b) {
        Length = l;
        Breadth = b;
        System.out.println("Overloaded -- 2");
        System.out.println("The area of the rectangle is " + (Length * Breadth));
    }

    void Area(int l, double b) {
        Length = l;
        Breadth = b;
        System.out.println("Overloaded -- 3");
        System.out.println("The area of the rectangle is " + (Length * Breadth));
    }

    void Area(double l, int b) {
        Length = l;
        Breadth = b;
        System.out.println("Overloaded -- 4");
        System.out.println("The area of the rectangle is " + (Length * Breadth));
    }

}

class Program11 {

    public static void main(String args[]) {
        Rectangle obj = new Rectangle();
        obj.Area(2, 3);
        obj.Area(2.2, 3.3);
        obj.Area(2, 3.3);
        obj.Area(2.2, 2);

    }
}
