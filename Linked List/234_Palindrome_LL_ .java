/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp != null){
            st.add(temp);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp != st.peek()){
                return false;
            }
            temp = temp.next;
            st.pop();
        }
        return true;

    }
}