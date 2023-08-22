//Delete the middle Node of a Linked List

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
            
        int count=0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp=temp.next;
        }

        if(count==2){
            head.next=null;
            return head;
        }

            int n = count/2;
            ListNode deleteNode = head;
           // ListNode tail=head;
            while(n-1!=0){
             //   tail.next=deleteNode;
                deleteNode=deleteNode.next;
                n--;
            }

          //  tail.next = deleteNode.next;

            deleteNode.next = deleteNode.next.next;

        return head;
    }
}