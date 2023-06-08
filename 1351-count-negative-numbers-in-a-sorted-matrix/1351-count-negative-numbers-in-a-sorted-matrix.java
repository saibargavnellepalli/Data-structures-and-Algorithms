class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        
        for(int i=0;i<grid.length;i++){
            ans += neg(grid,i);
        }
        
        return ans;
    }
    
    public int neg(int[][] grid, int row){
        
        int low=0,high=grid[0].length-1;
        int mid = -1;
        int ans = -1;
        
        while(low <= high){
            mid = (low+high)/2;
            
            if(grid[row][mid] >= 0){
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        
        if(ans == -1)
            return 0;
        
        return grid[0].length-ans;
    }
}