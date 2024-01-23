class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int n = nums.size();
      for(int i=0; i<n; i++){
          int c =0;
          for(int j=0; j<n; j++){
              if(nums[j] == nums[i]) c++;
          }
          
          if(c==1) return nums[i];
      }
        
        return nums[nums.size()-1];
    }
};