class Solution {
    public int numIslands(char[][] grid) {
          int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for(int row = 0;row < m;row++){
            for(int col = 0; col < n; col++){
                if(grid[row][col]=='1'){
                    max += maxArea(row,col,grid);
                }
            }
        }
        
        return max;
    }
    
    private int maxArea(int i, int j, char[][] grid){
            if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
                return 0;
            }
        //visited
        grid[i][j]='0';
        
        int down = maxArea(i+1,j,grid);
        int up = maxArea(i-1,j,grid);
        int left = maxArea(i,j-1,grid);
        int right = maxArea(i,j+1,grid);
        
        return 1;
    }
}