class Solution {
    public int climbStairs(int n) {
        
        Integer dp[] = new Integer[n+1];
        
        return f(0, n, dp);
        
    }
    
    public int f(int cur, int tar, Integer dp[]){
        
        if(cur == tar) return 1;
        
        if(cur > tar) return 0;
        
         if(dp[cur] != null) return dp[cur];
        
        int onestep = f(cur+1, tar, dp);
        int twosteps = f(cur+2, tar, dp);
        
        return dp[cur] = onestep+twosteps;
    }
}