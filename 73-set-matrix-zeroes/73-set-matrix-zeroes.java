class Solution {
    public void setZeroes(int[][] matrix) {
        

   
         for (int i=0;i<matrix.length;i++){
             for (int j=0;j<matrix[0].length;j++){
                 if (matrix[i][j] == 0 ){

                     makeRowColZero(matrix,i,j);

                 }
             }
         }

        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
               if (matrix[i][j]== Integer.MAX_VALUE+2)
                   matrix[i][j] =0;
            }

        }

    }

    private static void makeRowColZero(int matrix[][] , int a, int b) {
        //row
        for (int i=0;i<matrix[0].length;i++){
                if (matrix[a][i]!=0 ) {

                    matrix[a][i] = Integer.MAX_VALUE+2;
                }
        }

        //column
        for (int i=0;i<matrix.length;i++){
            if (matrix[i][b]!=0 ) {

                matrix[i][b] = Integer.MAX_VALUE+2;
            }
        }
    }
}


