class Solution {
     List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        
        combinations(0,0,candidates,target,list);
        return ans;
    }
    
    public void combinations(int i, int sum, int[] arr, int k, List<Integer> list){
        
        //System.out.println(sum);
         if(sum==k){
                ans.add(new ArrayList<>(list));
            }
        if(sum >= k) return;
        
        
        if(i==arr.length){
           
            return;
        }
        
        list.add(arr[i]);
        sum += arr[i];
        
        combinations(i,sum,arr,k,list);
        
        int n = list.size();
        sum-=arr[i];
        list.remove(n-1);
        
        combinations(i+1,sum,arr,k,list);
    }
}