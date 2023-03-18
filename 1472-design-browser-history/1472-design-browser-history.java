class Node{
    String val;
    Node prev;
    Node next;
    
    Node(String url){
        val = url;
    }
}

class BrowserHistory {
    Node head;
    int size = 0;
    
    public BrowserHistory(String homepage) {
       head = new Node(homepage);
       //size += 1;
        
    }
    
    public void visit(String url) {
        head.next = new Node(url);
        head.next.prev = head;
        head = head.next;
        
    }
    
    public String back(int t) {
       // int t = size;
        while(head.prev != null && t > 0){
              //if(head.prev == null) return head.val;
            head = head.prev;
            t--;
        }
       
        return head.val;
    }
    
    public String forward(int t) {
        //int t = size;
         while(head.next != null && t > 0){
             //if(head.next == null) return head.val;
            head = head.next;
             
            t--;
        }
        
       
        
        return head.val;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */