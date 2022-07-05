class Solution {
    public int longestConsecutive(int[] nums) {
     //   Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        if(n==1)return 1;
        int ans=0,count=1;
        //int elem = nums[0];
     /*   for(int i=1;i<n;i++){
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
        */
        
     HashSet<Integer> set = new HashSet<>();
        for(int e : nums)
            set.add(e);
        
        for(int i=0;i<n;i++){
            if(!set.contains(nums[i]-1)){
                int conSeqCount = 1;
                int currNum = nums[i];
                while(set.contains(currNum+1)){
                  
                    conSeqCount++;
                    currNum++;
                }
                ans = Math.max(conSeqCount,ans);
            }
        }
        return ans;
    }
}