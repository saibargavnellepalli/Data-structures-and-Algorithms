class Solution {
    public int[][] generateMatrix(int n) {
        
        
        int[][] matrix = new int[n][n];
        
        
        // we have to perform all 4 steps
        
        int m = matrix[0].length;
        
        
        int rs=0, re=n-1;
        int cs=0,ce = m-1;
        
        int elem = 1;
        
        
        while(rs <= re && cs <= ce){
            
        //step-1
        for(int i=cs; i<=ce; i++){
            // ans.add(matrix[rs][i]);
            
            matrix[rs][i] = elem;
            elem++;
        }
        rs++;
        
        
         //step-2
        for(int i=rs; i<=re; i++){
            // ans.add(matrix[i][ce]);
            matrix[i][ce] = elem;
            elem++;
        }
        ce--;
        
        //step-3
        
            
        for(int i=ce; i>=cs; i--){
            // ans.add(matrix[re][i]);
            
            matrix[re][i] = elem;
            elem++;
        }
        re--;
            
            
            
        
        //step -4
        for(int i=re; i>=rs; i--){
            // ans.add(matrix[i][cs]);
           matrix[i][cs] = elem;
            elem++;
        }
        cs++;
        
        }
        
        
        
        return matrix;
        
        
    }
}