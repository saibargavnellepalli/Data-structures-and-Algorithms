class Solution {
    public int change(int amount, int[] coins) {
        
        Integer dp[][] = new Integer[coins.length+1][100002];
        
        return f(0, amount, coins, dp);
    }
    
    public int f(int curInd, int amount, int[] coins, Integer dp[][]){
        
        if(amount == 0) return 1;
        
        if(curInd == coins.length || amount < 0) return 0;
        
        
        if(dp[curInd][amount] != null) return dp[curInd][amount];
        
        int consider = f(curInd, amount-coins[curInd], coins, dp);
        
        int notconsider = f(curInd+1, amount, coins, dp);
        
        
        return dp[curInd][amount] = consider+notconsider;
        
    }
}