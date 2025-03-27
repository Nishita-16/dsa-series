problem link:https://leetcode.com/problems/delete-node-in-a-linked-list/description/
class Solution {
    public void deleteNode(ListNode node) {
        while(node.next.next!=null){
            node.val=node.next.val;
            node=node.next;
        }
        node.val=node.next.val;
        node.next=null;
    }
}
tc:O(n)
sc:O(1)
