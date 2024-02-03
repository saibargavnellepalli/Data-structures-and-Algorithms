class Solution {
    public int maxProfit(int[] prices) {
      
        Integer[][] dp = new Integer[prices.length+1][2];
        
        return f(0, 1, prices, dp);
        
    }
    
    public int f(int ind, int canBuy, int[] prices, Integer[][] dp){
        
        
        //bases cases
        if(ind >= prices.length) return 0;
        
        
        if(dp[ind][canBuy] != null) return dp[ind][canBuy];
        
        //recurive calls 
        //have the access to buy on "cur index" day
        int profit = 0;
        
        if(canBuy == 1){
            
            int buy = -prices[ind] + f(ind+1, 0, prices, dp);
            int not = 0 + f(ind+1, 1, prices, dp);
            
            profit = Math.max(buy, not);
        }
        //have the access to sell
        else{
            
            int sell = prices[ind] + f(ind+1, 1, prices, dp);
            int not = 0 + f(ind+1, 0, prices, dp);
            
            profit = Math.max(sell, not);
        }
        
        
        //return answer
        return dp[ind][canBuy] = profit;
        
        
    }
}