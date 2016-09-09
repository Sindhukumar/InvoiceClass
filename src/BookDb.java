import java.util.Scanner;

public class BookDb {

	public BookDb(){
		super();
	}
	public BookDb(String SKU){
		String output = new BookDb().searchBySKU(SKU).getDisplayText();
		System.out.println(output);
	}
	public Book books[] = new Book[6];
	public void setbooks(){
		books[0] = new Book(47.50);
		books[0].setAuthor("Kathy Sierra and Bert Bates");
		books[0].setDescription("Easy to read Java workbook");
		books[0].setSKU("Java1001");
		books[0].setTitle("Head First Java");

		books[1] = new Book(20);
		books[1].setAuthor("Bruce Eckel");
		books[1].setDescription("Details about Java under the hood");
		books[1].setSKU("Java1002");
		books[1].setTitle("Thinking in Java");

		books[2] = new Book(45);
		books[2].setAuthor("Jeanne Boyarsky");
		books[2].setDescription("Everything you need to know in one place");
		books[2].setSKU("Orcl1003");
		books[2].setTitle("OCP: Oracle Certified Professional Java SE");

		books[3] = new Book(10.50);
		books[3].setAuthor("Al Sweigart");
		books[3].setDescription("Fun with Python");
		books[3].setSKU("Python1004");
		books[3].setTitle("Automate the Boring Stuff with Python");

		books[4] = new Book(16.50);
		books[4].setAuthor("Simon Monk");
		books[4].setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
		books[4].setSKU("Zombie1005");
		books[4].setTitle("The Maker's Guide to the Zombie Apocalypse");

		books[5] = new Book(14.75);
		books[5].setAuthor("Donald Norris");
		books[5].setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
		books[5].setSKU("Rasp1006");
		books[5].setTitle("Raspberry Pi Projects for the Evil Genius");
	}

	

	public Book searchBySKU(String SKU) {
		for (Book book : books) {
			if(book.getSKU().equalsIgnoreCase(SKU))
				return book;
		}
		return null;
	}

}
