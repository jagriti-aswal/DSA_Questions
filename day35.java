//ques1:78. Subsets
//link:https://leetcode.com/problems/subsets/


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lol = new ArrayList<>();
        lol.add(new ArrayList<>());  // Add the empty subset

        int l = nums.length;
        for (int k = 1; k <= l; k++) {  // Iterate over subset sizes
            List<Integer> list = new ArrayList<>();
            generateSubsets(nums, 0, k, list, lol);  // Generate subsets of size k
        }

        return lol;
    }

    private void generateSubsets(int[] nums, int start, int k, List<Integer> list, List<List<Integer>> lol) {
        if (list.size() == k) { 
            lol.add(new ArrayList<>(list));  // Add the current subset
            return;
        }

        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);  // Choose
            generateSubsets(nums, i + 1, k, list, lol);  // Explore further
            list.remove(list.size() - 1);  // Backtrack (un-choose)
        }
    }
}




//ques2:22. Generate Parentheses
//link:https://leetcode.com/problems/generate-parentheses/description/



class Solution2 {
    public List<String> generateParenthesis(int n) {
        List<List<String>> lol = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("(");
        generate(1, 0, lol, list, n); 
        List<String> flatList = new ArrayList<>();
        for (List<String> subList : lol) {
            flatList.add(String.join("", subList)); 
        }
        return flatList;
    }

    public void generate(int countop, int countcl, List<List<String>> lol, List<String> list, int n) {
        int c = 0;
        if (list.size() == 2 * n) {
            lol.add(new ArrayList<>(list));
            return;
        }
        if (countop == n) {
            for (int i = countcl; i < n; i++) {
                list.add(")");
                c++;
            }
            lol.add(new ArrayList<>(list)); 
            for (int i = 0; i < c; i++) {
                list.remove(list.size() - 1);
            }
            return;
        }

        list.add("(");
        generate(countop + 1, countcl, lol, list, n); 
        list.remove(list.size() - 1);

        if (countop > countcl) {
            list.add(")");
            generate(countop, countcl + 1, lol, list, n);
            list.remove(list.size() - 1);
        }
    }
}
