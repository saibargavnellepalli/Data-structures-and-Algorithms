class Solution {
    public int[] countBits(int n) {
       
        int ans[] = new int[n+1];
        
        for(int i=0;i<=n;i++){
            int cur = bits(i);
            ans[i] = cur;
        }
        
        return ans;
    }
    
    public int bits(int n){
        
        int count = 0;
        
        while(n > 0){
            if(n%2 != 0){
                count++;
            }
            n/=2;
        }
        
        return count;
    }
}