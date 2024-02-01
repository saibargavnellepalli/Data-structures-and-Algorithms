class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Integer[] dp = new Integer[cost.length];
        int zero =  f(0, cost, dp);
        int one =  f(1, cost, dp);
        return Math.min(one, zero);   
    }
    public int f(int curSt, int[] cost, Integer[] dp)
    {
        if(curSt >= cost.length) return 0;
        if(dp[curSt] != null) return dp[curSt];
        int oneS = cost[curSt] +  f(curSt + 1, cost, dp);
        int twoS =  cost[curSt] + f(curSt + 2, cost, dp);
        return dp[curSt] = Math.min(oneS, twoS);
    }
    }
