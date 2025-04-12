problem 1:https://leetcode.com/problems/remove-linked-list-elements/
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
    public ListNode removeElements(ListNode head, int val) {
        int i;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            if(temp.val==val){
                if(prev==null){
                    temp=temp.next;
                    head=head.next;
                }
                else if(temp.next==null){
                    prev.next=null;
                    return head;
                }
                else{
                    prev.next=temp.next;
                    temp=prev.next;
                }
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}
