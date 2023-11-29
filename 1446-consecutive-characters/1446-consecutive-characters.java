class Solution {
    public int maxPower(String s) {
        
        //abceedffffr
        
        //leetcode
        
        //leetcordddde
        
        
        int i=1;
        int ans = 1;
        
        while(i<s.length()){
            
            char prevElm = s.charAt(i-1);
            char curElm = s.charAt(i);
            
            if(curElm == prevElm ){
                
                int countOfSeq = 1;
                
                while(i<s.length() && s.charAt(i) == prevElm){
                    countOfSeq++;
                    i++;
                }
                
                ans = Math.max(ans, countOfSeq);
            }
            else{
                i++;
            }
        }
        
        return ans;
        
        
    }
}