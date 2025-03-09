// ques1: 283 . Move zeroes
//link: https://leetcode.com/problems/move-zeroes/description/


class Solution {
    public void moveZeroes(int[] nums) {
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                  int j=i+1;
                    while(j<(nums.length-1) && nums[j]==0 )
                    j++;
                    if(j<nums.length){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    }
                }
            }
            return ;
        
    }
}

// ques2: 189.Rotate array
//link: https://leetcode.com/problems/rotate-array/description/

class Solution {
    public void rotate(int[] nums, int k) {
        
        int l=0;
        int i;
        while(nums.length<k){
            k-=nums.length;
        }
        int[] arr=new int[nums.length+k];
        for(i=0;i<nums.length;i++){
            arr[i+k]=nums[i];
        }
        
        for(i=i;i<arr.length;i++){
            arr[l++]=arr[i];
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=arr[j];
        }
    }
}

// TC: O(n)
//SC: O(n)