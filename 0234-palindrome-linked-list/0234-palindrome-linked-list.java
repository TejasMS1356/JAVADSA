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
        ListNode fast=head;
        ListNode slow=head;
        Stack<Integer> st=new Stack<>();
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        while(slow!=null){
            st.push(slow.val);
            slow=slow.next;
        }
        fast=head;
        while(!st.empty()){
            if(st.pop()!=fast.val){
                return false;

            }
            fast=fast.next;
        }
        return true;
    }
}