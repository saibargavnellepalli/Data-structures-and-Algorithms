class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int ans[] = new int[spells.length];
        
        Arrays.sort(potions);
         
        for(int i=0;i<spells.length;i++){
            ans[i] = bs(spells[i],success,potions);
        }
        
        return ans;
        
        
        
        
        
    }
    
    
    
    public int bs(int mul, long key, int[] arr){
        int s=0,e=arr.length-1;
        int ans=0;
        int m=0;
        while(s<=e){
           m = s+(e-s)/2;
            long product = (long) mul * arr[m];
            if(product >= key){
                ans = (arr.length-m);
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        
        return ans;
    }
}