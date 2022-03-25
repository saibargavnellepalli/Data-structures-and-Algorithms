class Solution {
    public int coinChange(int[] coins, int amount) {
        
        Integer dp[][] = new Integer[coins.length][amount+1];
        int  a = minCoins(0,coins,amount,dp);
        if(a==100002)
           a = -1;
         return a;
    }
    
    public int minCoins(int CI,int[] coins, int amount,Integer[][] dp){
        
        if(amount==0)
            return 0;
        
        if(CI==coins.length)
            return 100002;
        
        if(dp[CI][amount]!=null)
            return dp[CI][amount];
        //consider
        int consider  = 100002;
        
        if(coins[CI]<=amount){
            consider = 1+minCoins(CI,coins,amount-coins[CI],dp);
        }
        
        // don't consider current item
        int notConsider = minCoins(CI+1,coins,amount,dp);
        
        dp[CI][amount] =Math.min(consider,notConsider);
        
        return Math.min(consider,notConsider);
        
        
    }
}