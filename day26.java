problem : https://www.geeksforgeeks.org/problems/insert-a-node-in-doubly-linked-list/1
class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        int i;
        Node temp=head;
        Node value=new Node(x);
        for(i=0;i<p;i++){
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next=value;
            value.prev=temp;
            return head;
        }
        Node nextel=temp.next;
       // value.prev=temp;
        temp.next=value;
        value.prev=temp;
        value.next=nextel;
        nextel.prev=value;
        return head;
        
    }
}
problem :https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp=head;
        int i;
        for(i=0;i<n;i++){
            if(temp.data==key)return true;
            temp=temp.next;
        }
        return false;
    }
}
