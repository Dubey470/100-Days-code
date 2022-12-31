/*Java Program to Display Image when Button is Clicked*/
import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.*;
class Day31 implements ActionListener
{
	static JFrame frame;
        //Driver function
	public static void main(String args[])
	{
		//Create a frame
		frame=new JFrame("Image on Click");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);
		frame.setLayout(new FlowLayout());
		//Create a button
		JButton button=new JButton("Display");
		frame.add(button);
		//Create an object
		Day31 obj=new Day31();
		//Associate ActionListener with button
		button.addActionListener(obj);
		//Display the frame
		frame.setVisible(true);
	}
        //Function to display image
	public void actionPerformed(ActionEvent e)
	{
		//Display Image
		ImageIcon icon=new ImageIcon("2.jpeg");
		JLabel label=new JLabel(icon);
		frame.add(label);
		frame.pack();
		frame.setSize(500,500);
	}
}