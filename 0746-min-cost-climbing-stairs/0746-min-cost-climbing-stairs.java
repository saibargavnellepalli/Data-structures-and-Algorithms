class Solution {
    public int minCostClimbingStairs(int[] arr) {
      int fromZero = minCost(0,arr,arr.length,new HashMap<Integer,Integer>());
      int  fromOne  = minCost(1,arr,arr.length,new HashMap<Integer,Integer>());
          return Math.min(fromZero,fromOne);
        
    }

    public int minCost(int cc, int[] arr,int n,HashMap<Integer,Integer> memo){
        if(cc==n)
            return 0;
        if(cc>n) return 1000;
        
        if(memo.containsKey(cc))
            return memo.get(cc);
        
        int a = arr[cc]+minCost(cc+1,arr,n,memo);
        int b = arr[cc]+minCost(cc+2,arr,n,memo);
        
        memo.put(cc,Math.min(a,b));
        
        return Math.min(a, b);
        
    }
}