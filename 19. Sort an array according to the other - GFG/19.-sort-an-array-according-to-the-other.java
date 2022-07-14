// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


 // } Driver Code Ends
//User function Template for Java

//class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
  //  public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
 class Solution{
   // A1[] : the input array-1
   // N : size of the array A1[]
   // A2[] : the input array-2
   // M : size of the array A2[]
   
   //Function to sort an array according to the other array.
   public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
   {
       //Your code here
       LinkedHashSet<Integer> h = new LinkedHashSet<>();
       TreeMap<Integer, Integer> m = new TreeMap<>();
      
      // A2 in LinkedHashSet to maintains order and remove duplicates 
       for(int x : A2) {
           h.add(x);
       }
       
       // Creating frequency table for A1
       //Using tree map to maintian sorted order
       for(int x : A1) {
           m.put(x,m.getOrDefault(x,0)+1);
       }
       
       int res[] = new int[N];
       int ind = 0;
      
      //Iterating through HashSet of A2 and 
      //finding corresponding elements in A1 and 
      //adding it to array 'res' repeatedly for Frequency of that element
       for(int x : h){
           if(m.containsKey(x)) {
               for(int i=0; i<m.get(x); i++){
                   res[ind]=x;
                   ind++;
               }
           }
       }
       
       // Adding remaining elements of A1
       for(Map.Entry<Integer, Integer> e : m.entrySet()){
           if(!h.contains(e.getKey())) {
               for(int i=0; i<e.getValue(); i++){
                   res[ind] = e.getKey();
                   ind++;
               }
           }
       }
       
       return res;
   }
}



// { Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}


  // } Driver Code Ends