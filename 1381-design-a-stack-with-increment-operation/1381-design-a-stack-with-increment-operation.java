class CustomStack { 
    private int [] inc; 
    private int [] stack;
    private int size;
    
    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        inc = new int[maxSize]; 
        size = 0;
    }
    
    public void push(int x) {  
        if (size < stack.length) {
            stack[size++] = x;
        }     
    }
    
    public int pop (){
       if(size > 0) {
            int top = stack[--size] + inc[size];
            if (size > 0) inc[size - 1] += inc[size];
            inc[size] = 0;
            return top;
        }
        return -1;
    
    }
    public void increment(int k, int val) { 
         if (k > size) k = size;
        if (k > 0) inc[k - 1] += val; 
        }
    }
    
	/* The second method - Constant time operations */
        


/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */