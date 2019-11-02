//Import statement for scanner class
import java.util.Scanner;

public class Amazon 
{
	public static void main(String[] args)
	{
		
		//Create keyboard object
		Scanner keyboard = new Scanner(System.in);
		
		//Create jar object and pass in title and author 
		Book Jar = new Book("The history of jars", "Jarry McJarrington");
		
		//Prompt for isbn #
		System.out.println("What is the isbn?");
		Jar.setISBN(keyboard.nextLine());
		
		//Prompt for retail price
		System.out.println("What is the retail price?");
		Jar.setRetailPrice(keyboard.nextDouble());
		
		//Prompt for # in stock
		System.out.println("How many are in stock?");
		Jar.setNoInStock(keyboard.nextInt());
		
		Jar.addBook();
		Jar.removeBook();
		
		//Gets the title of the book
		System.out.println("The title is: " + Jar.getTitle());
		//Gets the author of the book
		System.out.println("The author is: " + Jar.getAuthor());
		//Gets the isbn of the book
		System.out.println("The ISBN is: " + Jar.getISBN());
		//Gets the number in stock
		System.out.println("The number in stock is: " + Jar.getNoInStock());
		//Gets the price of the book
		System.out.println("The retail price is: $" + Jar.getRetailPrice());
		//Print total cost
		System.out.println("The total cost is $" + Jar.calcTotalCost());
		//Sets number of books added to what user enters
		System.out.println("How many books do you want to add?");
		Jar.addBooks(keyboard.nextInt());
		//Output the title of the book
		System.out.println("The title is: " + Jar.getTitle());
		//Gets the author of the book
		System.out.println("The author is: " + Jar.getAuthor());
		//Gets the isbn of the book
		System.out.println("The ISBN is: " + Jar.getISBN());
		//Gets the number in stock
		System.out.println("The number in stock is: " + Jar.getNoInStock());
		//Gets the price of the book
		System.out.println("The retail price is: $" + Jar.getRetailPrice());
		//Print total cost
		System.out.println("The total cost is $" + Jar.calcTotalCost());
		//Sets number of books subtracted to what the user enters
		System.out.println("How many books do you want to remove?");
		Jar.removeBooks(keyboard.nextInt());
		//Output the title of the book
		System.out.println("The title is: " + Jar.getTitle());
		//Gets the author of the book
		System.out.println("The author is: " + Jar.getAuthor());
		//Gets the isbn of the book
		System.out.println("The ISBN is: " + Jar.getISBN());
		//Gets the number in stock
		System.out.println("The number in stock is: " + Jar.getNoInStock());
		//Gets the price of the book
		System.out.println("The retail price is: $" + Jar.getRetailPrice());
		//Print total cost
		System.out.println("The total cost is $" + Jar.calcTotalCost());
		
	}
	

}
