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
    public int pairSum(ListNode head) {
        int max=0;
        Stack<Integer> st=new Stack<>();
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        while(slow!=null){
            st.push(slow.val);
            slow=slow.next;
        }
        fast=head;
        while(!st.empty()){
            int sum=st.pop()+fast.val;
            max=Math.max(max,sum);
            fast=fast.next;

        }

return max;
    }
}