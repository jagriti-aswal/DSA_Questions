//ques1:451. Sort Characters By Frequency
//link:https://leetcode.com/problems/sort-characters-by-frequency/description/

class Solution 
{
    public String frequencySort(String s) 
    {
        StringBuilder sb = new StringBuilder();
        int[] freq = new int[128];
        for(char c : s.toCharArray())
        {
            freq[c-'0']++;
        }

        for(int k = 0; k < s.length(); k++)
        {
            int max = 0;
            int ind = 0;
            for(int j = 0; j < freq.length; j++)
            {
                if(freq[j] != 0 && freq[j] > max)
                {
                    max = freq[j];
                    ind = j;
                }
            }
            for(int i = 0; i < max; i++)
            {
                sb.append((char)('0'+ind));
            }
            freq[ind] = 0;
            k += --max;
        }
        return sb.toString();
    }
}


//TC:O(n)
//SC:O(1)






//ques2:8. String to Integer (atoi)
//link:https://leetcode.com/problems/string-to-integer-atoi/description/

class Solution2 {
    public int myAtoi(String s) {
        int i = 0;
        int sign = 1;
        int result = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch < '0' || ch > '9') {
                break;
            }

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && ch - '0' > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + (ch - '0');
            i++;
        }

        return result * sign;
    }
}



//TC:O(n)
//SC:O(1)