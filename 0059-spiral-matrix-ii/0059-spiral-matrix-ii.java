class Solution {
    public int[][] generateMatrix(int n) {
       int ans[][] = new int[n][n];
        
          int rs = 0, re = n-1;
        int cs = 0, ce = n-1;
        int elm = 1;
        
        while(rs<=re && cs<=ce){
            
        for(int i=cs; i<=ce; i++){
           ans[rs][i] = elm;
            elm++;
        }
        
        rs++;
        
        for(int i=rs;i<=re;i++){
        //ans.add(matrix[i][ce]);
             ans[i][ce] = elm;
            elm++;
        }
        
        ce--;
        
        for(int i=ce;i>=cs;i--){
            // ans.add(matrix[re][i]);
             ans[re][i] = elm;
            elm++;
        }
        
        re--;
        
        for(int i=re;i>=rs;i--){
 ans[i][cs] = elm;
            elm++;
        }
        
        cs++;
    }
        return ans;
        
        
    }
}