// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    static void printSorted(ArrayList<Integer> list)
    {
        for(Integer x : list)
        System.out.print(x + " ");
    }
    public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		    int A[] = new int[a];
		    int B[] = new int[b];
		    int C[] = new int[c];
		    
		    for(int i = 0; i < a; i++)
		      A[i] = sc.nextInt();
		      
		    for(int i = 0; i < b; i++)
		      B[i] = sc.nextInt();
		      
		    for(int i = 0; i < c; i++)
		      C[i] = sc.nextInt();
		    
		    printSorted(new Solution().merge3sorted(A, B, C));
		    System.out.println();
		    
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
      // A[], B[], C[]: input arrays
   //Function to merge three sorted lists into a single list.
   static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
   {
       // add ypur code here
         ArrayList<Integer> result = new ArrayList<>();
      int l1 = A.length, l2 = B.length, l3 = C.length;
      int[] arr = new int[l1+l2];
      merge(A,B,arr,l1,l2);
      int arrLen = arr.length;
      int[] res = new int[arrLen+l3];
      merge(arr,C,res,arrLen,l3);
      for(int a : res)
          result.add(a);
      return result;
  }
  static void merge(int[]arr1, int[] arr2, int[] res,int l1, int l2){
      int i = 0, j = 0, k = 0;
      while( i < l1 && j < l2){
          if(arr1[i] < arr2[j])
              res[k++] = arr1[i++];
          else
              res[k++] = arr2[j++];
      }
      while( i < l1)
          res[k++] = arr1[i++];
      while( j < l2)
          res[k++] = arr2[j++];
   }
}

