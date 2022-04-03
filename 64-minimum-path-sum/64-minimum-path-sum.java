class Solution {
    public int minPathSum(int[][] grid) {
        
        return minPath(0,0,grid.length,grid[0].length,grid,new HashMap<String,Integer>());
    }
    public int minPath(int c1, int c2, int m, int n , int[][] grid,HashMap<String,Integer> memo){
        
       if(c1==m || c2 == n)
           return 1000;
        
        if(c1==m-1 && c2 == n-1)
            return grid[c1][c2];
        
        String currentkey = c1+"-"+c2;
        
        if(memo.containsKey(currentkey))
            return memo.get(currentkey);
        
        int downMove = grid[c1][c2]+minPath(c1+1,c2,m,n,grid,memo);
        int rightMove = grid[c1][c2]+minPath(c1,c2+1,m,n,grid,memo);
        
        memo.put(currentkey,Math.min(downMove,rightMove));
        
        return Math.min(downMove,rightMove);
    }
}