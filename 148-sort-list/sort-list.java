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
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        if(head==null){
            return head;
        }
        while(head!=null){
            list.add(head.val);
            head = head.next;}
        Collections.sort(list);
        ListNode answer = new ListNode(5555); 
        ListNode last = answer;
        ListNode node = null;
        for(int i : list){
            node = new ListNode(i);
            last.next = node;
            last = node;
        }
        return answer.next;
    }
}
