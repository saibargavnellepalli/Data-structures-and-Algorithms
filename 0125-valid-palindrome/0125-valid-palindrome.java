class Solution {
    public boolean isPalindrome(String s) {
        
        
        String temp = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                temp += ch;
            }
        }
        
        s = temp.toLowerCase();
        
        int i=0, j=s.length()-1;
        
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