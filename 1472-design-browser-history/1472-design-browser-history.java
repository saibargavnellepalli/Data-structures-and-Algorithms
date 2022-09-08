class DLLNode{
    String url;
    DLLNode next ;
    DLLNode prev ;
    
    DLLNode(String url){
        this.url = url;
        
    }
}

class BrowserHistory {
    
   DLLNode head = null;
   DLLNode curPointer = null;
    
    public BrowserHistory(String homepage) {
        head = new DLLNode(homepage);
         curPointer = head;
    }
    
    public void visit(String url) {
       DLLNode newNode = new DLLNode(url);
        curPointer.next = newNode;
        newNode.prev = curPointer;
        curPointer = newNode;
        return;
    }
    
    public String back(int steps) {
        int i=1;
        while(curPointer.prev != null && steps>0){
            curPointer = curPointer.prev;
            steps-=1;
        }
        return curPointer.url;
    }
    
    public String forward(int steps) {
        int i=1;
        while(curPointer.next != null && steps>0){
            curPointer = curPointer.next;
            steps -=1;
        }
        return curPointer.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */