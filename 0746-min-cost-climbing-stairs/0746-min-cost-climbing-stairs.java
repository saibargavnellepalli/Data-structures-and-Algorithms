class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        Integer dp1[] = new Integer[cost.length+1];
        
        int a =  f(0, cost.length, cost,dp1);
        
          Integer dp2[] = new Integer[cost.length+1];
        int b =  f(1, cost.length, cost, dp2);
        
        return Math.min(a,b);
    }
    
    public int f(int cur, int tar, int[] cost, Integer dp[]){
        
        if(cur == tar) return 0;
        
        if(cur > tar) return 10000;
        
        
        if(dp[cur] != null) return dp[cur];
        
        int one = cost[cur]+f(cur+1, tar, cost, dp);
        int two = cost[cur]+f(cur+2, tar, cost, dp);
        
        return dp[cur] = Math.min(one, two);
    }
}