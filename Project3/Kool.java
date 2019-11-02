/*
 * Stefon Miller
 * PD 2
 * This program makes kool aid
 */
//Import statements
import java.text.DecimalFormat;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import java.io.*;
import java.net.*;

public class Kool extends JFrame
{
	private JPanel panel1;	//Panel1
	private JPanel panel2;	//Panel2
	private JPanel panel3;	//Panel3
	private JPanel panel4;	//Panel4
	private JPanel panel5;	//Panel5
	private JLabel lemonLabel;	//Picture of lemon kool aid
	private JLabel pick;	//Label telling the user to pick a flavor
	private AudioClip sound;
	private JLabel blueLabel;	//Picture of the blue kool aid
	private JLabel redLabel;	//Picture of the best kind of kool aid
	private JLabel grapeLabel;	//Picture of grape kool aid
	private JLabel choice;	//Picture of various kool aids
	private JButton blueRasberry;	//Button containing the blue picture
	private JButton lemon;	//Button containing the lemon picture
	private JButton tropicalPunch;	//Button containing the red picture
	private JButton grape;	//Button containing the grape picture
	private JLabel ohYea;	//The label saying OH YEA
	
	/**
	 * Builds the main panel
	 * @throws MalformedURLException
	 */
	public Kool() throws MalformedURLException
	{
		//Height and width of the window
		final int HEIGHT = 600;
		final int LENGTH = 900; 
		
		//Sets the title
		setTitle("Kool Aid");
				
		//Sets the panel size
		setSize(LENGTH, HEIGHT);
		
	
		//makes exiting out possible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		//Creates the panels and adds them to corresponding panel quintants
		setLayout(new BorderLayout());
		buildPanel1();
		add(panel1, BorderLayout.NORTH);
		buildPanel2();
		add(panel2, BorderLayout.SOUTH);
		buildPanel3();
		add(panel3, BorderLayout.EAST);
		buildPanel4();
		add(panel4, BorderLayout.WEST);
		buildPanel5();
		add(panel5, BorderLayout.CENTER);
		//make it visible
		setVisible(true);
	}
	/**
	 * Creates panel1
	 */
	private void buildPanel1() throws MalformedURLException
	{
		//Create panel1
		panel1 = new JPanel();
		//Create the blue image
		ImageIcon blue = new ImageIcon("blueRasberry.jpg");
		//Set the image to the button
		blueRasberry = new JButton(blue);
		//Set the size of the button to 75x75
		blueRasberry.setPreferredSize(new Dimension(75,75));
		//Add an action listener to the button
		blueRasberry.addActionListener(new jello());
		//Set the panel to the center
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER,8,10));
		//Create a blue border that is 6 thick
		panel1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 6));
		//Add the button to the center of the panel
		panel1.add(blueRasberry, BorderLayout.CENTER);
		//Set the panel background to blue
		panel1.setBackground(Color.BLUE);
		//Add panel1
		add(panel1);
		
	}
	/**
	 * Creates panel2
	 */
	private void buildPanel2() throws MalformedURLException
	{
		//Create panel2
		panel2 = new JPanel();
		//Create the lemon picture
		ImageIcon lemonLabel = new ImageIcon("lemon.jpg");
		//Add the lemon picture to the lemon button
		lemon = new JButton(lemonLabel);
		//Set the dimension of the button to 75x75
		lemon.setPreferredSize(new Dimension(75,75));
		//Add an action listener to lemon
		lemon.addActionListener(new jello());
		//Set the layout to a flow layout centered
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER,8,10));
		//Create a 6 thick yellow border
		panel2.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 6));
		//makes the background yellow
		panel2.setBackground(Color.yellow);
		//Add the button to the center
		panel2.add(lemon, BorderLayout.CENTER);
		//Add panel2
		add(panel2);
	}
	/**
	 * Creates panel3
	 */
	private void buildPanel3() throws MalformedURLException
	{
		//Create panel3
		panel3 = new JPanel();
		//Create the red image
		ImageIcon redLabel = new ImageIcon("tropicalPunch.jpg");
		//Add the image to the button
		tropicalPunch = new JButton(redLabel);
		//Set the dimension of the button to 75x75
		tropicalPunch.setPreferredSize(new Dimension(75,75));
		//Add an action listener to the button
		tropicalPunch.addActionListener(new jello());
		//Create a 6 thick border to the panel
		panel3.setBorder(BorderFactory.createLineBorder(Color.RED, 6));
		//Set the layout to a flow layout centered
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER,8,10));
		//Add tropical punch to the center
		panel3.add(tropicalPunch, BorderLayout.CENTER);
		//Set the BG to red
		panel3.setBackground(Color.RED);
		//Add panel3
		add(panel3);
	}
	private void buildPanel4() throws MalformedURLException
	{
		//Create panel4
		panel4 = new JPanel();
		//Create the grape image
		ImageIcon grapeLabel = new ImageIcon("grape.jpg");
		//Add the image to the button
		grape = new JButton(grapeLabel);
		//Set the dimension to 75x75
		grape.setPreferredSize(new Dimension(75,75));
		//Add an action listener to the button
		grape.addActionListener(new jello());
		//Set the layout to a flow layout centered
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER,8,10));
		//Create a 6 thick purple border
		panel4.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 6));
		//Center the button
		panel4.add(grape, BorderLayout.CENTER);
		//Set the BG to purple
		panel4.setBackground(Color.MAGENTA);
		//add panel4
		add(panel4);
	}
	/**
	 * Create panel5
	 * @throws MalformedURLException
	 */
	private void buildPanel5() throws MalformedURLException
	{
		//Create panel5
		panel5 = new JPanel();
		//Create a JLabel
		pick = new JLabel("Pick your favorite flavor");
		pick.setFont(new Font("", Font.ITALIC, 28));
		pick.setForeground(Color.WHITE);
		//Create the image for the panel
		ImageIcon flavor = new ImageIcon("man.jpg");
		//Add the picture to the JLabel
		choice = new JLabel(flavor);
		//Set the BG to light gray
		panel5.setBackground(Color.BLACK);
		//Set the layout to a flow layout centered
		panel5.setLayout(new GridLayout(1,2));
		//Set the picture to north
		panel5.add(choice, BorderLayout.NORTH);
		//Set the text to south
		panel5.add(pick, BorderLayout.SOUTH);
		//Add panel5
		add(panel5);
	}
	
	/**
	 * Action listener for if the user hits a button
	 * @author stefon.miller
	 *
	 */
	private class jello implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Create the file
			File file = new File("Oh_yea.wav");
			//Construct a URI
			URI uri = file.toURI();
			//Initialize url to nothing
			URL url = null;
			//Set url equal to uri to URL, if not do this random thing
			try {
			url = uri.toURL();
			} catch (MalformedURLException e1) 
			{
			e1.printStackTrace();
			}
			/*
			 * Set the background of the JPanel equal to what flavor they picked
			 * then play the sound
			 */
			if(e.getSource() == grape)
			{
				 UIManager UI=new UIManager();
				 UI.put("OptionPane.background",new ColorUIResource(Color.MAGENTA));
				 UI.put("Panel.background",new ColorUIResource(Color.MAGENTA));
					sound = Applet.newAudioClip(url);
					sound.play();
			}
			else if(e.getSource() == lemon)
			{
				UIManager UI=new UIManager();
				 UI.put("OptionPane.background",new ColorUIResource(Color.YELLOW));
				 UI.put("Panel.background",new ColorUIResource(Color.YELLOW));
					sound = Applet.newAudioClip(url);
					sound.play();
			}
			else if(e.getSource() == tropicalPunch)
			{
				UIManager UI=new UIManager();
				 UI.put("OptionPane.background",new ColorUIResource(Color.RED));
				 UI.put("Panel.background",new ColorUIResource(Color.RED));
					sound = Applet.newAudioClip(url);
					sound.play();
			}
			else if(e.getSource() == blueRasberry)
			{
				UIManager UI=new UIManager();
				 UI.put("OptionPane.background",new ColorUIResource(Color.BLUE));
				 UI.put("Panel.background",new ColorUIResource(Color.BLUE));
					sound = Applet.newAudioClip(url);
					sound.play();
			}
			//Display the dialog box saying oh yea
			JOptionPane.showMessageDialog(null, "OH YEA");
		
		}
	}

	
	public static void main(String[] args) throws MalformedURLException
	{
		//Demo the program
		new Kool(); 
	}
}