package LinkedList;

public class AddTwoNumbers {
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode dummyHead = new ListNode(0);
	        ListNode current = dummyHead;

	        int carry = 0;

	        // Traverse both lists
	        while (l1 != null || l2 != null || carry != 0) {
	            int val1 = (l1 != null) ? l1.val : 0;
	            int val2 = (l2 != null) ? l2.val : 0;

	            int sum = val1 + val2 + carry;
	            carry = sum / 10;  // carry for next digit
	            int digit = sum % 10;

	            current.next = new ListNode(digit);
	            current = current.next;

	            // Move to next node if available
	            if (l1 != null) l1 = l1.next;
	            if (l2 != null) l2 = l2.next;
	        }

	        return dummyHead.next;
	    }

	
	public static void main(String[] args) {
		ListNode l1=new ListNode();
        l1.insertFirst(4);
        l1.insertFirst(3);
        l1.insertFirst(2);
        l1.printLL();

        // Second List: 5 -> 6 -> 4
    	ListNode l2=new ListNode();
        l2.insertFirst(6);
        l2.insertFirst(4);
        l2.insertFirst(3);
        l2.printLL();
        
        ListNode result = addTwoNumbers(l1, l2);
        result.printLL();
        
        
	}
	
	
	
}
