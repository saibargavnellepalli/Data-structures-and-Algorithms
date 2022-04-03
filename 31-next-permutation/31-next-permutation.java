class Solution {
    public void nextPermutation(int[] a) {
        int n = a.length;
        if(a==null || n<=1 ){
            return;
        }
         /* index1 finding index where that will be less than next element*/
        int i = n-2;
        while(i>=0 && a[i]>=a[i+1]){
            i--;
        }
        
        //find element greater than a[i] from last
        
        if(i>=0){
            int j = n-1;
            while(a[j]<=a[i]){
                j--;
            }
            
            // swap i , j elements
            swap(a , i , j);
        }
        reverse(a , i+1 , a.length-1);
    }
        public void swap(int a[] , int i, int j){
            int t = a[i];
            a[i]=a[j];
            a[j] =t;
        }
        public void reverse(int a[] , int i , int j){
            while(i<j){
                swap(a , i++ , j--);
               
            }
        }
        
    }
