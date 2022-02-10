class Solution {
    public static int majorityElement(int[] arr) {
//         HashMap<Integer,Integer> hashMap = new HashMap<>();
//         int n = arr.length;
//         for (int i=0;i<arr.length;i++){
//             if (hashMap.containsKey(arr[i])){
//                 hashMap.put(arr[i],hashMap.get(arr[i])+1);
//             }else {
//                 hashMap.put(arr[i],1);
//             }
//         }
      
//         int majority = n/2;
//         for (Integer key : hashMap.keySet()){
//             int value = hashMap.get(key);
//             if (value>majority) return key;
//         }

//         return -1;
        
        
        //    private static int majorityElement(int[] arr) {
      int n = arr.length;
    int majority = n/2;
   // Arrays.sort(arr);
   // int i=0,j=0;
   // while (i<n && j<n){
   //     if (arr[i]==arr[j]){
   //         j++;
   //     }
   //     else {
   //         if ((j-i)>majority){
   //             return arr[i];
   //         }
   //         else {
   //             i=j;
   //         }
   //     }
   // }
   // if (j==n) return arr[j-1];
   // return -1;
        
        //Moors voting algorithm
        int cnt=0,elm=0;
        for(int i=0;i<n;i++){
            if(cnt == 0) elm = arr[i];
            if(elm == arr[i]) cnt++;
            else cnt--;
        }
        return elm;
    }
}

    
