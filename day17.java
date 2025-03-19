//ques1:205. Isomorphic Strings
//link:https://leetcode.com/problems/isomorphic-strings/description/


class Solution {
    public boolean isIsomorphic(String s, String t) {
      if (s.length() != t.length()) return false;

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2= new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1.containsKey(ch1) && map1.get(ch1) != ch2) return false;
            if(map2.containsKey(ch2) && map2.get(ch2) != ch1) return false;

            map1.put(ch1, ch2);
            map2.put(ch2, ch1);
        }
        return true;
    
    }
}

//TC:O(n)
//SC:O(n)


//ques2:1021. Remove Outermost Parentheses
//link:https://leetcode.com/problems/remove-outermost-parentheses/description/


import java.util.*;

class Solution2 {
    public String removeOuterParentheses(String s) {
        List<Integer> li = new ArrayList<>();
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (!st.isEmpty()) { 
                    result.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                st.pop();
                if (!st.isEmpty()) {  
                    result.append(s.charAt(i));
                }
            }
        }
        
        return result.toString();
    }
}

//TC:O(N)
//SC:O(N)