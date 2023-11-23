class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        
        int rs=0, re=n-1;
        int cs=0,ce = m-1;
        
        
        while(rs <= re && cs <= ce){
        //step-1
        for(int i=cs; i<=ce; i++){
            ans.add(matrix[rs][i]);
        }
        rs++;
        
        
         //step-2
        for(int i=rs; i<=re; i++){
            ans.add(matrix[i][ce]);
        }
        ce--;
        
        //step-3
        
            if(rs<=re){
        for(int i=ce; i>=cs; i--){
            ans.add(matrix[re][i]);
        }
        re--;
            }
            
            
        if(cs <= ce){
        //step -4
        for(int i=re; i>=rs; i--){
            ans.add(matrix[i][cs]);
        }
        cs++;
        }
        }
        
        
        
        return ans;
        
        
    }
}