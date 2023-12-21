class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        
        int nge[] = new int[nums2.length];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<nums2.length; i++){
            
               while(!st.isEmpty()  &&  nums2[i] > nums2[st.peek()] ){
                   nge[st.peek()] = nums2[i];
                   
                   st.pop();
               }
            
            st.push(i);
        }
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums2.length;i++){
            
            if(nge[i] == 0) nge[i] = -1;
            
            map.put(nums2[i], nge[i]);
        }
        
        int ans[] = new int[nums1.length];
        
        for(int i=0;i<nums1.length; i++){
             ans[i] = map.get(nums1[i]);
        }
        
        return ans;
        
    }
}