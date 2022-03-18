class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int decreaseByOne = fib(n-1);
        int increaseByOne = fib(n-2);
        
        return decreaseByOne+increaseByOne;
        
    }
}