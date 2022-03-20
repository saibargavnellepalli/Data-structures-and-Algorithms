class Solution {
    public int tribonacci(int n) {
      return tribo(n,new HashMap<Integer,Integer>());
    }
    public int tribo(int n, HashMap<Integer,Integer> memo){
     if(n<=0) return 0;
    
        if(n==1 || n==2) return 1;
        
        if(memo.containsKey(n))
            return memo.get(n);
        
        int ans = tribo(n-1,memo)+tribo(n-2,memo)+tribo(n-3,memo);
        memo.put(n,ans);
        
       return ans;
    }
}