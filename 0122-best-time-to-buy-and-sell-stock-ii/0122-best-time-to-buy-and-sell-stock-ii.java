class Solution {
    public int maxProfit(int[] prices) {
        
        Integer dp[][] = new Integer[prices.length][2];
        
        return f(0,1,prices,dp);
    }
    
    public int f(int ind, int canBuy, int[] prices, Integer dp[][]){
        
        if(ind == prices.length) return 0;
        
        if(dp[ind][canBuy] != null) return dp[ind][canBuy];
        
       int profit = 0;
        
        if(canBuy == 1){
           profit =  Math.max(-prices[ind] + f(ind+1,0,prices,dp), 0+f(ind+1,1,prices,dp));
        }
        else{
       profit = Math.max(prices[ind]+f(ind+1,1,prices,dp), 0+f(ind+1,0,prices,dp));                           
         }
                              
          return dp[ind][canBuy] = profit;
    }
}