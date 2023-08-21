//Middle of the Linked List

class Solution {
    public ListNode middleNode(ListNode head) {
      int count=0;
      ListNode temp=head;
      while(temp!=null){
          count++;
          temp=temp.next;
      }
      
          int n = count/2;
          ListNode tail = head;
          while(n!=0){
              tail = tail.next;
              n--;
          }
          head = tail;
      
    return head;
    }
}