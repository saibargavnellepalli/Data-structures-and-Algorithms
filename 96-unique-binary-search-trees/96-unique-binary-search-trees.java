class Solution {
    public int numTrees(int n) {
        
        //catalan
        return totalWays(n);
    }
    public int totalWays(int n){
        if(n==0 || n==1)
            return 1;
        int ans =0;
        for(int i=0;i<n;i++){
            ans+=totalWays(i)*totalWays(n-i-1);
        }
        return ans;
    }
}