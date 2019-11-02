
public class MyLibrary {

	public static void main(String[] args) 
	{
		//Creates the jello book
		Book jello = new Book();
		jello.setTitle("Why jello is awesome");	//Sets the title of the book
		jello.setAuthor("Jello McJelloington");	//Sets the author of the book
		jello.setISBN("1234567890");	//Sets the isbn of the book
		jello.setNoInStock(2);	//Sets the number in stock
		jello.setRetailPrice(99.99);	//Sets the price of the book
		
		
		
		//Gets the title of the book
		System.out.println("The title is: " + jello.getTitle());
		//Gets the author of the book
		System.out.println("The author is: " + jello.getAuthor());
		//Gets the isbn of the book
		System.out.println("The ISBN is: " + jello.getISBN());
		//Gets the number in stock
		System.out.println("The number in stock is: " + jello.getNoInStock());
		//Gets the price of the book
		System.out.println("The retail price is: $" + jello.getRetailPrice());
		//Print total cost
		System.out.println("The total cost is " + jello.calcTotalCost());
		
		//Creates the cereal book
		Book cereal = new Book();
		cereal.setTitle("The history of cereal");	//Sets the title of the book
		cereal.setAuthor("Ceary McCereaington");   //Sets the author of the book
		cereal.setISBN("987654321");	//Sets the isbn of the book
		cereal.setNoInStock(44);	//Sets the number in stock
		cereal.setRetailPrice(49.99);	//Sets the price of the book
		
		//Gets the title of the book
		System.out.println("The title is: " + cereal.getTitle());
		//Gets the author of the book
		System.out.println("The author is: " + cereal.getAuthor());
		//Gets the isbn of the book
		System.out.println("The ISBN is: " + cereal.getISBN());
		//Gets the number in stock
		System.out.println("The number in stock is: " + cereal.getNoInStock());
		//Gets the price of the book
		System.out.println("The retail price is: $" + cereal.getRetailPrice());
		//Print total cost
			System.out.println("The total cost is " + cereal.calcTotalCost());
		
		
	}

}
