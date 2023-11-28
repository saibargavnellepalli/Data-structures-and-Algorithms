class Solution {
    public boolean isPalindrome(String s) {
        
        String temp = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                temp += ch;
            }
        }
        
        temp = temp.toLowerCase();
        
        int i=0;
        int j=temp.length()-1;
        
        System.out.println(temp);
        while(i<=j){
            if(temp.charAt(i) != temp.charAt(j)){
                return false;
                
                
            }
            i++;
            j--;
        }
        
        return true;
        
    }
}