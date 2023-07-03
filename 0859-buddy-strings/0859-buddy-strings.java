class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
           
        int n1 = s.length();
        int n2 = goal.length();
        
        for(int i=0;i<n1;i++){
            char ch = s.charAt(i);
            if(map1.containsKey(ch)){
                int val = map1.get(ch);
                map1.put(ch,val+1);
            }
            else{
                map1.put(ch,1);
            }
        }
        
         
        for(int i=0;i<n2;i++){
            char ch = goal.charAt(i);
            if(map2.containsKey(ch)){
                int val = map2.get(ch);
                map2.put(ch,val+1);
            }
            else{
                map2.put(ch,1);
            }
        }
        

        
     
        int i=0,j=0;
        
        if(n1 != n2) return false;
        
        int count = 0;
        int temp=0;
        
        while(i<n1){
            if(s.charAt(i) != goal.charAt(j)){
                count++;
            }
            else{
                temp++;
            }
            
            i++;
            j++;
        }
        
        if(count == 2 ) {
             for(Map.Entry<Character,Integer> cur : map1.entrySet()){
               char ch = cur.getKey();
               int val = cur.getValue();
               
               if(map2.get(ch) == null  || map2.get(ch) != val) return false;
           } 
            return true;
        }
        
        if(temp == n1){
           for(Map.Entry<Character,Integer> cur : map1.entrySet()){
               char ch = cur.getKey();
               int val = cur.getValue();
               
               if(map2.get(ch) >= 2) return true;
           }   
        }
        
        return false;
    }
    
    
    // cvara  //cvara
    
        
}