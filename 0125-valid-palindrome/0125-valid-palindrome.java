class Solution {
    public boolean isPalindrome(String s) {
        
        
// "Abca" -> "abca"
// 3 steps 
// 1) we have to remove all non-alphanumeric 
// 2) convert the string to lowercase
// 3) after doing above steps, we have to find if the string is palindrome or not


        //step-1
     String newStr = "";
 
        for(int i=0;i<s.length();i++){
            
            if(Character.isLetterOrDigit(s.charAt(i)) == true){
                newStr += s.charAt(i);
            }
            
        }
        
      
        
        //step-2
        
       newStr = newStr.toLowerCase();
        
        //step-3 
        
        int start =0, end = newStr.length()-1;
        
        while(start <= end){
            
            if(newStr.charAt(start) != newStr.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
        
        
        
    }
}