class Solution {
    public int numRollsToTarget(int n, int k, int target) {
       
        return totalWays(n,target,k,new HashMap<String,Integer>());
    }
    
    public int totalWays(int n, int targetSum, int k,HashMap<String,Integer>memo){
         
        if(n==0 && targetSum==0){
            return 1;
        }
        
        if(n==0 && targetSum!=0){
            return 0;
        }
        
        String currentKey  = n+"-"+targetSum;
        
        //if sub problem is already solved then return it's stored answer
        if(memo.containsKey(currentKey))
        {
            return memo.get(currentKey);
        }
       
        
        int ans = 0;
        int MOD = 1000000007;
        //for every die we can have k choices 
        for(int i=1;i<=k;i++){
            
          int tempAns = totalWays(n-1,targetSum-i,k,memo);
            ans = (tempAns%MOD + ans%MOD)%MOD;
            
        }
        memo.put(currentKey,ans);
      
        return ans;
    }
}