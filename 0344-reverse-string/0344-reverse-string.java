class Solution {
    public void reverseString(char[] s) {
        
        
        
        // we moved the last element to first and first element to last 
        // repeat this
        
        int start =0, end = s.length-1;
        
        
        while(start <= end){
            //swaping
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        
            start++;
            end--;
            
        }
        
        
        
        
        
        
    }
}