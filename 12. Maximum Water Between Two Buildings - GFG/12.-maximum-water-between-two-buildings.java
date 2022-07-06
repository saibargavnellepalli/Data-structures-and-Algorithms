// { Driver Code Starts
//Initial Template for Java


// Java implementation of the approach 
import java.util.Arrays; 
import java.util.*;
class GFG { 

	// Driver code 
	public static void main(String[] args) 
	{ 
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int height[]=new int[n];
	        for(int i=0;i<n;i++)
	        height[i]=sc.nextInt();
	        Solution ob = new Solution();
	        System.out.println(ob.maxWater(height, n)); 
	    }
	

		
	} 
} 
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return the maximum water that can be stored.
    static int maxWater(int arr[], int n) 
    { 
        //Your code here
        int i=0,j=n-1;
        int ans=0,max=-10000;
        while(i<=j){
            if(arr[i]<arr[j]){
             ans=(j-i-1)*arr[i];
              max = Math.max(ans,max);
             i++;
            }
            else {
                ans=(j-i-1)*arr[j];
                max = Math.max(ans,max);
                j--;
            }
        }
        return max;
    } 

}