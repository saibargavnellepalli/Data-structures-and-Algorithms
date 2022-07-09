class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> set = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char currElm = s.charAt(i);
            if(set.containsKey(currElm)){
                set.put(currElm,set.get(currElm)+1);
            }
            else{
                set.put(currElm,1);
            }
        }
        for(int i=0;i<s.length();i++){
            char currElm = s.charAt(i);
            if(set.get(currElm)==1)
                return i;
           
         }
        
        return -1;
        
    }
}