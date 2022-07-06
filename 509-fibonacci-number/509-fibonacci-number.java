class Solution {
    public int fib(int n) {
        return fibo(n, new HashMap<Integer,Integer>());
    }
        public int fibo(int n, HashMap<Integer,Integer> memo){
        
            if(n<=1) return n;
            if(memo.containsKey(n))
                return memo.get(n);
           
            int left = fibo(n-1,memo);
            int right = fibo(n-2,memo);
            memo.put(n,left+right);
            return left+right;
            
}
        
    
}