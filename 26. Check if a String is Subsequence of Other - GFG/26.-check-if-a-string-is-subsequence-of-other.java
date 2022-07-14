// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{

    public static void main (String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().split(" ");
            String A = S[0];
            String B = S[1];
            Solution ob = new Solution();
            boolean ans = ob.isSubSequence(A,B);
            if(ans)
                System.out.println("True");
            else
                System.out.println("False");
       }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to check if a string is subsequence of other string.
    public static boolean isSubSequence(String A, String B){
     if(B.length()<A.length()) 
       return false;
       
       int n = B.length();
       int m = A.length();
       int j=0;
       for(int i=0;i<n && j<m;i++)
       {
           if(B.charAt(i) == A.charAt(j))
           j++;
       }
       if(j==m)
       return true;
       return false;
    }
}
    
