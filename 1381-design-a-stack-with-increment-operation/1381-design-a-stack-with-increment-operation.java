class CustomStack {
        int n;
        int arr[];
    int ind=-1;
    
    public CustomStack(int maxSize) {
        n = maxSize;
        arr = new int[n];
        
        
    }
    
    public void push(int x) {
        if(ind+1<n){
            arr[++ind] = x;
        }
        
    }
    
    public int pop() {
        if(ind>=0){
          return arr[ind--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        if(k>=n) k = n;
        for(int i=0;i<k;i++){
            arr[i]+=val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */