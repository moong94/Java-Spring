package ch03;

public class MyLinkedListText {

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
		list.addElement("A");
		list.addElement("C");
		list.addElement("B");
		list.printAll();
		list.insertElement(1, "E");
		list.printAll();
		list.removeElement(0);
		list.printAll();
		list.removeElement(1);
		list.printAll();
		
		list.insertElement(0, "A-1");
		list.printAll();
		System.out.println(list.getsize());
		
		list.removeAll();
		list.printAll();
		list.addElement("A");
		list.printAll();
		System.out.println(list.getElement(0));
		list.removeElement(0);
	}

}
