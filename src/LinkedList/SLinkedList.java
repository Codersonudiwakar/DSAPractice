package LinkedList;

public class SLinkedList {
	
	class Node{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	
	Node head;
//	Node tail;
	
	public void insertLast(int value) {
		Node newNode= new Node(value);
		if (head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while (temp.next!=null) {
			temp=temp.next;
		}
		
	temp.next=newNode;
	}
	
	public void insertFirst(int value) {
		Node newNode= new Node(value);
		if (head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void deleteLast() {
		if (head==null||head.next==null) {
			head=null;
			return;
		}
		Node temp=head;
		Node curr=head;
		while (temp.next.next!=null) {
			temp=temp.next;
			
		}
		temp.next=null;
	}
	
	public void deleteFirst() {
		if (head==null||head.next==null) {
			head=null;
			return;
		}
		head=head.next;

	}
	
	 public void printLL() {
	        Node temp = head;
	        while (temp != null) { // Fix condition to include last node
	            System.out.print(temp.value);
	            if (temp.next != null) { // Prevent trailing " > "
	                System.out.print(" > ");
	            }
	            temp = temp.next;
	        }
	        System.out.println();
	    }

}
