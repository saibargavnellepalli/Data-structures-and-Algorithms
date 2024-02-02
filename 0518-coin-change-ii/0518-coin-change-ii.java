class Solution {
    public int change(int amount, int[] coins) {
        
        Integer dp[][] = new Integer[coins.length+1][amount+1];
        
        return f(0, amount, coins, dp);
        
    }
    
    public int f(int curInd, int amount, int[] coins, Integer dp[][]){
        
        if(amount == 0) return 1;
        
        if(curInd >= coins.length) return 0;
        
        if(amount < 0) return 0;
        
        if(dp[curInd][amount] != null) return dp[curInd][amount];
        
        int take = f(curInd, amount-coins[curInd], coins, dp);
        int not = f(curInd+1,amount,coins, dp);
        
        
        return dp[curInd][amount] = take+not;
        
    }
}