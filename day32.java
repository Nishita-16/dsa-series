problem 1:https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode h1=head;
        while(h1 !=null ){
            if(h1.next!=null && h1.val == h1.next.val){
                while(h1.next!=null && h1.val == h1.next.val){
                    h1=h1.next;
                }
            }
            else{
                curr.next=h1;
                curr=curr.next;
            }
            h1=h1.next;
        }
        curr.next=null;
        return dummy.next;
    }
}
