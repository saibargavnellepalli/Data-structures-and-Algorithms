class Solution {
      public static void sortColors(int[] arr) {
    int n = arr.length;
          int s=0,mid=0,e=n-1;
          while(mid<=e){
              if(arr[mid]==0){
                int temp = arr[mid];
                  arr[mid] = arr[s];
                  arr[s]= temp ;
                  s++;
                  mid++;
              }
              else if (arr[mid]==1){
                  mid++;
              }
              else{
                   int temp = arr[mid];
                  arr[mid] = arr[e];
                  arr[e]= temp ;
                      e--;
              }
          }

    }


}