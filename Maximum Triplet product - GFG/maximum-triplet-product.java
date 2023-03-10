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
        
        // 3 largest, 2 smallest
        
        three_largest(arr);
        two_Smallest(arr);
        
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
        
       
        
        return ans;
    }
    public void three_largest(Long arr[]){
        long max1=Integer.MIN_VALUE;
        long max2 = Integer.MIN_VALUE;
        long max3 = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i] > max3){
                max3 = arr[i];
            }
            
        }
        
        int n = arr.length;
        arr[n-1] = max1;
        arr[n-2] = max2;
        arr[n-3] = max3;
    }
    
    public void two_Smallest(Long arr[]){
        long max1 = Integer.MAX_VALUE;
        long max2 = Integer.MAX_VALUE;
        //long max3 = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            
            if(arr[i] < max1){
               // max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] < max2){
                //max3 = max2;
                max2 = arr[i];
            }
           
            
        }
        
        int n = arr.length;
        arr[0] = max1;
        arr[1] = max2;
        //arr[n-3] = max3;
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