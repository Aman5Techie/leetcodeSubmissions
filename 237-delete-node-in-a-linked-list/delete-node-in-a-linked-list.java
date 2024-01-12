/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode ptr = null;
        while(node.next!=null){
          
            node.val = node.next.val;
            ptr = node;
            node = node.next;
        }
        ptr.next = null;
    }
}