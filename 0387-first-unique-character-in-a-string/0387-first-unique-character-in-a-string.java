class Solution {
    public int firstUniqChar(String s) {
       
        // "loveleetcode"
        
        // l - 2
        // o - 2
        // e - 4
        // v - 1
        // t - 1
        // c - 1
        // d - 1
        
        
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
         
        }
        
        
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if( map.get(ch) == 1){
                return i;
            }
        }
        
        return -1;
        
        
        
        
        
    }
}