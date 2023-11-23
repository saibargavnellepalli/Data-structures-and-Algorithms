class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int rs = 0, re = matrix.length-1;
        int cs = 0, ce = matrix[0].length-1;
        
        while(rs<=re && cs<=ce){
        for(int i=cs; i<=ce; i++){
            ans.add(matrix[rs][i]);
        }
        
        rs++;
        
        for(int i=rs;i<=re;i++){
        ans.add(matrix[i][ce]);
        }
        
        ce--;
        
            if(rs<=re){
        for(int i=ce;i>=cs;i--){
             ans.add(matrix[re][i]);
        }
            }
        
        re--;
        
            if(cs <= ce){
        for(int i=re;i>=rs;i--){
            ans.add(matrix[i][cs]);
        }
        
            }
            
        cs++;
    }
        return ans;
    }
}