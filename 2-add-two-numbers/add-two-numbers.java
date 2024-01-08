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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode last = node;
        int carry = 0;
        boolean null_list = false;
        while(l1!=null || l2!=null){
            if(l1==null){
                null_list = true;
                break;
            }
            if(l2==null){
                break;
            }
            int val = l1.val + l2.val +carry;
            System.out.print(val);
            if(val >= 10){
                carry = 1;
                ListNode new_val = new ListNode(val%10);
                last.next = new_val;
                last = new_val;

            }else{
                carry = 0;
                ListNode new_val = new ListNode(val%10);
                last.next = new_val;
                last = new_val;
            }
            l1 = l1.next;
            l2 = l2.next;

        }

        if(null_list){
            while(l2!=null){
                int val = l2.val +carry;
                if(val >= 10){
                    carry = val/10;
                    ListNode new_val = new ListNode(val%10);
                    last.next = new_val;
                    last = new_val;

                }else{
                     carry = 0;
                    ListNode new_val = new ListNode(val%10);
                    last.next = new_val;
                    last = new_val;
                }
                l2 = l2.next;
            }
        }else{
            while(l1!=null){
                int val = l1.val +carry;
                if(val >= 10){
                    carry = val/10;
                    ListNode new_val = new ListNode(val%10);
                    last.next = new_val;
                    last = new_val;
    
                }else{
                     carry = 0;
                    ListNode new_val = new ListNode(val%10);
                    last.next = new_val;
                    last = new_val;
                }
                l1 = l1.next;
            }

        }
        if(carry==1){
             ListNode new_val = new ListNode(1);
             last.next = new_val;
             last = new_val;
        }
        return node.next;

    }

   
}