//ques1:82. Remove Duplicates from Sorted List II
//link:https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;  
        ListNode cur = head;

        while (cur != null) {
            
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }

           
            if (prev.next == cur) {
                prev = prev.next;
            } else {
               
                prev.next = cur.next;
            }

            cur = cur.next; 
        }

        return dummy.next;
    }
}




//ques2:25. Reverse Nodes in k-Group
//link:https://leetcode.com/problems/reverse-nodes-in-k-group/description/


class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode temp, temp2, ans = head, pl = null;
        int count = 0, n = 1, i = 1;

       
        while (cur != null) {
            count++;
            cur = cur.next;
        }

        cur = head;

        while (n * k <= count) {
            temp = cur;
            i = 1;
            prev = null;

            while (i <= k) {
                temp2 = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp2;
                i++;
            }

            temp.next = cur;

            if (n >= 2)
                pl.next = prev;

            if (n == 1)
                ans = prev;  

            pl = temp;
            n++;
        }

        return ans;
    }
}


