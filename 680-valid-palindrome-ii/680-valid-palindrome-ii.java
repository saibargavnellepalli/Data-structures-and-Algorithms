class Solution {
    public boolean validPalindrome(String s) {
      
        int i=0,j=s.length()-1;
        while(i<=j && s.charAt(i)==s.charAt(j))
        {
            i++;
            j--;
        }
        
        if(isPalindrome(i,j-1,s) || isPalindrome(i+1,j,s))
            return true;
        
        return false;
    }
    public boolean isPalindrome(int i,int j,String s){
        
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    
}
        
    
