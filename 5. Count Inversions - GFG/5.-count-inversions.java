// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        // Your Code Here
        return mergeSort(arr,0,(int)(N-1));
    }
    public static long mergeSort(long arr[],int low,int high){
        long counter = 0;
        if(low<high){
            int mid = low+(high-low)/2;
            counter += mergeSort(arr,low,mid);//left half
            counter += mergeSort(arr,mid+1,high);//rigth half
            counter += merge(arr,low,mid,high);//merging left and right arrays
        }
        return counter;
    }
    public static long merge(long arr[],int low,int mid,int high){
        long counter = 0;
        int n1 = (mid-low+1);
        int n2 = (high-mid);
        long L[] = new long[n1];
        long R[] = new long[n2];
        for(int i=0;i<n1;i++){
            L[i] = arr[low+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[mid+1+j];
        }
        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                counter += (n1-i);
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
        return counter;
    }
}