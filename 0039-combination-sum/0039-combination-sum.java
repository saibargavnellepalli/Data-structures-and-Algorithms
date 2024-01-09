class Solution {
    
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<Integer> list = new ArrayList<>();
        combi(0,0,candidates, target, list);
        
        return ans;
    }
    
    
    public void combi(int i, int sum, int[] arr, int k, List<Integer> list){
        
        if(sum == k){
            ans.add(new ArrayList<>(list));
        }
        
        if(sum >= k|| i == arr.length){
            return;
        }
        
        list.add(arr[i]);
        sum += arr[i];
        combi(i, sum, arr, k, list);
        
        int n = list.size();
        sum -= arr[i];
        list.remove(n-1);
        
        combi(i+1, sum, arr,k, list);
        
    }
}