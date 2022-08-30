class Solution {
public void rotate(int[][] nums) {

    int n = nums.length;
    int m = nums[0].length;

    /*
    2 step solution
         1-> Find transpose of given matrix
         2-> Reverse all the elements in every row
     */

    //Finding transpose
    for (int i=0;i<m;i++){
        for (int j=0;j<n;j++) {
            if (i < j) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }
    }

    //Reverse all elements
  for (int row=0;row<n;row++){
      int i = 0,j=m-1;
      while (i<j){
          int temp = nums[row][i];
          nums[row][i] = nums[row][j];
          nums[row][j] = temp;
          i++;
          j--;
      }
  }
}
}