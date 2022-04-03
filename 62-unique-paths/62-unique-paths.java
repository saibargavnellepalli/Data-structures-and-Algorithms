class Solution {
    public int uniquePaths(int m, int n) {
        return totalWays(0,0,m,n,new HashMap<String,Integer>());
    }
    public int totalWays(int c1,int c2,int m, int n,HashMap<String,Integer>memo){
       if(c1==m || c2 == n)
           return 0;
        
        String currentKey = c1+"-"+c2;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        if(c1==m-1 || c2 == n-1)
            return 1;
        
        int down = totalWays(c1+1,c2,m,n,memo);
        int right = totalWays(c1,c2+1,m,n,memo);
        
        memo.put(currentKey, down+right);
        
        return down+right;
    }
}