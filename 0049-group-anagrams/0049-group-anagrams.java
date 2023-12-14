class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       Map<String,ArrayList<String>> map = new HashMap<>();
        
        int n = strs.length;
        for(int i=0;i<n;i++){
            char[] chw = strs[i].toCharArray();
            Arrays.sort(chw);
            String ch = String.valueOf(chw);
            
           if (!map.containsKey(ch)) map.put(ch, new ArrayList<>());
           map.get(ch).add(strs[i]);
        }
     return new ArrayList<>(map.values());
        
        
       
    }
}