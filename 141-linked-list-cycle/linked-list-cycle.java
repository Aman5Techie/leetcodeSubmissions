/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode p1 = head;
        ListNode p2 = head;
        while(p2!=null){
            if(p2.next==null){
                return false;
            } 
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                return true;
            }
        }
        return false;
        // for(int i = 0;i<10010;i++){
        //     if(head == null){
        //         return false;
        //     }else{
        //         head = head.next;
        //     }
        // }
        // return true;
    }
}