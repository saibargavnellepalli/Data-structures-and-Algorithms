class Solution {
    public void moveZeroes(int[] arr) {
          int k = 0;
    while (k < arr.length) {
      if (arr[k] == 0) {

        break;
      } else {
        k = k + 1;
      }
    }

    //finding zeros and immediate non-zero elements and swapping them
    int i = k, j = k + 1;

    while (i < arr.length && j < arr.length) {
      if (arr[j] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;

      }

      j++;

    }
    }
}
