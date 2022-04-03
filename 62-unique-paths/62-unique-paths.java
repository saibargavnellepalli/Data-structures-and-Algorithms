class Solution {
    public int uniquePaths(int m, int n) {
        
            Integer[][] dp = new Integer[m][n];
        return totalWays(m-1,n-1,m,n, dp);
    }
    public int totalWays(int c1,int c2,int m, int n,Integer dp[][]){
       if(c1<0 || c2 <0)
           return 0;
        
        if(c1==0 || c2 == 0)
            return 1;
        
        if(dp[c1][c2]!=null)
            return dp[c1][c2];
        
        int down = totalWays(c1-1,c2,m,n,dp);
        int right = totalWays(c1,c2-1,m,n,dp);
        
        
        dp[c1][c2] = down+right;
        
       
        
        return down+right;
    }
}