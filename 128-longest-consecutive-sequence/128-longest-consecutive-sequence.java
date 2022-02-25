class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        if(n==1)return 1;
        int max=1,count=1;
        int elem = nums[0];
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
        
        //HashSet approach
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<n;i++){
            hash.add(nums[i]);
        }
        
        for(int i=0;i<n;i++){
            if(hash.contains(nums[i]-1)==false){
                count=1;
                int temp = nums[i];
                while(hash.contains(temp+1)){
                    count++;
                   temp++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}