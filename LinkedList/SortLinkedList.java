//Sort Linked List

class Solution {
    public ListNode sortList(ListNode head) {
        // bubble sort
        ListNode curr1 = head , curr2 = null;
        while( curr1 != null ){
            curr2 = curr1.next;
            while( curr2 != null ){
                if( curr1.val > curr2.val ){
                    int t = curr1.val;
                    curr1.val = curr2.val;
                    curr2.val = t;
                }
                curr2 = curr2.next;
            }
            curr1 = curr1.next;
        }
        return head;
    }
}