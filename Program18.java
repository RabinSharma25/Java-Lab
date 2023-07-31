/* 
Program - 18
Aim: Develop an applet program to change the foreground and background colours and to display the message in the order in which the init() function, start() function, and the paint() function are called.
Use two different approach an applet.
*/

import java.applet.Applet;
import java.awt.Graphics;

public class Program18 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Hello",550,550);
	}	
}

/*
<applet code = "aplt.class" width = "300" height = "300">
</applet>
*/