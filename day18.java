//ques1:242. Valid Anagram
//link:https://leetcode.com/problems/valid-anagram/description/

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();  
        Arrays.sort(charArray);  
        
        char[] charArray2 = t.toCharArray();  
        Arrays.sort(charArray2);  
        
        return Arrays.equals(charArray, charArray2);  
    }
}

//TC:O(n log n)
//SC:O(n)



//ques2:14. Longest Common Prefix
//link:https://leetcode.com/problems/longest-common-prefix/description/


class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int n = strs.length;
        for (int i = 0; i < strs[0].length(); i++) {
            char a = strs[0].charAt(i); 
            
           
            for (int j = 1; j < n; j++) {
               
                if (i >= strs[j].length() || strs[j].charAt(i) != a) {
                    return strs[0].substring(0, i); 
                }
            }
        }

        return strs[0];
    }
}


//TC: O(n * m)
//SC:O(1)
