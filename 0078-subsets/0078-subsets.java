class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
            
        List<Integer> list = new ArrayList<>();
        sub(0, nums, list);
        
        return ans;
    }
    
    public void sub(int i, int[] nums, List<Integer> list){
        
        if(i == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[i]);
        
        sub(i+1, nums, list);
        
        int n = list.size();
        
        list.remove(n-1);
        
        sub(i+1, nums, list);
        
        
        
    }
}