//ques1:1614. Maximum Nesting Depth of the Parentheses
//link:https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

class Solution {
    public int maxDepth(String s) {
        int ans = 0, count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
                ans = Math.max(ans, count);
            } else if (s.charAt(i) == ')') {
                count--;
            }
        }
        
        return ans;
    }
}


//TC:O(n)
//SC:O(1)


//ques2:13. Roman to Integer
//link:https://leetcode.com/problems/roman-to-integer/description/

class Solution2 {
    public int romanToInt(String s) {
        int count=0;
        int i=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='M') count+=1000;
            else if(s.charAt(i)=='D') count+=500;
            else if(s.charAt(i)=='L')  count+=50;
            else if(s.charAt(i)=='V') count+=5;
            else if(s.charAt(i)=='C'){
                if(i<s.length()-1 && s.charAt(i+1)=='D' ){ 
                    count+=400;
                    i++;}
                else if(i<s.length()-1 && s.charAt(i+1)=='M' ) {
                    count+=900;
                    i++;}
                else count+=100;
            }
            else if(s.charAt(i)=='X'){
                 if(i<s.length()-1 && s.charAt(i+1)=='L' )  {
                    count+=40;
                    i++;}
                else if(i<s.length()-1 && s.charAt(i+1)=='C' ){
                     count+=90;
                     i++;}
                else count+=10;
            }
              else if(s.charAt(i)=='I'){
                 if(i<s.length()-1 && s.charAt(i+1)=='V' ){ 
                     count+=4;
                     i++;}
                else if(i<s.length()-1 && s.charAt(i+1)=='X' ) {
                    count+=9;
                    i++;}
                else count+=1;
            }
        }
        return count;
    }
}

//TC:O(n)
//SC:O(1)
