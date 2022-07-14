// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.divAndSub(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String divAndSub(int N) {
        // code here
              if(N == 1)
          return "Arya";
       if(N<5) return "Jon";
      int a[]=new int[N+1];
      
      for(int i=1; i<=5; i++)
          a[i] = 1;
          
      for(int i=6; i<=N; i++)
      {
          if (a[i/2] == 0)
              a[i] = 1;
          else if (a[i-2] == 0)
              a[i] = 1;
              
          if (a[i/3] == 0)
              a[i] = 1;
          else if (a[i-3] == 0)
              a[i] = 1;
          
          if (a[i/4] == 0)
              a[i] = 1;
          else if (a[i-4] == 0)
              a[i] = 1;
              
          if (a[i/5] == 0)
              a[i] = 1;
          else if (a[i-5] == 0)
              a[i] = 1;
      }
      
      if (a[N] == 1)
          return "Jon";
      else
          return "Arya";
  
   
    }
};