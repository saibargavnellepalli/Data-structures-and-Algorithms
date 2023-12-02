class Solution {
    public char repeatedCharacter(String s) {
        
         HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
            
            if(map.containsKey(ch)){
                int val = map.get(ch);
                map.put(ch,val+1);
            }
            else{
                map.put(ch,1);
            }
            
            if(map.get(ch) == 2){
                return ch;
            }
        }
        
       return ' ';
    }
}