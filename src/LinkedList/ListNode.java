package LinkedList;

import LinkedList.SLinkedList.Node;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	ListNode head;
	public void insertFirst(int value) {
		ListNode newNode= new ListNode(value);
		if (head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void insertLast(int value) {
		ListNode newNode= new ListNode(value);
		if (head==null) {
			head=newNode;
			return;
		}
		
		ListNode temp=head;
		while (temp.next!=null) {
			temp=temp.next;
		}
		
	temp.next=newNode;
	}
	
	public void printLL() {
	    ListNode temp = this;
	    while (temp != null) {
	        System.out.print(temp.val);
	        if (temp.next != null) {
	            System.out.print(" > ");
	        }
	        temp = temp.next;
	    }
	    System.out.println();
	}

}
