package ch15;

public class BookShelfTest {

	public static void main(String[] args) {


		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("harry1");
		bookQueue.enQueue("harry2");
		bookQueue.enQueue("harry3");
		bookQueue.enQueue("harry4");
		bookQueue.enQueue("harry5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.getSize());
		
		
	}

}
