package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
				
		library[0] = new Book("BOOK1", "Kim1");
		library[1] = new Book("BOOK1", "Kim2");
		library[2] = new Book("BOOK1", "Kim3");
		library[3] = new Book("BOOK1", "Kim4");
		library[4] = new Book("BOOK1", "Kim5");
		
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
		}
		
		for(Book book : library) {
			System.out.println(book);
			book.showInfo();
		}
		
		for(Book book : copyLibrary) {
			System.out.println(book);
			book.showInfo();
		}
	}
}
