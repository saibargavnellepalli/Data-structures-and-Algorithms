class Solution {
    public int maxProfit(int[] prices) {
        //page 8
    int min=Integer.MAX_VALUE;
    int n = prices.length;
        // for(int i=n-1;i>=0;i--){
        // for(int j=i-1;j>=0;j--){
        //   int x =prices[i]-prices[j];
        //     if(x>max)
        //         max =x;
        // }
        // }
        // return max;minutes 
        int profit =0;
        for(int i=0;i<n;i++){
       if(prices[i]<min){
            min = prices[i];
       }
            else{
                int sell = prices[i]-min;
                if(sell>profit){
                    profit = sell;
                }
            }
            }
        return profit;
        
    }
}