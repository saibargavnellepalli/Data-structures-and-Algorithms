
class Node{
    String val;
    Node next;
    Node prev;
    Node(String val){
        this.val = val;
    }
}

class BrowserHistory {
      Node cur;
     
    public BrowserHistory(String homepage) {
        cur = new Node(homepage);
        
    }
    
    public void visit(String url) {
        cur.next = new Node(url);
        cur.next.prev = cur;
        cur = cur.next;
    }
    
    public String back(int steps) {
        //int i=1;
        
        for(int i=1;i<=steps;i++){
            if(cur.prev == null){
                return cur.val;
            }
            cur = cur.prev;
        }
        
        return cur.val;
    }
    
    public String forward(int steps) {
          //int i=1;
        
        for(int i=1;i<=steps;i++){
            if(cur.next == null){
                return cur.val;
            }
            cur = cur.next;
        }
        
        return cur.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */