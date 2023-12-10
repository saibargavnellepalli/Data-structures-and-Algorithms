class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        int rel = 0;        
        int ans = 0;
        
        for(int acq=0; acq<n; acq++){
                
            char ch = s.charAt(acq);
            
            if(map.containsKey(ch)){
                
                while(rel < n && map.containsKey(ch)){
                    map.remove(s.charAt(rel));
                    rel++;
                }
                map.put(ch,acq);
            }
            else{
                map.put(ch,acq);
                
               
                ans = Math.max(acq-rel+1,ans);
            }
        }
        
        return ans;
    }
}