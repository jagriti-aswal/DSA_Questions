//ques1:704. Binary Search
//link:https://leetcode.com/problems/binary-search/description/


class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1; 
    }
}


//TC: O(logN)
//SC: O(1)


//ques2:34. Find First and Last Position of Element in Sorted Array
//link:https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


class Solution2 {
    public int bn(int[] nums,int target,int is){
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
           int mid = low + (high - low) / 2;

            if(target==nums[mid]){
                ans=mid;
                if(is==0){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(target> nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
           

        }
         return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=bn(nums,target,0);
        int last=bn(nums,target,1);
    return new int[]{first,last};
    }
}

// TC: O(logN)
//SC: O(1)


//ques3:35.Search Insert Position
//link:https://leetcode.com/problems/search-insert-position/description/

class Solution3 {
    public int bn(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        int bound=-1;
        int mid=0;

        while(low<=high){
             mid=low+(high-low)/2;
            if(target==nums[mid]){
                bound=mid;
                break;
            }
            else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(bound==-1){
            if(nums[mid]>target)
            return mid;
            else
            return mid+1;
        }
        return bound;
    }
    public int searchInsert(int[] nums, int target) {
        return bn(nums,target);
    }
}

//TC:O(logN)
//SC:O(1)