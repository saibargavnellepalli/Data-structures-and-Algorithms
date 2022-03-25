// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    
    
    {
        // code here
        
        
        int[][] dp = new int[N][W+1];
        
        for(int i=0;i<N;i++)
            for(int j=0;j<W+1;j++)
            dp[i][j] = -1;
            
        return maxProfit(0,W,val,wt,N,dp);
    }
    
    public static int maxProfit(int CI,int cap,int[] val, int[] wt,int n,int[][] dp){
        
        if(CI==n)
        return 0;
        
        if(cap==0)
        return 0;
    
          if(dp[CI][cap]!=-1)
       return dp[CI][cap];
    
  
    
     int consider=0;

        if(cap>=wt[CI]){
          
          consider = val[CI]+maxProfit(CI,cap-wt[CI],val,wt,n,dp);
          
        }
        
        int notConsider = maxProfit(CI+1,cap,val,wt,n,dp);
        
       int ans = Math.max(consider,notConsider);
        
         dp[CI][cap] = ans;
        
        return ans;
        
    }
}