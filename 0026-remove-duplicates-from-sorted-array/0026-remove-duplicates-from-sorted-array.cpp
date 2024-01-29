class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int n = nums.size();
        
        int first = 0;
        
        for(int s=0; s<n; s++){
            
            if(nums[first] != nums[s]){
                first++;
                nums[first] = nums[s];
            }
        }
        
        return first+1;
    }
};