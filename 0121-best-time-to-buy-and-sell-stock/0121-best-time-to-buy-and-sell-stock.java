class Solution {
    public int maxProfit(int[] prices) {
        
        
        // 7 1 5 3 6 4
          // 7  1 1 1 1 1
               
          int preMin[] = new int[prices.length];
          int min = prices[0];
        
        for(int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            preMin[i] = min;
        }
        
        int ans = 0;
        
        for(int i=0;i<prices.length;i++){
            ans = Math.max(ans,prices[i]-preMin[i]);
        }
        
        return ans;
    }
}