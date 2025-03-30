problem 1:https://bit.ly/3w6hUaa
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head == null || head.next == null){
            return head;
        }
        
        DLLNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        
        DLLNode newhead = tail;
        while(tail != null){
            tail.next = tail.prev;
            tail.prev = tail.next;
            tail = tail.next;
        }
        return newhead;
    }
}

problem 2:https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-a-doubly-linked-list
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        if(head == null || head.next == null){
            return head;
        }
        
        DLLNode tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        
        DLLNode newhead = tail;
        while(tail != null){
            tail.next = tail.prev;
            tail.prev = tail.next;
            tail = tail.next;
        }
        return newhead;
    }
}
