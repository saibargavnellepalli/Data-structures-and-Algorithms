class Solution {
    public int maxProfit(int[] prices) {
      int ans = 0,min=prices[0];
      for(int i=1;i<prices.length;i++){
          
         ans = Math.max(prices[i]-min,ans);
          min = Math.min(prices[i],min);
      }
        return ans;
      
    }
   
    
    }
