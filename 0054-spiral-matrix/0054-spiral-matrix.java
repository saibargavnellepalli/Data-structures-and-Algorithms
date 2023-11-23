class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();
        
        int cs = 0,ce=matrix[0].length-1;
        int rs = 0, re=matrix.length-1;
        
        while(rs<=re && cs<=ce){
            
            for(int i=cs; i<=ce; i++){
                ans.add(matrix[rs][i]);
            }
            rs +=1;
            
           
            for(int i=rs; i<=re; i++){
                ans.add(matrix[i][ce]);
            }
        
            ce -=1;
        
            if(rs<=re){
            for(int i=ce; i>=cs; i--){
                ans.add(matrix[re][i]);
            }
           }
            re -=1;
            
             if(cs<=ce){
            for(int i=re; i>=rs; i--){
                ans.add(matrix[i][cs]);
            }
     }
            cs+=1;
        }
        
        return ans;
    }
}