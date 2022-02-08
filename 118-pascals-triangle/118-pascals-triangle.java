class Solution {
    public List<List<Integer>> generate(int n) {
    //  private static  List<List<Integer>> pascal(int n) {
//         List<List<Integer>> main_list = new ArrayList<>();

//         for (int line = 0;line<n;line++){
//             List<Integer> dups_list = new ArrayList<>();
//             for (int i=0;i<=line;i++){
//              //   System.out.print(binomial_coeffcient(line,i)+" ");
//                 dups_list.add(binomial_coeffcient(line,i));

//             }
//             main_list.add(dups_list);
//           //  System.out.println();
//         }
//         return main_list;
//     }

//     private static int binomial_coeffcient(int line, int i) {
//         return fact(line)/(fact(line-i)*fact(i));

//     }

//     private static int fact(int elm) {
//         if (elm<=1) return 1;
//         return elm*fact(elm-1);

//     }
// }
        
//      List<List<Integer>> main_list = new ArrayList<>();

//       for (int line=1;line<=n;line++){
//           List<Integer> dups_list = new ArrayList<>();
//           int c=1;
//           for (int i=1;i<=line;i++){
//               dups_list.add(c);
//               c=c*(line-i)/i;
//           }
//           main_list.add(dups_list);
//       }
// return main_list;
//     }
// }
           // private static  List<List<Integer>> pascal(int n) {
        List<List<Integer>> main_list = new ArrayList<>();

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

        }
        return main_list;
    }
}

    

