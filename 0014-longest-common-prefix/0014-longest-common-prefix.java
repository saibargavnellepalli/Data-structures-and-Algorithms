class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        Arrays.sort(strs);
        
       String first = strs[0];
       String second = strs[strs.length-1];
        
        
        int ind=0;
        
        String ans = "";
        while(ind<first.length()){
            
            if(first.charAt(ind) == second.charAt(ind)){
                ans += first.charAt(ind);
                ind++;
            }
            else{
                break;
            }
        }
        
              
              return ans;
        
        
    }
}