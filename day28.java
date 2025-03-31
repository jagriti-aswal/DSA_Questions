//ques1:141. Linked List Cycle
//link:https://leetcode.com/problems/linked-list-cycle/description/


public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode turtle=head;
        ListNode hare=head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
            if(hare==turtle){
                return true;
            }
        }
        return false;
    }
}



//ques2:876. Middle of the Linked List
//link:https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode turtle=head;
        ListNode hare=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        if(hare.next!=null) return turtle.next;
        return turtle;
    }
}
