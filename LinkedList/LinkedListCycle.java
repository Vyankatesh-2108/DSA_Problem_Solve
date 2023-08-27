//Linked List Cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
      ListNode first = head;
      ListNode last = head;

        while(last != null && last.next!=null){
            first=first.next;
            last=last.next.next;
            if(first == last)
                return true;
        }

    return false;
    }
}