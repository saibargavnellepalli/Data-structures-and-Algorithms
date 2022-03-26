// { Driver Code Starts


import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        
        Integer dp[][] = new Integer[price.length][n+1];
        
        
         return maxCut(0,n,price,price.length,dp);
    }
    public int maxCut(int CI, int L, int[] price , int n,Integer[][] dp){
        
        if(L==0)
        return 0;
        
        if(CI>=n)
        return 0;
        
        //dp
        if(dp[CI][L]!=null)
        return dp[CI][L];
        
        int consider = 0;
        
        if((CI+1)<=L){
            consider = price[CI]+maxCut(CI,L-(CI+1),price,n,dp);
        }
        
        int notConsider = maxCut(CI+1,L,price,n,dp);
        
        
        dp[CI][L] =  Math.max(consider, notConsider);
        return   Math.max(consider, notConsider);
            
        }
    }
