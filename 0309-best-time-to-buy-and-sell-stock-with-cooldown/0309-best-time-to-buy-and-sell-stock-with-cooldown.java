class Solution {
    public int maxProfit(int[] prices) {
        //page 8
        //book2 (Sahil) - 10
        
        return profit(prices,0,1,new HashMap<String,Integer>());
       
    }
    private int profit(int[] prices,int CD, int canBuy,HashMap<String,Integer> memo){
        
        if(CD >= prices.length)
            return 0;
        
        //memo
        String currentKey = Integer.toString(CD)+"-"+Integer.toString(canBuy);
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        if(canBuy == 1){
              int idle = profit(prices,CD+1,canBuy,memo);
              int buy = -prices[CD]+profit(prices,CD+1,0,memo);
            memo.put(currentKey,  Math.max(buy,idle));
            return Math.max(buy,idle);
        }
        else{
              int idle = profit(prices,CD+1,canBuy,memo);
        int sell =  prices[CD]+profit(prices,CD+2,1,memo);
             memo.put(currentKey,  Math.max(sell,idle));
            return Math.max(idle,sell);
            
            }
        
        
     
      
    }
}