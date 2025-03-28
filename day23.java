//ques1:686. Repeated String Match
//link:https://leetcode.com/problems/repeated-string-match/description/

public class Solution {
    public int repeatedStringMatch(String A, String B) {
        
        if (A == null || B == null || A.length() == 0 || B.length() == 0) return -1;
        
       
        StringBuilder newstr = new StringBuilder();
        int repeatCount = (int) Math.ceil((double) B.length() / A.length()) ;
        
        for (int i = 0; i < repeatCount; i++) {
            newstr.append(A);
        }
        
       
        if (newstr.toString().contains(B)) {
            return repeatCount;
        } else if (newstr.append(A).toString().contains(B)) {
            return repeatCount + 1;
        } else {
            return -1;
        }
    }
}
