//ques1:2149. Rearrange Array Elements by Sign
//link:https://leetcode.com/problems/rearrange-array-elements-by-sign/description/


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int positive = 0, negative = 1;

      
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];  

            if (num > 0) {
                result[positive] = num;
                positive += 2;  
            } else {
                result[negative] = num;
                negative += 2; 
            }
        }

        return result;
    }
}
//TC O(N)
//SC O(N)

//ques 2:121.Best Time to Buy and Sell Stock
//link:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


class Solution2 {
    public int maxProfit(int[] prices) {
        int i=prices[0];
       int prof=0;
        for(int j=1;j<prices.length;j++){
            if(i>prices[j]){
                i=prices[j];
            }
            else{
                prof=Math.max(prof,prices[j]-i);
            }
        }
        return prof;
    }
}
//TC O(N)
//SC O(1)


//ques3: 31. Next Permutation
//link:https://leetcode.com/problems/next-permutation/description/


class Solution3 {
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
 
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
     
        if(ind1==-1){
            reverse(nums,0);
        }
        
        else{
           
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
        
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}