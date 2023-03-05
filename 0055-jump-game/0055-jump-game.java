class Solution {
    ArrayList<Integer> al = new ArrayList<>();
    public boolean canJump(int[] nums) {
      Boolean[] dp = new Boolean[nums.length];
        return jump(0,nums,dp);
       
    }
    
    // 1) -> 1->arr[i]
    public boolean jump(int ind,int nums[], Boolean[] dp ){
        
        if(ind == nums.length-1) {
            
            return true;
        }
        
        if(ind >= nums.length) return false;
        
        if(dp[ind] != null) return dp[ind];
        
        boolean ans = false;
        
        for(int i=1;i<=nums[ind];i++){
           
                //al.add(i);
            boolean t = jump(ind+i,nums,dp);
            
            if(t==true) return t;
           
            ans = t || ans;
            
           
               
            
        }
        dp[ind] = ans; 
        
        return ans;
    }
}