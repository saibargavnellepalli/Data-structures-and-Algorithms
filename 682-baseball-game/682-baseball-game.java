class Solution {
    public int calPoints(String[] str) {
      int[] arr = new int[str.length];
             int ind = 0;
        for (int i=0;i<str.length;i++){

          if (str[i].equals("C")){
               ind = ind-1;
               arr[ind] = 0;

            }
          else if (str[i].equals("D")){
              arr[ind] = 2*arr[ind-1];
              ind++;

          }
          else if (str[i].equals("+")){
              arr[ind] = arr[ind-1]+arr[ind-2];
              ind++;
          }
          else {
              arr[ind] = Integer.parseInt(str[i]);
              ind++;
          }


        }

        return sum(arr);
    }

    private static int sum(int[] arr) {
        int sum =0;
        for (int n : arr){
            sum+=n;
        }
        return sum;
    }
}