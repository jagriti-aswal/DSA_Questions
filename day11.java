//ques1:118. Pascal's Triangle
//link:https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lol= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr.add(1);
                }
                else{
                    arr.add(lol.get(i-1).get(j-1)+lol.get(i-1).get(j));
                }
            }
            lol.add(arr);

        }
        return lol;
       
    }
}

// TC O(N^2)
//SC O(N^2)

//ques2:48.Rotate Image
//link:https://leetcode.com/problems/rotate-image/description/


class Solution {
    public void rotate(int[][] matrix) {
        int k=0;
        int l=matrix.length-1;
        while(k<l){
            for(int j=0;j<matrix.length;j++){
                int temp=matrix[k][j];
                matrix[k][j]=matrix[l][j];
                matrix[l][j]=temp;
            }
            k++;
            l--;
        }        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<=i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
    }
}

//TC O(N^2)
//SC O(1)


//ques3:54.Spiral Matrix
//link:https://leetcode.com/problems/spiral-matrix/description/


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int b = matrix.length - 1;  
        int r = matrix[0].length - 1; 
        int t = 0; 
        int l = 0;  

        List<Integer> list = new ArrayList<>();

        while (list.size() < matrix.length * matrix[0].length) {
          
            for (int i = l; i <= r; i++) {
                list.add(matrix[t][i]);
            }
            t++;

          
            for (int i = t; i <= b; i++) {
                list.add(matrix[i][r]);
            }
            r--;

         
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    list.add(matrix[b][i]);
                }
                b--;
            }

    
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }

        return list;
    }
}


//TC O(M*N)
//SC O(M*N)