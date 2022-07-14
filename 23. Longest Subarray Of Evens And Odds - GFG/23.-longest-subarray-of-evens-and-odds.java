// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //size of array
            int n = Integer.parseInt(read.readLine());
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            
            //inserting elements in the array
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            //calling function    
            System.out.println(new Solution().maxEvenOdd(arr, n));
            
        }
    }
}   // } Driver Code Ends


//User function Template for Java

// User class to complete  
class Solution
{
    // arr[]: input array
    // n: size of array
    //Function to find the length of longest subarray of even and odd numbers.
    public static int maxEvenOdd(int a[], int n)
    {
        // your code here
      for(int i=0; i<n; i++) a[i] %= 2;
       int cnt = 0;
       int maxCnt = 0;
       
       for(int i=0; i<n-1; i++) {
           
           if(a[i] == a[i+1]) {
               cnt = 0;
           }
           else {
               cnt++;
               maxCnt = Math.max(cnt, maxCnt);
           }
           
       }
       
       return maxCnt+1;
   }
}