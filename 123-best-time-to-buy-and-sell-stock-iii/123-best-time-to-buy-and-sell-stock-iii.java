class Solution {
    public int maxProfit(int[] prices) {
        //page 8
        //book2 (Sahil) - 10
        Integer[][][] dp = new Integer[prices.length][2][3];
        
        return profit(prices,0,1,1,dp);
       
    }
    private int profit(int[] prices,int CD, int canBuy, int transactionCount,Integer[][][] memo){
        
        if(CD >= prices.length  || transactionCount==3 )
            return 0;
        
        //memo
    
        
        if(memo[CD][canBuy][transactionCount]!=null)
            return memo[CD][canBuy][transactionCount] ;
        
        if(canBuy == 1){
              int idle = profit(prices,CD+1,canBuy,transactionCount,memo);
              int buy = -prices[CD]+profit(prices,CD+1,0,transactionCount,memo);
           memo[CD][canBuy][transactionCount] = Math.max(idle,buy);
            return memo[CD][canBuy][transactionCount];
           
           
        }
        else{
              int idle = profit(prices,CD+1,canBuy,transactionCount,memo);
        int sell =  prices[CD]+profit(prices,CD+1,1,transactionCount+1,memo);
            memo[CD][canBuy][transactionCount] = Math.max(idle,sell);
            return memo[CD][canBuy][transactionCount];
            
            }
        
        
     
      
    }
}