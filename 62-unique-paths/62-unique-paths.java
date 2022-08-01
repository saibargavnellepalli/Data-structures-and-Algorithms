class Solution {
    public int uniquePaths(int m, int n) {
        
        Integer[][] dp = new Integer[m][n];
        return f(0,0,m,n, dp);
    }
    public int f(int i, int j, int m, int n, Integer[][] dp){
        if(i==m || j==n)
            return 0;
        
        if(dp[i][j]!=null)
            return dp[i][j];
        
        if(i==m-1 && j==n-1)
            return 1;
        
        int down = f(i+1,j,m,n,dp);
        int right = f(i,j+1,m,n,dp);
        
        dp[i][j] = down + right;
        
        return down + right;
    }
}