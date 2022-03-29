class Solution {
    public int maxProfit(int[] prices, int fee) {
        //page 8
        //book2 (Sahil) - 10
        
        return profit(prices,0,1,fee,new HashMap<String,Integer>());
       
    }
    private int profit(int[] prices,int CD, int canBuy,int fee,HashMap<String,Integer> memo){
        
        if(CD >= prices.length)
            return 0;
        
        //memo
        String currentKey = Integer.toString(CD)+"-"+Integer.toString(canBuy);
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        if(canBuy == 1){
              int idle = profit(prices,CD+1,canBuy,fee,memo);
              int buy = -prices[CD]+profit(prices,CD+1,0,fee,memo);
            memo.put(currentKey,  Math.max(buy,idle));
            return memo.get(currentKey);
        }
        else{
              int idle = profit(prices,CD+1,canBuy,fee,memo);
        int sell =  -fee+prices[CD]+profit(prices,CD+1,1,fee,memo);
             memo.put(currentKey,  Math.max(sell,idle));
            return memo.get(currentKey);
            
            }
        
        
     
      
    }
}