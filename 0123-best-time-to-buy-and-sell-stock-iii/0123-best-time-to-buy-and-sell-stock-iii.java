class Solution {
    public int maxProfit(int[] prices) {
     
        Integer dp[][][] = new  Integer[prices.length+1][2][3];
        return f(0, 1,2, prices, dp);
       
    }
    
    public int f(int ind, int canBuy,int k, int prices[],Integer dp[][][]){
        
        
        if(ind == prices.length  || k== 0) return 0;
        
        
        if(dp[ind][canBuy][k] != null) return dp[ind][canBuy][k];
        
        int profit = 0;
        if(canBuy == 1){
            
           int buy = -prices[ind] + f(ind+1, 0,k, prices, dp);
            int notBuy = 0+f(ind+1, 1, k, prices, dp);
            
            profit = Math.max(buy, notBuy);
        }
        else{
             
            int sell = prices[ind] + f(ind+1,1, k-1, prices, dp);
            int notSell = 0+f (ind+1, 0,k, prices,  dp);
            
            profit = Math.max(sell, notSell);
        }
        
        return dp[ind][canBuy][k] = profit;
        
    }
}