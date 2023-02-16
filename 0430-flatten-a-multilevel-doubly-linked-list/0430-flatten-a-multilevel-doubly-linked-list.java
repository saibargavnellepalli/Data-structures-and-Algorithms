/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        
        if(head == null) return head;
        Node it = head;
        
        while(it != null){
            
            if(it.child != null){
                Node next = it.next;
                
                it.next = flatten(it.child);
                it.next.prev = it;
                
                it.child = null;
                
                while(it.next != null){
                    it = it.next;
                }
                
                if(next != null){
                    it.next = next;
                    it.next.prev = it;
                }
            }
            
            it = it.next;
        }
        
        return head;
    }
}