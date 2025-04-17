//ques1:1922. Count Good Numbers
//link:https://leetcode.com/problems/count-good-numbers/description/




class Solution {
    private static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; 
        long oddCount = n / 2;       

        long evenChoices = modPow(5, evenCount, MOD);
        long oddChoices = modPow(4, oddCount, MOD);

        return (int)((evenChoices * oddChoices) % MOD);
    }

    private long modPow(long base, long exponent, long mod) {
        long result = 1;
        base %= mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}




//ques2:Sort a stack
//link:https://www.geeksforgeeks.org/problems/sort-a-stack/1



class GfG {
    public Stack<Integer> sort(Stack<Integer> s) {
         if (!s.isEmpty()) {
            int temp = s.pop();
            sort(s);
            sortedInsert(s, temp);
        }
        return s; 
    }
     private void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element >= stack.peek()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            sortedInsert(stack, element);
            stack.push(temp);
        }
    }
}