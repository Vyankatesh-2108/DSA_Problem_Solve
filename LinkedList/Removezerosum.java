//Remove zero sum consecutive nodes from Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        int prefixSum=0;
        while(temp != null){
            prefixSum += temp.val;
            map.put(prefixSum, temp);
            temp = temp.next;
        }
        prefixSum=0;
        temp=dummy;
        while(temp != null){
            prefixSum += temp.val;
            temp.next = map.get(prefixSum).next;
            temp = temp.next;
        }
        return dummy.next;
    }
}