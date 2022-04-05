class Solution {
    public int maxArea(int[] height) {
       
        int left = 0;
        int right = height.length-1;
        int max = 0;
        
        while(left<=right){
            
            //Minimum of element present at left index and right index
            int minVal = Math.min(height[left],height[right]);
             
            //Update maximum value if current current area is more than previous
            max = Math.max(minVal*(right-left),max);
            
            //move right wards if left index is less than right because we may find container having more area in right side and otherwise move towards left
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        
        return max;
    }
}