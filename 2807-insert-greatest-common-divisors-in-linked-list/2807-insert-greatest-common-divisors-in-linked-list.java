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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
       while(temp != null && temp.next != null){
            ListNode cur=temp;
            int a=temp.val;
            temp=temp.next;
            int b=temp.val;
            while (b != 0) {
        int tem = b;
        b = a % b;
        a = tem;
    }
    ListNode newNode = new ListNode(a);
    newNode.next = cur.next;
    cur.next = newNode;


        }
        return head;
        
    }
}