class Solution {
    public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length][amount+1];
        
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<amount+1;j++){
                dp[i][j] =-1;
            }
        }
        
        
        return totalWays(coins,0,amount,dp);
        
    }
    
    public int totalWays( int[] coins,int currentIndex, int amount,int[][] dp){
        
         //found 1 way
        if(amount == 0)
            return 1;
        
        if(currentIndex>=coins.length)
            return 0;
        
    if(dp[currentIndex][amount]!=-1)
        return dp[currentIndex][amount];
        
        //consider
        int consider=0;
        if(coins[currentIndex]<=amount)
         consider = totalWays(coins,currentIndex,amount-coins[currentIndex],dp);
        
        //not consider
        int notConsider = totalWays(coins,currentIndex+1,amount,dp);
        
       dp[currentIndex][amount] = consider+notConsider;
        return consider+notConsider;
        
        
        
    }
}