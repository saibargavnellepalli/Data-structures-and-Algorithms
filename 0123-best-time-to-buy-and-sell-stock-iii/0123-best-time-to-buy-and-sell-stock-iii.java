class Solution {
    public int maxProfit(int[] prices) {
        
     Integer dp[][][] = new Integer[prices.length][2][3];
        
        return f(0,1,2,prices,dp);
    }
    
    public int f(int ind, int canBuy, int k,int[] prices, Integer dp[][][]){
        
        if(ind == prices.length || k == 0) return 0;
        
        if(dp[ind][canBuy][k] != null) return dp[ind][canBuy][k];
        
       int profit = 0;
        
        if(canBuy == 1){
           profit =  Math.max(-prices[ind] + f(ind+1,0,k,prices,dp), 0+f(ind+1,1,k,prices,dp));
        }
        else{
       profit = Math.max(prices[ind]+f(ind+1,1,k-1,prices,dp), 0+f(ind+1,0,k,prices,dp));                           
         }
                              
          return dp[ind][canBuy][k] = profit;
    }
}