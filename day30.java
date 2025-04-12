problem 1:https://leetcode.com/problems/sort-list/
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
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        tail.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }
}
problem 2:https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
    static int size(ListNode head){
        ListNode cur=head;
        int size=0;
        while(cur!=null){
            cur=cur.next;
            size++;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=size(head);
        int k=size-n+1,i;
        if(size==1){
            head=null;
            return head;
        }
        if(size==n){
            return head.next;
        }
        ListNode curr=head;
        for(i=1;i<k-1;i++){
            curr=curr.next;
        }
        
        //ListNode temp=curr.next;
        curr.next=curr.next.next;
        //temp=null;
        return head;
    }
}
