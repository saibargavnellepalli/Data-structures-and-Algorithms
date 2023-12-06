class Solution {
    public char repeatedCharacter(String s) {
        
        //question
        //approach -> find occurance 
        //code
        
        
        // aradccd
        
        // find freq
        // if count is 2 -> that is the answer
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            
            if(map.containsKey(ch)){
                int val = map.get(ch);
                val = val+1;
                map.put(ch,val);
            }
            else{
                map.put(ch,1);
            }
            
            
            if(map.get(ch) == 2) return ch;
        }
        
        
        return ' ';
        
        
        
    }
}