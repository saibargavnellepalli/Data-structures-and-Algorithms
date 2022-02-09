class Solution {
   public static boolean searchMatrix(int[][] matrix, int target) {
       
//         int n = matrix[0].length;
       
//         for (int i=0;i<matrix.length;i++){

//             //check if target is present in the current row
//             if (target>=matrix[i][0]&&target<=matrix[i][n-1]){
//                 for (int j=0;j<n;j++){
//                     if (matrix[i][j]==target) return true;
//                 }
//             }
//         }
//         return false;
//     }
        int start =0,end =matrix.length-1;
        int n = matrix[0].length-1;
        int len = matrix[0].length-1;
        n =n/2;

        while (start<=end){
            int mid = (start+end)/2;
            if (matrix[mid][n]>target){
                if (matrix[mid][0]<=target && matrix[mid][len]>=target){
                    boolean flag =true;
                    for (int i=0;i<matrix[0].length;i++){
                        if (matrix[mid][i]==target) {
                            flag = false;

                            return true;
                        }
                    }
                    if (flag==true) return false;
                }
                else {
                    end = mid-1;
                }
            }
            else if (matrix[mid][n]<target){
                if (matrix[mid][0]<=target && matrix[mid][len]>=target){
                    boolean flag =true;
                    for (int i=0;i<matrix[0].length;i++){
                        if (matrix[mid][i]==target) {
                            flag = false;
                            return true;
                        }
                    }
                    if (flag==true) return false;
                }
                else {
                    start= mid+1;
                }
            }
            else {
                if (matrix[mid][n]==target) return true;
            }
        }
        return false;
    }
}
