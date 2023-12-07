class Solution {
    public int[] twoSum(int[] nums, int target) {
     
        //array to store final answer
        int answerArray[] = {-1,-1};
        
        int n = nums.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
                
            if(map.containsKey(target-nums[i])){
                answerArray[0] = i;
                answerArray[1] = map.get(target-nums[i]);
            }
            else{
                map.put(nums[i],i);
            }
        }
        
        return answerArray;
        
    }
}