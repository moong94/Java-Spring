package ch21;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0] = new Book("BOOK1", "Kim1");
		library[1] = new Book("BOOK1", "Kim2");
		library[2] = new Book("BOOK1", "Kim3");
		library[3] = new Book("BOOK1", "Kim4");
		library[4] = new Book("BOOK1", "Kim5");
		
		for (Book book : library) {
			System.out.println(book);
			book.showInfo();
			
		}
	}

}
