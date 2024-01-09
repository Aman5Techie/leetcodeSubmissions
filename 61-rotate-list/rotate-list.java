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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode ptr = head;
        ListNode last= null;
        ListNode copy_of_head = new ListNode(5);
        copy_of_head.next = head;
        int length = 0;
        while(ptr != null){
            length++;
            last = ptr;
            ptr = ptr.next;
        }
        if(length==0 ){
            return head;
        }
   
        if(k > length){
            k =  k%length ;
        }
        if(length==1 || k==0  || k == length){
            return head;
        }
        ptr = head;
        ListNode ptr2 = head;
     
        for(int i = 0;i<length-k;i++){
            ptr2 = ptr;
            ptr = ptr.next;
            
        }

        ptr2.next = null;
        last.next = head;
        if(ptr==null){
            return copy_of_head;
        }
        return ptr;
    }
}