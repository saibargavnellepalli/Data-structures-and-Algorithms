class Solution {
    public int trap(int[] height) {
  int[] left=new int[height.length];
        int[] right=new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        
        for(int i=1,j=height.length-2;i<height.length;i++,j--){
            left[i]=Math.max(left[i-1],height[i]);
            right[j]=Math.max(right[j+1],height[j]);
        }
        
        int unit=0;
        for(int i=0;i<height.length;i++){
            
            unit+=Math.min(left[i],right[i])-height[i];
        }
        
        return unit;
    }
}