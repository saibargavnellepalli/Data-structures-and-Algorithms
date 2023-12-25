class MyStack {

    Queue<Integer> q;
    
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        
        int length = q.size();
        //add x to queue
        q.add(x);
        
        // reverse the queue
        for(int i=1; i<=length; i++){
            int cur = q.poll();
            q.offer(cur);
        }
    }
    
    public int pop() {
        
        
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */