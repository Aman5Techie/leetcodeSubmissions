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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode node = new ListNode(head.val);
        ListNode newNode = null;
        head = head.next;
        while(head != null){
            newNode = new ListNode(head.val);
            newNode.next = node;
            node = newNode;
            head = head.next;
        }
        return node;
    }
}