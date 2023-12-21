class Solution {
    public int[] dailyTemperatures(int[] arr) {
     
        
        int ans[] = new int[arr.length];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
                
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                   
                    ans[st.peek()] = i-st.peek();
                st.pop();
            }
            
            st.push(i);
        }
        
        return ans;
    }
}