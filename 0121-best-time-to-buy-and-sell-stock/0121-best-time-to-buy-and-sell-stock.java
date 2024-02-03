class Solution {
    public int maxProfit(int[] prices) {
        Integer[][][] dp = new Integer[prices.length+1][2][3];
        
        
        return f(0, 1, 1, prices, dp);
        
    }
    
    public int f(int ind, int canBuy, int k, int[] prices, Integer[][][] dp){
        
        
        //bases cases
        if(ind >= prices.length  || k == 0) return 0;
        
        
        if(dp[ind][canBuy][k] != null) return dp[ind][canBuy][k];
        
        //recurive calls 
        //have the access to buy on "cur index" day
        int profit = 0;
        
        if(canBuy == 1){
            
            int buy = -prices[ind] + f(ind+1, 0,k, prices, dp);
            int not = 0 + f(ind+1, 1,k, prices, dp);
            
            profit = Math.max(buy, not);
        }
        //have the access to sell
        else{
            
            int sell = prices[ind] + f(ind+1, 1,k-1, prices, dp);
            int not = 0 + f(ind+1, 0,k, prices, dp);
            
            profit = Math.max(sell, not);
        }
        
        
        //return answer
        return dp[ind][canBuy][k] = profit;
        
        
    }
}