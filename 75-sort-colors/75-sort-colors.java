class Solution {
      public static void sortColors(int[] arr) {

          int n = arr.length;
          //dutch national flag algo
          
          int start=0, end = n-1, mid = 0;
          
          while(mid<=end){
              
              if(arr[mid] == 2){
                arr[mid] = arr[end];
                  arr[end] = 2;
                  end-=1;
              }
              
              else if(arr[mid] == 1){
                 
                  mid+=1;
              }
              else if(arr[mid] == 0){
                int temp = arr[start];
                  arr[start] = arr[mid];
                  arr[mid] = temp;
                  start+=1;
                  mid+=1;
              }
              
          }
    }


}