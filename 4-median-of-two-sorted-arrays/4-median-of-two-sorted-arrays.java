class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      /*  
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

*/
     
        int n1=nums1.length;
        int n2 = nums2.length;
       // if (n1==0) return 0.0;
        int mid1 = (0+n1-1)/2;
        int mid2 = (0+n2-1)/2;

        double anss1=0,anss2=0,fin;
        if (n1==0)
        {
            if(n2%2!=0){
                return nums2[mid2];
            }
            else{
                anss1 = nums2[mid2] ;
                anss2 = nums2[mid2+1];
                fin = (anss1+anss2)/2;
                return fin;
            }

        }

        if (n2==0)
        {
            if(n1%2!=0){
                return nums1[mid1];
            }
            else{
                anss1 = nums1[mid1] ;
                anss2 = nums1[mid1+1];
                fin = (anss1+anss2)/2;
                return fin;
            }

        }
        int totalLength = n1+n2;
     //   System.out.println(totalLength);
        for (int i=0;i<nums1.length;i++){
            if (nums1[i]>nums2[0]){
                //swap nums1[i] & nums2[0]
                int temp = nums1[i];
                nums1[i] = nums2[0];
                nums2[0] = temp;

                sort(nums2);
            }
        }
      //  System.out.println(Arrays.toString(nums1));
        //System.out.println(Arrays.toString(nums2));
        double ans = 0;
        int start =0;
        int end = totalLength-1;
        int mid = start+(end-start)/2;

        //if length is odd
        if (totalLength%2!=0){
        //    System.out.println(mid);
            if (mid<n1){
                ans = nums1[mid];
            }
            else if (mid>=n1 && mid<n2){
              //  System.out.println("entered");
              ans =  nums2[mid-n1];
            }
        }

        else {
           int ans1=0, ans2=0;
            if (mid>=n1 && mid<n2+n1) {
                System.out.println(1);
                ans1 = nums2[mid-n1];
                ans2 = nums2[mid -n1+ 1];
                double fians = ans1+ans2;
                ans =fians / 2;
            
            }
            else if (mid<n1 && mid==n1-1){
                System.out.println(2);
            ans1 = nums1[mid];
            ans2 = nums2[0];
            double fians = ans1+ans2;
                ans =fians / 2;
            }
            else {
                System.out.println(3);
                ans1 = nums1[mid];
                ans2 = nums1[mid+1];
                double fians = ans1+ans2;
                ans =fians / 2;
            }

        }
        return ans;
}

    private static void sort(int[] nums2) {
        int temp=nums2[0];
        int i=1;
        for ( i=1;i< nums2.length;i++){
            if (nums2[i]<=temp){
                nums2[i-1] = nums2[i];
            }
            else {
               break;
            }
        }
        nums2[i-1] = temp;
    }
    }

