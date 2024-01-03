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
        for(int i = 0;i<10010;i++){
            if(head == null){
                return false;
            }else{
                head = head.next;
            }
        }
        return true;
    }
}