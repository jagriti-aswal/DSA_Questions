//ques1:Find length of Loop
//link:https://www.geeksforgeeks.org/problems/find-length-of-loop/1


class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node hare = head;
        Node turtle = head;

        while (hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;

           
            if (hare == turtle) {
                return countLoopNodes(turtle);
            }
        }
        return 0; 
    }

    private int countLoopNodes(Node node) {
        int count = 1;
        Node temp = node;

        while (temp.next != node) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}



//ques2:Palindrome Linked List
//link:https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1


class Solution {
    // Function to check whether the list is a palindrome.
    static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; 
        }

        Node slow = head, fast = head;
        Stack<Integer> stack = new Stack<>();

       
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        
        if (fast != null) {
            slow = slow.next;
        }

       
        while (slow != null) {
            if (slow.data != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}
