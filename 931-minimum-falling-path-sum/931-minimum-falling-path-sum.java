class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans =10000;
        
       // Integer dp[][] = new int[matrix.length][matrix[0].length];
        
        HashMap<String,Integer> memo = new  HashMap<String,Integer>();
        for(int i=0;i<matrix[0].length;i++){
            int tempAns = minPath(0,i,matrix.length,matrix[0].length,matrix,memo);
            ans = Math.min(ans,tempAns);
        }
        
        return ans;
        
        
        
    }
    
    public int minPath(int r, int c, int m, int n,int[][] matrix,HashMap<String,Integer> memo){
        
        if(r==m || c == n || r<0 || c<0)
            return 10000;
        
        if(r == m-1 )
            return matrix[r][c];
        
        String currentKey = r+"-"+c;
        
        if(memo.containsKey(currentKey ))
            return memo.get(currentKey);
        
        
        
        int leftDown = matrix[r][c]+minPath(r+1,c-1,m,n,matrix,memo);
        int     down   =matrix[r][c]+ minPath(r+1,c,m,n,matrix,memo);
        int rightDown = matrix[r][c]+minPath(r+1,c+1,m,n,matrix,memo);
        
        int returnAns = Math.min(leftDown,down);
            returnAns = Math.min(returnAns,rightDown);
        
        memo.put(currentKey ,returnAns);
        
        return returnAns;
        
    }
}