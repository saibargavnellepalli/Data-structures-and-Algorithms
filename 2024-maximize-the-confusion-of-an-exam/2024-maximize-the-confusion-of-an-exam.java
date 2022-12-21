class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE,freqCh = Integer.MIN_VALUE;
        int n = s.length();
        int left=0, right=0;
        while(left<n && right<n){
            char curCh = s.charAt(right);
            if(!map.containsKey(curCh)){
                map.put(curCh,1);
            }
            else{
                map.put(curCh, map.get(curCh)+1);
            }
            
            freqCh = Math.max(map.get(curCh), freqCh);
            
            int rem = (right - left + 1) - freqCh;
            
            if(rem > k){
                map.put(s.charAt(left), map.get(s.charAt(left))-1);
                left += 1;
            }
            else{
                ans = Math.max(right - left + 1, ans);
            }
            
            right += 1;
        }
        
        return ans;
    }
}