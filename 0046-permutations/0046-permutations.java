class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> ds = new ArrayList<>();
        boolean flag[] = new boolean[nums.length];
        
        f(ds,flag,ans,nums);
        return ans;
    }
    
    public void f(List<Integer> ds, boolean flag[], List<List<Integer>> ans,int nums[]){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!flag[i]){
                ds.add(nums[i]);
                flag[i] = true;
                f(ds,flag,ans,nums);
                ds.remove(ds.size()-1);
                flag[i] = false;
            }
            
        }
    }
}