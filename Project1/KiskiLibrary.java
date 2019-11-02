import javax.swing.JOptionPane;

public class KiskiLibrary 

{
	public static void main(String[] args)
	{
		//Creates the pi book
		Book pi = new Book();
		//Creates the ramen book
		Book ramen = new Book("Ramen Noodle Recipes", "Maruchan");
		pi.addBook();
		pi.removeBook();
		ramen.addBook();
		ramen.removeBook();
		//Sets the Retail Price equal to what the user inputs
		ramen.setRetailPrice(JOptionPane.showInputDialog("Please enter" +
				" the Retail Price "));
		//Sets the # in stock equal to what the user inputs
		ramen.setNoInStock(JOptionPane.showInputDialog("Please enter the"
				+ " Number in stock "));
		//Sets the ISBN equal to what the user inputs
		ramen.setISBN(JOptionPane.showInputDialog("Please enter the"
				+ " ISBN number "));
		//Output the ramen books info
		JOptionPane.showMessageDialog(null, ramen.toString());
		//Sets the number of books added to what the user enters
		ramen.addBooks(JOptionPane.showInputDialog("How many books do you want "
				+ "to add?"));
		//Output the ramen books info
		JOptionPane.showMessageDialog(null, ramen.toString());
		//Sets the number of books removed to what the user inputs
		ramen.removeBooks(JOptionPane.showInputDialog("How many books do you " +
				"want to remove?"));
		//Output the ramen books info
		JOptionPane.showMessageDialog(null, ramen.toString());
		
		//Sets the Title of the book equal to what the user inputs
		pi.setTitle(JOptionPane.showInputDialog("What is the title?"));
		//Sets the author of the book equal to what the user inputs
		pi.setAuthor(JOptionPane.showInputDialog("Who is the author?"));
		//Sets the Retail Price equal to what the user inputs
		pi.setRetailPrice(JOptionPane.showInputDialog("Please enter" +
				" the Retail Price "));
		//Sets the # in stock equal to what the user inputs
		pi.setNoInStock(JOptionPane.showInputDialog("Please enter the"
				+ " Number in stock "));
		//Sets the ISBN equal to what the user inputs
		pi.setISBN(JOptionPane.showInputDialog("Please enter the"
				+ " ISBN number "));
		//Output the pi books info
		JOptionPane.showMessageDialog(null, pi.toString());
		//Sets number of books added to what the user enters
		pi.addBooks(JOptionPane.showInputDialog("How many books do you want "
				+ "to add?"));
		//Output the pi books info
		JOptionPane.showMessageDialog(null, pi.toString());
		//Sets the  number of books removed to what the user enters
		pi.removeBooks(JOptionPane.showInputDialog("How many books do you " +
				"want to remove?"));
		//Output the pi books info
		JOptionPane.showMessageDialog(null, pi.toString());
	}
	
}
