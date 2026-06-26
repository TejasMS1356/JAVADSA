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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
       int count=0;
       while(temp!=null){
        temp=temp.next;
        count++;
       }
       temp=head;
       int x=k;
      int n=count-x;
       while(k!=1){
        temp=temp.next;
        k--;
        
       }
       ListNode temp1=head;
       while(n!=0){
        temp1=temp1.next;
        n--;
       }
       int temp2=temp1.val;
       temp1.val=temp.val;
       temp.val=temp2;




     return head;
        
    }
   
     

}