// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        //Taking input using class Scanner
        Scanner sc = new Scanner(System.in);
        
        //Taking count of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking count of number elements
            int n = sc.nextInt();
            
            //taking the value of the k
            int k = sc.nextInt();
            
            //Creating an array of size n
            int arr[] = new int[n];
            
            //Inserting all the elements to the array
            for(int i = 0; i<n; ++i)
                arr[i] = sc.nextInt();
            
            //calling kthSmallest method of class solve
            //and printing the result
            System.out.println(new Solution().kthSmallest(arr, n, k));
        }
        
    }
}// } Driver Code Ends



class Solution
{
    //Function to find the kth smallest element in the array.
    static void swap(int[] arr, int i, int j)
{
   int temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
}
   static int partition(int[] arr, int low, int high)
{
    
   // pivot
   int pivot = arr[high];
   
   int i = (low - 1);

   for(int j = low; j <= high - 1; j++)
   {
      
       if (arr[j] < pivot)
       {
            
           i++;
           swap(arr, i, j);
       }
   }
   swap(arr, i + 1, high);
   return (i + 1);
}
   //Function to find the kth smallest element in the array.
   public static int kthSmallest(int arr[], int n, int k)
   {
       // Your code here
       int low=0,high=n-1;
       quickSort(arr,low,high,k);
       return arr[k-1];
   }
   public static void quickSort(int arr[], int low,int high, int k)
   {
       
       if(low<high){
           int loc=partition(arr,low,high);
           quickSort(arr,low,loc-1,k);
           quickSort(arr,loc+1,high,k);
       }
   
   }
}
//    public static int kthSmallest(int arr[], int n, int k)
