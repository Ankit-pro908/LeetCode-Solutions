class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = findmiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null; 
        
      
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);
        
        return merge(leftHead, rightHead);
    }
    
   
    public static ListNode findmiddle(ListNode head) {
        ListNode fast = head.next; 
        ListNode slow = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    
    public static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); // Temporary anchor node
        ListNode tail = dummy;
        
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        
        // Append remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        
        return dummy.next;
    }
}
