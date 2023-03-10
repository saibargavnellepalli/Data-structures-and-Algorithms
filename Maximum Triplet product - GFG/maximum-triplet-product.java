//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    Long maxTripletProduct(Long arr[], int n)
    {
        // Complete the function
        long ans = Integer.MIN_VALUE;
        Arrays.sort(arr);
        
        long largest = (arr[n-1]*arr[n-2]*arr[n-3]);
        ans = Math.max(ans,largest);
        
        largest = (arr[n-1]*arr[0]*arr[1]);
        ans = Math.max(ans,largest);
        
        int neg = 0;
        int pos = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < 0)
               neg = i;
            else
             pos++;
        }
        
        if(pos==2){
        largest = (arr[n-1]*arr[n-2]*arr[neg]);
        ans = Math.max(ans,largest);
        }
        
        if(neg>=2){
           largest = (arr[neg]*arr[neg-1]*arr[neg-2]);
        ans = Math.max(ans,largest); 
        }
        
        return ans;
    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    
		    Long[] arr = new Long[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Long.parseLong(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    Long res = obj.maxTripletProduct(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}


// } Driver Code Ends