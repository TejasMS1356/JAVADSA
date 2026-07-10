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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            return head.next;
        }
        int nc=count-n;
        ListNode cur=head;
        ListNode prev=null;
        while(nc!=0){
            prev=cur;
            cur=cur.next;
            nc--;
            
        }
        prev.next=cur.next;
        return head;
    }
}