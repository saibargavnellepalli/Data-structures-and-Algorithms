class Solution {
    public boolean isPalindrome(String s) {
      //create a string which only have the alphanumeric
        //we up -> lc
        //palindrome
        
        String temp = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                temp += ch;
            }
        }
        
        
        String str = temp.toLowerCase();
        
        
        
      return  palindrome(str);
    }
    
    public boolean palindrome(String str){
        int n = str.length();
        int head=0,tail=n-1;
        
        while(head <= tail){
            if(str.charAt(head) != str.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        
        return true;
    }
}