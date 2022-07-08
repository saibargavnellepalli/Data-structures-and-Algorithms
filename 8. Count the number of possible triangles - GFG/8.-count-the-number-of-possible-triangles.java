// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total count of testcases
        int t = sc.nextInt();
        
        while(t > 0)
        {
            //taking elements count
            int n = sc.nextInt();
            
            //creating an array of length n
            int arr[] = new int[n];
            
            //adding elements to the array
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            
            //creating an object of class Solutions
            Solution ob = new Solution();
            
            //calling the method findNumberOfTriangles()
            //of class Solutions and printing the results
            System.out.println(ob.findNumberOfTriangles(arr,n));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count the number of possible triangles.
    static int findNumberOfTriangles(int arr[], int n)
    {
        // code here
         int count=0;
       Arrays.sort(arr);
       int one=0,left=0,right=0;
       for(int i =n-1; i >= 2; i--){
           one=arr[i];
           count +=twosum(0,i-1,arr,one);
       }
       return count;
   }
   static int twosum(int left, int right ,int arr[] , int sum){
       int count=0;
       while(left<right){
           if(arr[left]+arr[right]>sum) {count+=(right-left);right--;}
           else left++;
           
       }
       
       return count;
   }

}