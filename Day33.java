/*Java Program to create a vertical scrollbar*/
import javax.swing.*;
import java.awt.*;
class Day33
{
	//Driver function
	public static void main(String args[])
	{
		//Create a frame
		JFrame frame=new JFrame("Vertical Scrollbar");
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Create a Scrollbar
		Scrollbar scroll=new Scrollbar();
		scroll.setOrientation(Scrollbar.VERTICAL);
		scroll.setBounds(225,0,50,400);
		scroll.setMaximum(400);
		scroll.setMinimum(0);
		//Set size of scroll
		scroll.setVisibleAmount(30);
		//Add scrollbar to frame
		frame.add(scroll);
		//Display the frame
		frame.setVisible(true);
	}
}
