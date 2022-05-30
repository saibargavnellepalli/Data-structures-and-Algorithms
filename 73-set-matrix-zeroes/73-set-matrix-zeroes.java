class Solution {
    public void setZeroes(int[][] matrix) {
        
    
     
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j] == 0){
                 column(i,matrix);
                 row(j,matrix);
             }
                
                }
            }
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             if(matrix[i][j] == 0 || matrix[i][j] == Integer.MAX_VALUE+2){
                matrix[i][j] = 0;
             }
                
                }
            }
    }
        
       
    private static void column(int a,int[][] matrix){
            for(int i=0;i<matrix[0].length;i++){
                if(matrix[a][i] != 0){
                matrix[a][i] = Integer.MAX_VALUE+2;
                }
            }
        }
             
         private void row(int b,int matrix[][]){
            for(int j=0;j<matrix.length;j++){
                 if(matrix[j][b] != 0){
                matrix[j][b] = Integer.MAX_VALUE+2;
                }
            }
         }
        }
    




