// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;


 // } Driver Code Ends

class Solution{    
    
    // arr[]: input array
    // num: size of array
    // Function to check if array is sorted and rotated
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        // Your code here
         if(arr.length == 1)
           return false;
       int count = 0;  
       // if array is non-decreasing
       if(arr[num - 1] < arr[0]) {
           for(int i = 1; i < num; i++) {
               if(arr[i] < arr[i- 1])
                   count++;
           }
       } else  {   // if array is non-increasing
           for(int i = 1; i < num; i++) {
               if(arr[i] > arr[i- 1])
                   count++;
           }
       }
       return count == 1 ? true : false; 
    }
    
}




// { Driver Code Starts.

class Main {
    
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		   
		 Solution obj = new Solution();
        
        if(!(obj.checkRotatedAndSorted(arr, n)))
            System.out.println("No"); // print the result
        else
            System.out.println("Yes");
		}
	}
}
  // } Driver Code Ends