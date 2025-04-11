//ques1:203. Remove Linked List Elements
//link:https://leetcode.com/problems/remove-linked-list-elements/description/


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        while(head!=null && head.val==val  ){
            head=head.next;
        }
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return head;
    }
}




//ques2:2. Add Two Numbers
//link:https://leetcode.com/problems/add-two-numbers/description/


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;
        }

        return dummy.next;
    }
}
