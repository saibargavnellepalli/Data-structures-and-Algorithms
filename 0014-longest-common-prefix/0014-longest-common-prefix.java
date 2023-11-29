class Solution {
    public String longestCommonPrefix(String[] strs) {
      
        
        
        
        // strs = ["flower","flow","flight"]
        
        int n = strs.length;
        
        Arrays.sort(strs);
        
       String firstString = strs[0];
       String lastString = strs[n-1];
        
        int ind = 0;
        String ans = "";
        while(ind < firstString.length()){
            
            char fsc = firstString.charAt(ind);
            char lsc = lastString.charAt(ind);
            
            if(fsc == lsc){
                ans += fsc;
                ind++;
            }
            else{
                break;
            }
        }
        
        return ans;
            
            
        
    }
}