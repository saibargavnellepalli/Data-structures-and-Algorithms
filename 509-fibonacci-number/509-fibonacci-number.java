class Solution {
    public int fib(int n) {
        return fibo(n, new HashMap<Integer,Integer>());
    }
        public int fibo(int n, HashMap<Integer,Integer> memo){
        if(n<=1) return n;
            
            int currentKey = n;
            if(memo.containsKey(currentKey))
                return memo.get(currentKey);
            
        int decreaseByOne = fibo(n-1,memo);
        int increaseByOne = fibo(n-2,memo);
        
            memo.put(currentKey,decreaseByOne+increaseByOne);
        return decreaseByOne+increaseByOne;
}
        
    
}