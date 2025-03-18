//ques1.153:Find Minimum in Rotated Sorted Array
//link:https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] > nums[high]) { 
                low = mid + 1;
            } else { 
                high = mid;
            }
        }
        return nums[low];
    }
}


//TC:(LOGN)
//SC:O(1)


//ques2:704:Binary Search
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

//TC:(LOGN)
//SC:O(1)

