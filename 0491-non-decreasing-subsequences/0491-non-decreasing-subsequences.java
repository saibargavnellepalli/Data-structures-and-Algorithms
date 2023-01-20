class Solution {
    

    public List<List<Integer>> findSubsequences(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        Set<List<Integer>> ans = new HashSet<>();
        
        int n = nums.length;
         f(0,nums,list,n,ans);
        return new ArrayList<>(ans);
    }
    
    public void f(int i, int[] arr, List<Integer> list, int n,Set<List<Integer>> ans){
            if(i>=n){
                if(list.size()>=2) ans.add(new ArrayList<>(list));
                return;
            }     
         
        if(list.size() == 0 || list.get(list.size()-1) <= arr[i]){
            list.add(arr[i]);
             f(i+1,arr,list,n,ans);
            list.remove(list.size()-1);
        }
         f(i+1,arr,list,n,ans);
                     
                     return;
                     
    }
}