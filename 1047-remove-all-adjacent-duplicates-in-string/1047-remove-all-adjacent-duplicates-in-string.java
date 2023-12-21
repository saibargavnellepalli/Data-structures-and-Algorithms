class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(Character ch : s.toCharArray()){
            if(st.isEmpty())
               st.push(ch);
            else if(st.peek() == ch){
                
                   st.pop();
            }
            else{
                  st.push(ch);
            }
        }
        
        
        StringBuilder str = new StringBuilder("");

        while(!st.isEmpty())
               str.append(st.pop());

               return str.reverse().toString();
    }
}