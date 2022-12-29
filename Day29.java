/* Java Program to view label of item selected from a Combo Box*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Combo_Box implements ItemListener
{
    static JLabel text;
    static JComboBox<String> box; 
    //Driver function
    public static void main(String args[])
    {
	//Create a frame
	JFrame frame = new JFrame("Combo Box");
	frame.setSize(500,500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLayout(null);
	//Create an object
	Combo_Box obj = new Combo_Box();
	//Create a label	
	text = new JLabel("Select an Item");
	text.setBounds(175,50,200,50);
	frame.add(text);
	//Create an array with countries name
	String countries[]={"Bengaluru","Delhi","Kolkata","Mumbai","bhubneshwar"};
	//Create a Combo Box
	box = new JComboBox<String>(countries);
	box.setBounds(200,200,100,50);
	box.addItemListener(obj);
	frame.add(box);
	//Display the frame
	frame.setVisible(true);
    }
    //Function to view the label of item selected
    public void itemStateChanged(ItemEvent e)
    {
	text.setText("Item Selected : "+box.getSelectedItem());
    }
}