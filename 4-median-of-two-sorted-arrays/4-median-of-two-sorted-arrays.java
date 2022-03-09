class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
          int n1=nums1.length;
        int n2 = nums2.length;

    int temp[] = new int[n1+n2];
    int i=0,j=0,k=0;

    //making single sorted array from given two sorted arrays
    while (i<n1 && j<n2){
        if (nums1[i]<=nums2[j]){
           temp[k] = nums1[i];
           i++;
        }
        else {
            temp[k] = nums2[j];
            j++;
        }
        k++;
    }

    //adding remaining elements to last positions of temp array taking from nums1 array

    while (i<n1){
        temp[k++] = nums1[i++];
    }

    //if any elements are left in array num2 then add them into last places of array temp.
        while (j<n2){
            temp[k++] = nums2[j++];
        }
        //System.out.println(Arrays.toString(temp));
        double ans = 0;
        int s = 0,  e =temp.length-1, mid = s+(e-s)/2;;
        if (temp.length%2==0) {
            ans = temp[mid] + temp[mid + 1];
            ans = ans / 2;
        }
        else {
            ans = temp[mid];

        }
        return ans;
    }
}
