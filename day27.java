//ques1:Reverse a Doubly Linked List
//link:https://bit.ly/3w6hUaa

class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null){
            return head; 
        }
        DLLNode prev = null;
        DLLNode cur = head;

        while (cur != null) {
           
            prev = cur.prev;
            cur.prev = cur.next;
            cur.next = prev;
            
           
            cur = cur.prev;
        }

        
        return prev.prev;
    }
}



//ques2:
//link:https://bit.ly/3QlEoMx



class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node temp=head;
        int i=1;
        while(i<x){
            temp=temp.next;
            i++;
        }
        if(temp.prev==null){
            head=head.next;
            head.prev=null;
            return head;
        }
        if(temp.prev!=null)
        temp.prev.next=temp.next;
        if(temp.next!=null)
        temp.next.prev=temp.prev;
        return head;
    }
}