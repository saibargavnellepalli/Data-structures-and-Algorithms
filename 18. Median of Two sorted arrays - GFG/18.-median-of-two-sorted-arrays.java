// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n,m;
		    n=sc.nextInt();
		    m=sc.nextInt();
		    
		    int arr[]=new int[n];
		    int brr[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<m;i++)
		    {
		        brr[i]=sc.nextInt();
		    }
		    
		     if(n < m)
	        System.out.println(new Solution().findMedian(arr, n, brr, m));
	         else
	        System.out.println(new Solution().findMedian(brr, m, arr, n));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the median of the two arrays when they get merged.
    public static int findMedian(int arr[], int n, int brr[], int m)
    {
            int begin = 0;
       int end = n;
       
       while(begin<=end)
       {
            int i1 = (begin+end)/2;
            int i2 = ((n+m+1)/2)-i1;
            
           int min1 = (i1 == n) ? Integer.MAX_VALUE : arr[i1];
           int max1 = (i1 == 0) ?  Integer.MIN_VALUE: arr[i1-1];
           
           int min2 = (i2 == m) ? Integer.MAX_VALUE : brr[i2];
           int max2 = (i2 == 0) ? Integer.MIN_VALUE : brr[i2-1];
           
           if(max1<=min2 && max2<=min1)
           {
             if((n+m)%2 == 0)
             {
                 
                 return ( (Math.max(max1,max2) + Math.min(min1, min2)) / 2) ;
             }
             
             else
               return (Math.max(max1, max2));
           }
           
           else if(max1>min2)
           end = i1-1;
           
           else
           begin = i1+1;
           
          
       }
       
       return 0;
   }
}