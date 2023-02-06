class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[n+n];
        
        int a = 0, b=n;
        for(int i=0;i<2*n;i++){
            ans[i] = nums[a++];
            i++;
            ans[i] = nums[b++];
        } 
        
        return ans;
    }
}