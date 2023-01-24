class Solution {
    public boolean searchMatrix(int[][] matrix, int k) {
        int n = matrix.length;
        int m1 = matrix[0].length;
        int s=0,e=n-1;
        
        while(s<=e){
            int m = (s+e)/2;
            
            if(k < matrix[m][0]){
                e = m-1;
            }
            else if(k > matrix[m][m1-1]){
                
                s = m+1;
            }
            else{
               for(int i=0;i<m1;i++){
                   if(matrix[m][i] == k) return true;
               } 
                return false;
            }
            
            
        }
        
        return false;
    }
}