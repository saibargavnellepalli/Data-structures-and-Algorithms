class Solution {
    public String removeStars(String s) {
        
        Stack<Character> st = new Stack<>();
        
        for(char ch : s.toCharArray()){
            
            if(ch == '*') st.pop();
            
            else st.push(ch);
        }
        
        
        StringBuilder str = new StringBuilder("");
        
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        
        return str.reverse().toString();
    }
}