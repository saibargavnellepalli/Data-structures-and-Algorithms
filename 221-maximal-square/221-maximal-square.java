class Solution {
    public int maximalSquare(char[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        Integer dp[][] = new Integer[m][n];
        
        int ans = -2;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int tempAns = maxSquare(i,j,m,n,matrix,dp);
                ans = Math.max(tempAns,ans);
            }
            
           
        }
         return ans*ans;
        
    }
    
    public int maxSquare(int r, int c, int m, int n, char[][] matrix,Integer dp[][]){
        
         if(r==m || c == n)
            return 0;
        
        if(matrix[r][c]=='0')
            return 0;
        
       if(dp[r][c]!=null){
           return dp[r][c];
       }
        
        //Right call
        int right =1+ maxSquare(r,c+1,m,n,matrix,dp);
        
        //down call
        int down = 1+maxSquare(r+1,c,m,n,matrix,dp);
        
        //diagnal call
        int diagonal = 1+maxSquare(r+1,c+1,m,n,matrix,dp);
        
        int ans = Math.min(right,down);
        ans = Math.min(ans,diagonal);
        
        dp[r][c] = ans;
        return ans;
    }
    
    
}