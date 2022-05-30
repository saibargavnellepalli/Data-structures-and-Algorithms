class Solution {
    public void setZeroes(int[][] matrix) {
        
       ArrayList<String> zeroPlaces = new ArrayList<>();
        
      int temp[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              temp[i][j] = matrix[i][j];
                
                }
            }
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[0].length;j++){
             if(temp[i][j] == 0){
                 column(i,matrix);
                 row(j,matrix);
             }
                
                }
            }
    }
        
       
    private static void column(int a,int[][] matrix){
            for(int i=0;i<matrix[0].length;i++){
                matrix[a][i] = 0;
            }
        }
             
         private void row(int b,int matrix[][]){
            for(int j=0;j<matrix.length;j++){
                matrix[j][b] = 0;
            }
         }
        }
    




