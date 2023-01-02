/*Java Program to create buttons and arrange in conatiner using Flow Layout Manager*/
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
class Day32
{
    //Driver function
    public static void main(String args[])
    {
	//Create a frame
	JFrame frame = new JFrame("Buttons");
	frame.setSize(500,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Set the layout of frame as right aligned flow layout
	frame.setLayout(new FlowLayout(FlowLayout.CENTER));
	//Create 3 push buttons
	JButton[] button = new JButton[3];
	for(int i=0;i<3;i++)
	{
	    button[i]=new JButton("Button "+(i+1));
	    frame.add(button[i]);
	}
	//Display the frame
	frame.setVisible(true);
    }
}