//ques1:74. Search a 2D Matrix
//link:https://leetcode.com/problems/search-a-2d-matrix/description/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0, high = m - 1;

        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][n - 1] < target) {
                low = mid + 1;
            } else if (matrix[mid][0] > target) {
                high = mid - 1;
            } else {
               
                int l = 0, h = n - 1;
                while (l <= h) {
                    int z = l + (h - l) / 2;
                    if (matrix[mid][z] == target) {
                        return true;
                    } else if (matrix[mid][z] < target) {
                        l = z + 1; 
                    } else {
                        h = z - 1; 
                    }
                }
                return false; 
            }
        }
        return false;
    }
}
    //TC:O(log(mn))
    //SC:O(1)



//ques2:240. Search a 2D Matrix II
//link:https://leetcode.com/problems/search-a-2d-matrix-ii/description/


class Solution2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0, col = n - 1; 

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; 
            } else {
                row++;
            }
        }

        return false;
    }
}



//TC:O(m + n)
//SC:O(1)



//ques3.:K-th element of two Arrays

//link:https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=k-th-element-of-two-sorted-array


class Solution3 {
    public int kthElement(int a[], int b[], int k) {
    
        int n1=a.length;
        int n2=b.length;
        if(n1>n2)  return kthElement(b,a,k);
        int low=Math.max(k-n2,0),high=Math.min(k,n1);
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=k-mid1;
            int l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE,r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=a[mid1];
            if(mid2<n2) r2=b[mid2];
            if((mid1-1)>=0) l1=a[mid1-1];
            if((mid2-1)>=0) l2=b[mid2-1];
            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2) high=mid1-1;
            else low=mid1+1;
            
        }
        return 0;
     
    }
}


//TC: O(log min(n1, n2))
//SC: O(1)