class Solution {
    public int coinChange(int[] coins, int amount) {
        
        Integer dp[][] = new Integer[coins.length+1][amount+1];
        
        int ans =  f(0, amount, coins, dp);
        
        if(ans == 100001) return -1;
        
        return ans;
    }
    
    public int f(int curInd, int amount, int[] coins, Integer[][] dp){
        
        
        if(amount == 0) return 0;
        
        if(curInd >= coins.length) return 100001; 
            
        if(amount < 0) return 100001;
        
        if(dp[curInd][amount] != null) return dp[curInd][amount];
        
        
        int take = 1+f(curInd, amount-coins[curInd], coins, dp);
        int notTake = f(curInd+1, amount, coins, dp);
        
        
        return dp[curInd][amount] = Math.min(take, notTake);
        
    }
}