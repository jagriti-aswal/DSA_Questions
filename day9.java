//ques1: 75. Sort colors
//link :https://leetcode.com/problems/sort-colors/description/


class Solution {
    public void sortColors(int[] nums) {
        int temp=nums[0];
        for(int i=0;i<nums.length;i++){
            if(temp>nums[i]){
                temp=nums[i];
            }
        }
        for(int i=0;i<3;i++){
            int j=-1;
            int k=0;
            while(k<nums.length){
                if(nums[k]>temp){
                    k++;
                }
                else{
                    j++;
                    int a=nums[k];
                    nums[k]=nums[j];
                    nums[j]=a;
                    k++;
                }
            }

            temp++;
        }
    }
}

//TC:O(N)
//SC:O(1)


//ques2:Maximum Score from Subarray Minimums
//link: https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0


class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int i=0;
        int j=i+1;
        int sum=0;
        int max=-1;
        while(j<arr.length){
            sum=arr[i++]+arr[j++];
            max=Math.max(sum,max);
        }
        return max;
    }
}



//ques 3: 1.Two sum
//link:https://leetcode.com/problems/two-sum/description/



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                arr[0]=i;
                arr[1]=j;
            }
        }
       } 
       return arr;
    }
}
