// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n){
   TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int val : arr){
            map.put(val, map.getOrDefault(val,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int key : map.keySet()){
            pq.add(new Pair(key, map.get(key)));
        }
        int i = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(pq.size() > 0){
            Pair top = pq.remove();
            int id = top.value;
            while(id-- > 0){
                res.add(top.key);
            }
        }
        return res;
    }
    static class Pair implements Comparable<Pair>{
        int key, value;
        Pair(int key, int value){
            this.key = key;
            this.value = value;
        }
        public int compareTo(Pair o){
            if(o.value > this.value){
                return 1;
            }
            else if(o.value < this.value ){
                return -1;
            }
            else {
                return this.key - o.key;
            }
        }
    }
    
    }

            