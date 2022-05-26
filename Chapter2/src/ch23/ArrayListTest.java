package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("Book1","Kim1"));
		library.add(new Book("Book2","Kim2"));
		library.add(new Book("Book3","Kim3"));
		library.add(new Book("Book4","Kim4"));
		library.add(new Book("Book5","Kim5"));
		library.add(new Book("Book6","Kim6"));
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showInfo();
		}
	}

}
