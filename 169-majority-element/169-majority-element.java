class Solution {
    public static int majorityElement(int[] arr) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int n = arr.length;
        for (int i=0;i<arr.length;i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else {
                hashMap.put(arr[i],1);
            }
        }
      
        int majority = n/2;
        for (Integer key : hashMap.keySet()){
            int value = hashMap.get(key);
            if (value>majority) return key;
        }

        return -1;
    }
}