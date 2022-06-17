// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<k;i++){
            if(map.containsKey(arr[i]))
             map.put(arr[i],map.get(arr[i])+1);
             else
             map.put(arr[i],1);
        }
          
        ans.add(map.size());
        
        for(int i=k;i<n;i++){
             
            map.put(arr[i-k],map.get(arr[i-k])-1);
            if(map.get(arr[i-k])==0)
            map.remove(arr[i-k]);
               if(map.containsKey(arr[i]))
           map.put(arr[i],map.get(arr[i])+1);
             else
             map.put(arr[i],1);
          ans.add(map.size());
        }
        
        return ans;
    }
}

