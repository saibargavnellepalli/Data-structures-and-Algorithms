class Solution {
public:
    int missingNumber(vector<int>& nums) {

            int n = nums.size();
            for(int i=0; i<=n ;i++){
 
              bool ans  = isPresent(i, nums);
 
                if(ans == false){
                    return i;
                }
 
            }
        
        return -1;
    }
    
       bool isPresent(int key, vector<int>& nums){
 
        int n = nums.size();
 
        for(int i=0; i<n;i++){
 
            if(nums[i]  == key ){
                return true;
            }
        }
 
        return false;
 
    }
};