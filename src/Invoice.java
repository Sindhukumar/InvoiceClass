import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDb bookDb = new BookDb();
		bookDb.setbooks();
		System.out.println("Enter the Tax percent:");
		Scanner sc = new Scanner(System.in);
		double tax = sc.nextDouble();

		Book books[] = new Book[100];
		int numOfBooks[] = new int[100];
		int count;
		String item;
		for (count = 0; count < 100; count++) {
			System.out.println("Enter the item: ");
			item = sc.next();
			books[count] = bookDb.searchBySKU(item);
			if (books[count] == null){
				count--;
				break;
			}
			System.out.println("Enter the quantity: ");
			numOfBooks[count] = sc.nextInt();
		}
		double subTotal=0,grandTotal=0,price;
		System.out.println("Item\t Quantity \tDescription\t Price\t Total");
		for (int i = 0; i <= count; i++) {
			price = books[i].getPrice(numOfBooks[i]);
			System.out.println(books[i].getSKU()+"  "+numOfBooks[i]+"   "+books[i].getDescription()+"  "+books[i].getPrice()+"  "+price);
			subTotal+=price;
		}
		System.out.println("Sub Total: "+subTotal);
		System.out.println("Tax: "+subTotal*tax);
		System.out.println("GrandTotal: "+ (subTotal+subTotal*tax));
		sc.close();
	}
}
