//Find Starting Point of Cycle

public class Solution {
    public ListNode detectCycle(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;
      while(fast != null && fast.next != null){
         slow = slow.next;
         fast = fast.next.next;
         if(slow == fast){
           ListNode start = head;
           while(start != slow){
             slow = slow.next;
             start = start.next;
           }
           return start;
         }
             
      } 
      return null; 
    }
}