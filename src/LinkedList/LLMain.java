package LinkedList;

public class LLMain {
	public static void main(String[] args) {
		SLinkedList ll=new SLinkedList();
		ll.insertLast(1);
		ll.insertLast(2);
		ll.insertLast(3);
		ll.insertLast(4);
		ll.insertLast(6);
		System.out.println("Insert Last");
		ll.printLL();
		ll.insertFirst(7);
		ll.insertFirst(8);
		ll.insertFirst(9);
		System.out.println("Insert First");
		ll.printLL();
		ll.deleteFirst();
		ll.deleteFirst();
		System.out.println("Delete First");
		ll.printLL();
		ll.deleteLast();
		ll.deleteLast();
		System.out.println("Delete Last");
		ll.printLL();
	}

}
