class Solution {
   public static boolean searchMatrix(int[][] matrix, int target) {
       
        int n = matrix[0].length;
       
        for (int i=0;i<matrix.length;i++){

            //check if target is present in the current row
            if (target>=matrix[i][0]&&target<=matrix[i][n-1]){
                for (int j=0;j<n;j++){
                    if (matrix[i][j]==target) return true;
                }
            }
        }
        return false;
    }
}
