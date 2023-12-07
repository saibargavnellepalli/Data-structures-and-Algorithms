class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = {-1,-1};
        
        int n = nums.length;
        for(int i=0;i<n;i++){
            int b = nums[i];
            
            
            if(map.containsKey(target-b)){
             ans[0] = i;
             ans[1] = map.get(target-b);
            }
            
            map.put(b,i);
        }
        
        return ans;
    }
}