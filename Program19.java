/*
-----------------
|                |
------------------ 
|                |
|                |
|
|
|



*/

import java.awt.*;

import javax.swing.tree.ExpandVetoException;

class Example {

    Example() {
        Frame f = new Frame();
        f.setSize(1000, 1000);
        f.setVisible(true);


        Label l = new Label("Students Name");
        // f.setBounds(80,30,60,20); // x,y,width,height
        l.setBounds(100, 100, 100, 23);
        f.add(l);
        l.setVisible(true);

        TextField t = new TextField();
        t.setBounds(100,130,  100,50);
        f.add(t);
        t.setVisible(true);


        Button b = new Button("Submit");
        b.setBounds(230, 130,75,50);
        f.add(b);
        b.setVisible(true);
        f.setLayout(null);

        // setBounds() // it is a function used to place the components in the frame
    }
}


class Program19{

    public static void main(String args[]){
        Example o1 = new Example();
    }
}