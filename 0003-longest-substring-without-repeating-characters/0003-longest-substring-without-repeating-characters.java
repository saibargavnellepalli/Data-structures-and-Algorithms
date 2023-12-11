class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        HashMap<Character,Integer>  map = new HashMap<>();
        int acq=0, rel=0;
        int ans = 0;
        
        int n = s.length();
        
       for(acq =0; acq<n; acq++){
           
           char curElm = s.charAt(acq);
           
           //substring is invalid
           if(map.containsKey(curElm)){
               
               while(rel< n && map.containsKey(curElm)){
                   map.remove(s.charAt(rel));
                   rel++;
               }
           }
           
           map.put(curElm,acq);
           
           ans = Math.max(acq-rel+1, ans);
           
       }
        
        return ans;
        
    }
}