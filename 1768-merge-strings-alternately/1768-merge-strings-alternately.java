class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n= word1.length();
        int m = word2.length();
        int i=0,j=0;
        String ans = "";
        boolean first = true;
        
        while(i<n || j<m){
            
            if(first){
                
                if(i<n)
                    ans += word1.charAt(i++);
            
                first = false;
          
            }
            else{
                if(j<m)
                    ans += word2.charAt(j++);
                first = true;
            }
        }
        
        return ans;
        
    }
}