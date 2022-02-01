class Solution {
    public void setZeroes(int[][] matrix) {
        
  boolean[][] new_Matrix = new boolean[matrix.length][matrix[0].length];

         for (int i=0;i<matrix.length;i++){
             for (int j=0;j<matrix[0].length;j++){
                 if (matrix[i][j] == 0 && new_Matrix[i][j]!=true){

                     makeRowColZero(matrix,new_Matrix,i,j);

                 }
             }
         }

     

    }

    private static void makeRowColZero(int matrix[][] ,boolean[][] new_matrix, int a, int b) {
        //row
        for (int i=0;i<new_matrix[0].length;i++){
                if (matrix[a][i]!=0 && new_matrix[a][i]!=true) {
                    new_matrix[a][i] = true;
                    matrix[a][i] = 0;
                }
        }

        //column
        for (int i=0;i<new_matrix.length;i++){
            if (matrix[i][b]!=0 && new_matrix[i][b]!=true) {
                new_matrix[i][b] = true;
                matrix[i][b] = 0;
            }
        }
    }
}
