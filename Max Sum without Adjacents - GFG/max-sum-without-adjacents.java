//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
        Integer dp[] = new Integer[n+3];
        return f(0,0,arr,dp);
    }
    
    public int f(int i,int sum, int[] arr, Integer[] dp){
        
        if(i>=arr.length)  return 0;
        
        if(dp[i] != null)
           return dp[i];
        
        int pick = arr[i]+f(i+2,sum,arr,dp);
        int notPick = 0+ f(i+1,sum,arr,dp);
        
        return dp[i]= Math.max(pick, notPick);
    }
}