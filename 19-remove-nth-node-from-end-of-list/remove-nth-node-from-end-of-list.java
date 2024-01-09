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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int length = 0;
        // ListNode ptr = head;
        // while(ptr != null){
        //     length++;
        //     ptr = ptr.next;
        // }
        // ptr = head;
        // ListNode ptr2 = null;
        // for(int i = 0;i<length-n;i++){
        //     ptr2 = ptr;
        //     ptr = ptr.next;
            
        // }
        // if(ptr2==null){
        //     return head.next;
        // }
        // if(ptr==null){
        //     ptr2.next = null;
        //     return head;
        // }
        // ptr2.next = ptr.next;
        // return head;

        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}