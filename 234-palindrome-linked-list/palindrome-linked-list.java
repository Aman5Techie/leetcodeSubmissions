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
    public boolean isPalindrome(ListNode head) {
        String num = "";
        while(head!=null){
            num = num + String.valueOf(head.val);
            head = head.next;
        }    

        for(int i = 0;i<num.length()/2;i++){
            if(num.charAt(i) != num.charAt(num.length()-1-i)){
                return false;
            }
        }  
       
        return true;
    }
}