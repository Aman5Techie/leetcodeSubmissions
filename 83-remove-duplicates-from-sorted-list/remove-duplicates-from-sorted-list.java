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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
       
        ListNode answer = new ListNode(5555);
        ListNode last = answer;
        ListNode res = null;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while(p2!=null){
            if(p1.val != p2.val){
                res = new ListNode(p1.val);
                last.next = res;
                last = res;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        res = new ListNode(p1.val);
        last.next = res;
        last = res;
        return answer.next;
    }
}