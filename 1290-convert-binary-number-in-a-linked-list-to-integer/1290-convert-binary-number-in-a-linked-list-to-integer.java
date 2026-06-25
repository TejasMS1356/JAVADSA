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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int deci=0;
        while(temp!=null){
            int valu=temp.val;
            deci = deci * 2 + valu;
            temp=temp.next;

        }
        return deci;
        
    }
}