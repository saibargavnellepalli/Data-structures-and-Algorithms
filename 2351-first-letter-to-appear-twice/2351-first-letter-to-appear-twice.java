class Solution {
    public char repeatedCharacter(String s) {
        
       
        // abcddz
        
        // a- 1
        // b - 1
        // c - 1
        // d - 2
        
        // abddbrcb
        
        // a - 1
        // b -1
        // d - 2
        //
        
        // Hashmap
        // Ocuurance -> while finding it, check if at any point
                   // the value becomes 2 
        
        // code
        HashMap<Character , Integer > map = new HashMap<>();
        int n = s.length();
        
        for(int i=0;i<n;i++){
            
            char ch = s.charAt(i);
            
            if(map.containsKey(ch)){
                int val = map.get(ch);
                val+=1;
                map.put(ch,val);
            }
            else{
                map.put(ch,1);
            }
            
            int val = map.get(ch);
            
            if(val == 2){
                return ch;
            }
            
        }
        
        return ' ';
        
    }
}