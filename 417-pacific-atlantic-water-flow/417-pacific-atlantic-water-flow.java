class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        return this.sol(heights);
    }
    boolean pacificV = false;
    boolean atlanticV = false;
    boolean[][] visited;
    public List<List<Integer>> sol(int[][] heights) {
       visited = new boolean[heights.length][heights[0].length];
        List<List<Integer>> list = new ArrayList<>();
        for(int i =0; i < heights.length;i++) {
            for(int j =0; j < heights[0].length;j++) {
                visited = new boolean[heights.length][heights[0].length];
                pacificV = false;
                atlanticV = false;
                if(i == 0 || j == 0) {
                    pacificV = true;
                }
                if(i == heights.length - 1 || j == heights[0].length - 1) {
                    atlanticV = true;
                }
                dfs(heights,i,j);
                if(pacificV && atlanticV) {
                    list.add(List.of(i,j));
                }
            }
        }
      
        return list;
    }
    public void dfs(int[][] heights, int row, int col) {
       
       if(!visited[row][col]) {
           visited[row][col] = true;
           if (row - 1 >= 0) {
               if (heights[row - 1][col] <= heights[row][col]) {
                   dfs(heights, row - 1, col);
                  
               }
           }
           if (col - 1 >= 0) {
               if (heights[row][col - 1] <= heights[row][col]) {
                   dfs(heights, row, col - 1);
                  
               }
           }
           if (row + 1 < heights.length) {
               if (heights[row + 1][col] <= heights[row][col]) {
                   dfs(heights, row + 1, col);
                  
               }
           }
           if (col + 1 < heights[0].length) {
               if (heights[row][col + 1] <= heights[row][col]) {
                   dfs(heights, row, col + 1);
                  
               }
           }
           
       }
         if(row - 1 < 0 || col - 1 < 0) {
            pacificV = true;
            
        }
        if(row + 1 >= heights.length || col + 1 >= heights[0].length) {
            atlanticV  = true;
           
        }
    }
}