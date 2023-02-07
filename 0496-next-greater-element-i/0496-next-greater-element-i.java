class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
         Stack<Integer> st = new Stack<>();
        int pre[] = new int[nums2.length];
        
        for(int i=nums2.length-1;i>=0;i--){
            
            if(st.isEmpty()){
                st.push(nums2[i]);
                pre[i] = -1;
            }
            else{
                if(nums2[i] < st.peek()){
                    pre[i] = st.peek();
                    st.push(nums2[i]);
                }
                else{
                    while(st.isEmpty()==false && st.peek() < nums2[i]){
                        st.pop();
                    }
                    if(st.isEmpty())
                        pre[i] = -1;
                    else
                    pre[i] = st.peek();
                    st.push(nums2[i]);
                }
            }
            
     }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],i);
        }
        
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
           int ind = map.get(nums1[i]);
            ans[i] = pre[ind];
        }
        
        return ans;
        
    }
    /*
   
        */
}