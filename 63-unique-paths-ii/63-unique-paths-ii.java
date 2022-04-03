class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
  int m = obstacleGrid.length;
  int n = obstacleGrid[0].length;
    return ways(0,0,m,n,obstacleGrid,new HashMap<String,Integer>());
    }
    
    public int ways(int c1, int c2, int m , int n, int[][] obstacleGrid,HashMap<String,Integer> memo){
        
        if(c1==m || c2 == n || obstacleGrid[c1][c2] == 1)
            return 0;
        
        if(c1==m-1 && c2 == n-1)
            return 1;
        
        String currentKey = c1+"-"+c2;
        
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);
        
        int downMove = ways(c1+1,c2,m,n,obstacleGrid,memo);
        int rightMove = ways(c1,c2+1,m,n,obstacleGrid,memo);
        
        memo.put(currentKey, downMove + rightMove );
        return downMove + rightMove;
    }
    
}
