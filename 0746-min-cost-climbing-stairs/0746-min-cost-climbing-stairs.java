class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        Integer dp[] = new Integer[cost.length+1];
        
        
      int a =  f(0, cost.length, cost, dp); 
        
     int  b = f(1, cost.length, cost, dp);
        
        return Math.min(a,b);
    }
    
    public int f(int cur, int tar, int[] cost, Integer[] dp){
        
        
        if(cur >= tar) return 0;
        
        if(dp[cur] != null) return dp[cur];
        
        int onestep = cost[cur]+  f(cur+1, tar, cost, dp);
        int twostep = cost[cur] + f(cur+2, tar, cost, dp);
        
        return dp[cur] =  Math.min(onestep, twostep);
        
        
    }
}