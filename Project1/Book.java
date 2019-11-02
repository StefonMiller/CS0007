//Import Joption and decimalformat classes
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
 /* 
 * Stefon Miller
 * My class thing
 */
public class Book 
{
	
	private String author;	//Author of the book
	private String title;	//Title of the book
	private String isbn;	//The book's ISBN #
	private double retailPrice;	//The book's retail price
	private int noInStock;	//How many books are in stock
	private String n;	//Number added/subtracted
	
	DecimalFormat a = new DecimalFormat("#,###.##");
	
	//Default info for a book
	public Book()
	{
		title = "0";
		author = "0";
		isbn = null;
		retailPrice = 0;
		noInStock = 0;
	}
	//Default values for a book with 2 strings
	public Book(String ti, String au)
	{
		title = ti;
		author = au;
		isbn = null;
		retailPrice = 0;
		noInStock = 0;
	}
	
	/**
	 * Sets the title of the book
	 * @param t = the title the user picks
	 */
	public void setTitle(String t)
	{
		title = t;
	}
	/**
	 * Retrieves the title of the book
	 * @return = The title of the book
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * Sets the author of the book
	 * @param a = The author the user picks
	 */
	public void setAuthor(String a)
	{
		author = a;
	}
	/**
	 * Retrieves the author of the book
	 * @return	= The author of the book
	 */
	public String getAuthor()
	{
		return author;
	}
	/**
	 * Sets the isbn number of the book
	 * @param i = The isbn number the user picks
	 */
	public void setISBN(String i)
	{
		isbn = i;
	}
	/**
	 * Retrieves the isbn number
	 * @return = The isbn number
	 */
	public String getISBN()
	{
		return isbn;
	}
	/**
	 * Sets the retail price to a number
	 * @param rp = the retail price the user inputs
	 */
	public void setRetailPrice(double rp)
	{
		retailPrice = rp;
	}
	/**
	 * Converts the retail price to a double
	 * @param rp = retail price
	 */
	public void setRetailPrice(String rp)
	{
		retailPrice = Double.parseDouble(rp);
	}
	/**
	 * Retrieves the retail price
	 * @return = the retail price
	 */
	public double getRetailPrice()
	{
		return retailPrice;
	}
	/**
	 * Sets the number of books in stock to what the user inputs
	 * @param nis = Number in stock
	 */
	public void setNoInStock(int nis)
	{
		noInStock = nis;
	}
	/**
	 * Converts nis to an int
	 * @param nis = number in stock
	 */
	public void setNoInStock(String nis)
	{
		noInStock = Integer.parseInt(nis);
	}
	/**
	 * Retrieves the number of books in stock
	 * @return = the number of books in stock
	 */
	public int getNoInStock()
	{
		return noInStock;
	}
	/**
	 * Calculates the total cost of the books
	 * @return total cost of all books
	 */
	public double calcTotalCost()
	{
		return noInStock * retailPrice;
	}
	/**
	 * Adds one book to the total
	 */
	public void addBook()
	{
		noInStock++;
	}
	/**
	 * Adds n books to the total
	 * @param n
	 */
	public void addBooks(int n)
	{
		noInStock = noInStock + n;
	}
	/**
	 * Converts n to an int and adds it to noInStock
	 * @param n = number added
	 */
	public void addBooks(String n)
	{
		noInStock = noInStock + Integer.parseInt(n);
	}
	/**
	 * subtracts one book from the total
	 */
	public void removeBook()
	{
		noInStock--;
	}
	/**
	 * Removes n books from the total, if there are enough.  Joptionpane only
	 * @param n = number of books removed
	 */
	public void removeBooks(String n)
	{
		int num;
		 num = Integer.parseInt(n);
		if(num > noInStock)
		{
			JOptionPane.showMessageDialog(null, "You need more books");
		}
		else
		noInStock = noInStock - num;	
	}
	/**
	 * Removes books for the console
	 * @param n = number of books removed
	 */
	public void removeBooks(int n)
	{
		if(n > noInStock)
		{
			System.out.println("You need more books");
		}
		else
		noInStock = noInStock - n;	
	}
	/**
	 * Returns all of the information in a neat fashion
	 */
	public String toString()
	{
		String str =
			"Title: " + title + "\n" +
			"Author: " + author + "\n" +
			"ISBN: " + isbn + "\n" +
			"Retail Price: " + a.format(retailPrice) + "\n" +
			"No. In Stock: "+ noInStock + "\n" +
			"Total Cost: " + a.format((noInStock * retailPrice)) + "\n";
		
		return str;
			
	}
	
		
}

