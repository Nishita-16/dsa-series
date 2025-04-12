problem 1:https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/
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
problem 2:https://leetcode.com/problems/reverse-nodes-in-k-group/description/
class Solution {
    public ListNode reverse(ListNode start,ListNode end){
        ListNode cur=start,prev=null;
        while(cur!=end){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int i=0;
        ListNode temp=head;
        while(temp!=null && i<k){
            temp=temp.next;
            i++;
        }
        if(i<k)return head;
        ListNode newhead=reverse(head,temp);
        head.next=reverseKGroup(temp,k);
        return newhead;
    }
}
