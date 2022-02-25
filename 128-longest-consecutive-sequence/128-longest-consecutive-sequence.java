class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        if(n==1)return 1;
        int max=1,count=1;
        int elem = nums[0];
        for(int i=1;i<n;i++){
           if(nums[i]==elem+1) {
               count++;
               elem++;
               max = Math.max(max,count);
           }
            else if(elem==nums[i]) continue;
            else{
                count=1;
                elem = nums[i];
            }
            
        }
        return max;
    }
}