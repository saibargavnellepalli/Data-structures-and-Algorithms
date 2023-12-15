class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      
        //sorting
        // hashmap
        
        
        HashMap<String,  ArrayList<String>>  map = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            
            //sort
            char chw[] = strs[i].toCharArray();
            
            Arrays.sort(chw);
            
            String key = String.valueOf(chw);
            
            // check if sorted string is present or not
            
            // if present add to the hasmap otherwise create a entry 
            
            
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(strs[i]);
        }
        
        
        return new ArrayList<>(map.values());
        
    }
}