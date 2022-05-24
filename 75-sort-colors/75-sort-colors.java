class Solution {
      public static void sortColors(int[] arr) {

          int n = arr.length;
          //bubble sort
          for(int i=0;i<n;i++){
                boolean flag = false;
              for(int j=0; j<n-1; j++){
            
                  if(arr[j]>arr[j+1]){
                      int temp = arr[j];
                      arr[j] = arr[j+1];
                      arr[j+1] = temp;
                      flag = true;
                  }
                 }
               if(!flag)
                      return;
          }

    }


}