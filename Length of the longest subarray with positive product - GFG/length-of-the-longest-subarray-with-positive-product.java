//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            int arr[] = new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
             arr[i] = Integer.parseInt(s[i]);
             
            out.println(new Solution().maxLength(arr, n)); 
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    /* Function to return the length of the
       longest subarray with ppositive product */
    int maxLength(int arr[], int N) { 
        //code here
      int Pos = 0;
 
    // Stores the length of current
    // subarray with negative product
    int Neg = 0;
 
    // Stores the length of the longest
    // subarray with positive product
    int res = 0;
 
    for (int i = 0; i < N; i++)
    {
        if (arr[i] == 0)
        {
            // Reset the value
            Pos = Neg = 0;
        }
 
        // If current element is positive
        else if (arr[i] > 0)
        {
            // Increment the length of
            // subarray with positive product
            Pos += 1;
 
            // If at least one element is
            // present in the subarray with
            // negative product
            if (Neg != 0)
            {
                Neg += 1;
            }
 
            // Update res
            res = Math.max(res, Pos);
        }
 
        // If current element is negative
        else
        {
            Pos = Pos + Neg;
            Neg = Pos - Neg;
            Pos = Pos - Neg;
 
            // Increment the length of subarray
            // with negative product
            Neg += 1;
 
            // If at least one element is present
            // in the subarray with positive product
            if (Pos != 0)
            {
                Pos += 1;
            }
 
            // Update res
            res = Math.max(res, Pos);
        }
    }
    return res;
    }
   
}