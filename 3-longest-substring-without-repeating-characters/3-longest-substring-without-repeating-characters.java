class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        
        int n = s.length(), acq=0, rel=0,ans=0;
        while(acq<n){
            if(set.contains(s.charAt(acq))){
              
                set.remove(s.charAt(rel));
                rel++;
            }
            else{
                set.add(s.charAt(acq));
                  ans = Math.max(ans,set.size());
                acq++;
            }
        }
        return ans;
    }
}