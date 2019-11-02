
/*
 * Stefon Miller
 * PD 2
 * This program converts watts to other things
 */
//Import statements
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;
import java.io.*;
public class WattConverter extends JFrame
{
	private JPanel panel1;	//The 1st pannel
	private JPanel panel2;	//The 2nd pannel
	private JPanel panel3;	//The 3rd pannel
	private JPanel panel4;	//The 4th pannel
	private JPanel panel5;	//Combined panel of 2 and 3
	private JLabel output;	// The units the user wants converted to
	private JLabel desc;	//The description of the program
	private JTextField input;	//What the user inputs
	private JLabel picture;	//The awesome picture
	private JRadioButton kiloWatts;	//The converted kilowatts
	private JRadioButton gigaWatts;	//The converted gigawatts
	private JRadioButton horsePower;	//The converted horsepower
	private JRadioButton camelPower;	//The converted camelPower
	private JRadioButton mrsSchaefferPower;	//The converted mrsSchaefferPower
	private JRadioButton desantisPower;	//The converted desantisPower
	private ButtonGroup conversion;	//The button group of converable units
	String watts;	//Watts entered
	String units = "";	//Units converted to 
	double convertedDouble;	//Actual converted number
	
	public WattConverter()
	{
		//Height and width of the window
		final int HEIGHT = 300;
		final int LENGTH = 900; 
		
		//Sets the title
		setTitle("Watt converter");
				
		//Sets the panel size
		setSize(LENGTH, HEIGHT);
				
		//makes exiting out possible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Sets the layout 
		setLayout(new BorderLayout());
		
		//Build panels 1,4,and5 and add them to their respective regions
		buildPanel1();
		add(panel1, BorderLayout.WEST);
		buildPanel4();
		
		buildPanel5();
		add(panel5, BorderLayout.CENTER);
		
		//make it visible
		setVisible(true);
	}
	
	/**
	 * Creates panel1
	 */
	private void buildPanel1()
	{
		//Creates the panel
		panel1 = new JPanel();
		//Creates the label
		picture = new JLabel();
		//Sets the image to the icon 
		ImageIcon image = new ImageIcon("index.jpg");
		//Set the layout to a 1x1 grid
		panel1.setLayout(new GridLayout(1,1));
		//Puts the image in a label so java can read it
		picture = new JLabel(image);
		//Add the picture label
		panel1.add(picture);
		//Adds panel1
		add(panel1);
	}
	/**
	 * Creates panel2
	 */
	private void buildPanel2()
	{
		//Creates the panel
		panel2 = new JPanel();
		//Creates the description
		desc = new JLabel("Please enter the number of watts");
		//Creates the text field
		input = new JTextField(16);
		//Adds the text field
		panel2.add(input);
		//Adds the description
		panel2.add(desc);
		//Adds panel2
		add(panel2);
	}
	/**
	 * Creates panel3
	 */
	private void buildPanel3()
	{
		//Creates panel3
		panel3 = new JPanel();
		//Creates the buttons
		gigaWatts = new JRadioButton("Gigawatts");
		horsePower = new JRadioButton("HorsePower");
		camelPower = new JRadioButton("CamelPower");
		mrsSchaefferPower = new JRadioButton("Mrs. Schaeffer Power");
		desantisPower = new JRadioButton("Fran Desantis Power");
		//Creates a border around the buttons
		panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 6));
		//Creates a 6x1 grid
		panel3.setLayout(new GridLayout(6,1));
		//Create the button group and add all the buttons to it
		conversion = new ButtonGroup();
		conversion.add(gigaWatts);
		conversion.add(horsePower);
		conversion.add(camelPower);
		conversion.add(mrsSchaefferPower);
		conversion.add(desantisPower);
		
		//Add listeners to all the buttons
		gigaWatts.addActionListener(new listener());
		horsePower.addActionListener(new listener());
		camelPower.addActionListener(new listener());
		mrsSchaefferPower.addActionListener(new listener());
		desantisPower.addActionListener(new listener());
		
		//Add the buttons and the panel
		panel3.add(gigaWatts);
		panel3.add(horsePower);
		panel3.add(camelPower);
		panel3.add(mrsSchaefferPower);
		panel3.add(desantisPower);
		add (panel3);
		
	}
	/**
	 * Creates something that doesn't like to work
	 * @author Stefon
	 *
	 */
	private class listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Get the inputted text
			watts = input.getText();
			
			if(gigaWatts.isSelected())
			{
				//Set units to gigawatts
				units = "gigawatts";
				//Convert the text to a double and convert it
				convertedDouble = Double.parseDouble(watts) * 1000000000;
			}
			else if(horsePower.isSelected())
			{
				//Set units to horsepower
				units = "horsepower";
				//Convert the text to a double and convert it
				convertedDouble = Double.parseDouble(watts) / 746;	
			}
			else if(camelPower.isSelected())
			{
				//Set units to camel power
				units = "camelpower";
				//Convert the text to a double and convert it
				convertedDouble = Double.parseDouble(watts) / 945;
			}
			else if(mrsSchaefferPower.isSelected())
			{
				//Set units to mrs schaeffer power
				units = "schaefferpower";
				//Convert the text to a double and convert it
				convertedDouble = Double.parseDouble(watts) * 4;	
			}
			else if(desantisPower.isSelected())
			{
				//Set units to desantis power
				units = "desantispower";
				//Convert the text to a double and convert it
				convertedDouble = Double.parseDouble(watts) / 9999999;	
			}
			else
			{
				//if nothing is selected, output that something's wrong
				JOptionPane.showMessageDialog(null, "Please check something");
			}
			
			
		}
		public JLabel buildPanel4()
		{
			//Create panel4
			panel4 = new JPanel();
			output = new JLabel("Your converted value is " + convertedDouble +
					units);
			panel4.add(output);
			add(panel4, BorderLayout.SOUTH);
			return output;
		}
	}
	/**
	 * Build a panel telling the person the conversion junk
	 */
	public JLabel buildPanel4()
	{
		//Create panel4
		panel4 = new JPanel();
		output = new JLabel("Your converted value is " + convertedDouble +
				units);
		panel4.add(output);
		add(panel4, BorderLayout.SOUTH);
		return output;
	}
	/**
	 * Creates the 5th panel to nest panels 2 and 3
	 */
	private void buildPanel5()
	{
		//Create panel5
		panel5 = new JPanel();
		panel5.setLayout(new GridLayout(2,1));
		//Set the layout to a border layout
		panel5.setLayout(new BorderLayout());
		//Build panel2 and add it to the north quintant
		buildPanel2();
		panel5.add(panel2, BorderLayout.NORTH);
		//Build panel3 and add it to the south quintant
		buildPanel3();
		panel5.add(panel3, BorderLayout.SOUTH);
		//Add panel5
		add(panel5);
		
	}
	
	
	public static void main(String[] args)
	{
		//Demos the program
		new WattConverter();
	}
		
	
}

	
