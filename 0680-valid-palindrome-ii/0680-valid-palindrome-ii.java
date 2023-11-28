class Solution {
    public boolean validPalindrome(String s) {
       
        // aaab  cddcf   baaa
        // aaab  fcddc   baaa
        
        int i=0;
        int j=s.length()-1;
        
        while(i<s.length() && j>=0 && s.charAt(i) == s.charAt(j)){
            i++;
            j--;
        }
        
      boolean deleteAtI = isPal(i+1,j,s);
      boolean deleteAtJ = isPal(i,j-1,s);
        
        return deleteAtI || deleteAtJ;
  
    }
    
    public static boolean isPal(int i, int j, String s){
          while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
                
                
            }
            i++;
            j--;
        }
        
        return true;
    }
    
}