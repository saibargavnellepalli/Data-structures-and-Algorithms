// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int arr[], int n) {
        
        // Your code here
       int totalSum = arr[0];
       int sum = arr[0], maxEnding = arr[0];
       int circularSum = arr[0], minEnding= arr[0];
       for(int i=1;i<n;i++){
           totalSum+=arr[i];
           maxEnding= Math.max(maxEnding+arr[i],arr[i]);
           sum = Math.max(sum,maxEnding);
           minEnding= Math.min(minEnding+arr[i],arr[i]);
           circularSum = Math.min(circularSum,minEnding);
       }
       if(sum<0)
           return sum;
       circularSum= totalSum-circularSum;
       return Math.max(sum,circularSum);
   }
    
}

