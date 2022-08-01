class Solution {
    public int uniquePaths(int m, int n) {
        
        return f(0,0,m,n, new HashMap<String,Integer>());
    }
    public int f(int i, int j, int m, int n, HashMap<String, Integer> memo){
        if(i==m || j==n)
            return 0;
        
        String key = i+"-"+j;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        if(i==m-1 && j==n-1)
            return 1;
        
        int down = f(i+1,j,m,n,memo);
        int right = f(i,j+1,m,n,memo);
        
        memo.put(key,down+right);
        
        return down + right;
    }
}