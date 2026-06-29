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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head.next; //Start at first non zero node

        while(curr != null && curr.next != null){
            if(curr.next.val != 0){
                //Adds next node's value to the current node
                curr.val += curr.next.val;
                //Move the pointer to delete this used node from the list
                curr.next = curr.next.next;
            }
            else{
                //Skip over the zero node
                curr.next = curr.next.next;
                //Puts the current node after the zero node we just skipped to a number node
                curr = curr.next;
            }
        }

        return head.next;
    }
}
