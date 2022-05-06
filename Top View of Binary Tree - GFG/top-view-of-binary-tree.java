// { Driver Code Starts
//Initial Template for JAVA

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Tree {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	
                Solution ob = new Solution();

                ArrayList<Integer> vec = ob.topView(root);
                for(int x : vec)
                    System.out.print(x + " ");
                System.out.println();
        	
                t--;   
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

/*class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        
        //Collections.reverse(arrayli);
        HashMap<Integer,Integer> hash = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minMax[] = new int[2];
        
        top(root,0,hash, minMax);
        
         min = minMax[0];
         max = minMax[1];
         
        // System.out.print(min+" "+max);
         for(int i=min;i<=max;i++){
            list.add(hash.get(i)); 
         }
         
        
     return list;   
    }
    
    public static void top(Node root, int cl, HashMap<Integer,Integer> hash, int[] arr){
     
     if(root == null)
            return;
    
    
       
      if(!hash.containsKey(cl)){
          hash.put(cl,root.data);
          if(cl<arr[0])
        arr[0] = cl;
    
    if(cl>arr[1])
       arr[1] = cl;
      }
      
      top(root.left,cl-1,hash,arr);
      top(root.right,cl+1,hash,arr);
      
        
    }
}
*/

class Solution
{
   
   static ArrayList<Integer> topView(Node root)
   {
     ArrayList<Integer> list=new ArrayList<Integer>();
       if(root==null) return list;
       Queue<Pair> q=new LinkedList<Pair>();
        Map<Integer,Integer> m= new TreeMap<Integer,Integer>();
       q.add(new Pair(0,root));
       m.put(0,root.data);
       
       while(!q.isEmpty())
       {
              Pair c=q.poll();
            if(!m.containsKey(c.hd))  m.put(c.hd,c.node.data);
               if(c.node.left!=null)
               {
                    q.add(new Pair(c.hd-1,c.node.left));
                  
               }
                if(c.node.right!=null) 
                {
                      q.add(new Pair(c.hd+1,c.node.right));
                }
           }
            for(Map.Entry<Integer,Integer> e:m.entrySet())
              list.add(e.getValue());
              
         return list;
       }
  

   }
       
class Pair
   {
       int hd;
       Node node;
       public Pair(int h,Node n)
       {
           hd=h;
           node=n;
       }
   }