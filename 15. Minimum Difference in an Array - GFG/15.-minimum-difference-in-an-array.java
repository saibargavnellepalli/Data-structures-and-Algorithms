// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t-- > 0){
	    int n = sc.nextInt();
	    int[] arr = new int[n]; 
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    Solution ob = new Solution();
	    int diff = ob.MinimumDifference(arr, n);
	    System.out.println(diff);
	}
}
}// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to find minimum difference between any pair of elements in an array.
    public static int MinimumDifference(int arr[], int n)
    {
        // code here
        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            min = Math.min(arr[i]-arr[i-1],min);
        }
        return min;
    }
};