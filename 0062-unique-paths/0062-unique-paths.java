class Solution {
    public int uniquePaths(int m, int n) {
        
        Integer dp[][] = new Integer[m+1][n+1];
        
       return f(0, 0, m,n, dp); 
        
    }
    
    public int f(int i, int j, int m, int n, Integer dp[][]){
        
        if(i==m-1 && j==n-1) return 1;
        
        if(i>=m || j>=n ) return 0;
        
        if(dp[i][j] != null) return dp[i][j];
        
        int right = f(i+1, j, m, n, dp);
        int down = f(i, j+1, m,n, dp);
        
        
        return dp[i][j]= right+down;
    }
}