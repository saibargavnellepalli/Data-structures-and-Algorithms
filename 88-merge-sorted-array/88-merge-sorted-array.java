class Solution {
    public void merge(int[] a, int n, int[] b, int m) {
        
      // static void mergeArrays(int a[], int b[], int n, int m)
      //   {
            Map<Integer,Integer> map = new TreeMap<>() ;
            for (int i=0;i<n;i++){
                if (map.containsKey(a[i])){
                    map.put(a[i],map.get(a[i])+1);
                }
                else {
                    map.put(a[i],0);
                }
            }

            for (int i=0;i<m;i++){
                if (map.containsKey(b[i])){
                    map.put(b[i],map.get(b[i])+1);
                }
                else {
                    map.put(b[i],0);
                }
            }
            System.out.println(map);
          int x=0;
         for (Integer i : map.keySet()){
             int value = map.get(i);
             if (value!=0){
                 for (int j=0;j<value+1;j++){
                     a[x++] = i;
                 }
             }
             else {
                 a[x++] =i;
             
         }}}}
        