class Solution {
    public List<Integer> getRow(int n) {
         List<List<Integer>> main_list = new ArrayList<>();
n=n+1;
        for (int line = 0; line < n; line++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i <= line; i++) {
                if (i == 0 || line == i) {
                    list.add(1);
                } else {
                    list.add(main_list.get(line - 1).get(i) + main_list.get(line - 1).get(i - 1));
                }
            }
            main_list.add(list);
            if (line==n) return list;

        }

        return main_list.get(n-1);
    }


}