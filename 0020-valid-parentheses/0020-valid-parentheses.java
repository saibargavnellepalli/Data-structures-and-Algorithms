class Solution {
    public boolean isValid(String s) {
        
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            //open 
            if(ch == '('  || ch == '{'  || ch == '['){
                st.push(ch);
            }
            else{
                //close character
                
                if(st.isEmpty()) return false;
                
                if(ch == '}'  && st.peek() != '{')  return false;
                
                if(ch == ')'  && st.peek() != '(')  return false;
                
                if(ch == ']'  && st.peek() != '[')  return false;
                
                
                st.pop();
            }
            
            
        }
        
        
        if(st.isEmpty()) return true;
        
        return false;
        
        
    }
}