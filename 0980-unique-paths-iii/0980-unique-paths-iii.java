class Solution {
    public int uniquePathsIII(int[][] grid) {
       
        int n=grid.length;
        int m = grid[0].length;
        int zeros=0;
        int i1=0,j1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    i1 = i;
                    j1 = j;
                }
                else if(grid[i][j]==0){
                    zeros += 1;
                }
            }
        }
        
        return totalPaths(i1,j1,grid,n,m,zeros);
    }
    
    public static int totalPaths(int i, int j, int[][] grid, int n, int m, int zeros){
        if(i<0 || j<0 || i==n || j==m || grid[i][j] == -1){
            return 0;
        }
        
        if(grid[i][j] == 2){
            return zeros==-1? 1 : 0;
        }
        
        grid[i][j] = -1;
        
        zeros -=1;
        
        int total = totalPaths(i,j-1,grid,n,m,zeros)+ 
                    totalPaths(i,j+1,grid,n,m,zeros)+ 
                    totalPaths(i-1,j,grid,n,m,zeros)+ 
                    totalPaths(i+1,j,grid,n,m,zeros);
        
        zeros+=1;
        grid[i][j] = 0;
        
        return total;
            
            
        
        
    }
}