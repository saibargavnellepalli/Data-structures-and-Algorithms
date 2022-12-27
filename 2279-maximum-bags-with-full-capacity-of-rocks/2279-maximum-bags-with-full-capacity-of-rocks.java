class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int n = capacity.length;
        
        for(int i=0;i<n;i++){
            capacity[i] -=rocks[i];
        }
        
        Arrays.sort(capacity);
        
        int ans = 0;
        
        for(int i=0;i<n;i++){
            if(capacity[i] <= additionalRocks){
                additionalRocks -= capacity[i];
                 ans += 1;
            }
           
        }
        
        return ans;
    }
}