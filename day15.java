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


class Solution {
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