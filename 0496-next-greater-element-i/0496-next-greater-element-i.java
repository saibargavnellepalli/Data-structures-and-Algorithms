class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
          int ans[] = new int[nums2.length];
        //step-1
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<nums2.length; i++){
            
            
            while(!st.isEmpty() && nums2[i] > nums2[st.peek()]){
                
                ans[st.peek()] = nums2[i];
                
                st.pop();
                
            }
            
           
                st.push(i);
            
        }
        
        //2nd step
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums2.length; i++){
            
            if(ans[i] == 0) ans[i] = -1;
           map.put(nums2[i], ans[i]);
        }
        
        //3rd step
        int finalAns[] = new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            finalAns[i] = map.get(nums1[i]);
        }
        
        return finalAns;
        
        
    }
}