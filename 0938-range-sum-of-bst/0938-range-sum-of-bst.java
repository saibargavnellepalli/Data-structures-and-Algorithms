
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
     
          List<Integer> list = new ArrayList <> ();
        inorder(root , list);
       
        int i=0;
        int ind=0;
        
        while(i<list.size()){
            if(list.get(i) == low){
               ind = i;
                System.out.println(ind);
                break;
            }
            i++;
        }
        int sum = 0;
        while(list.get(ind) != high){
            sum += list.get(ind);
            ind++;
        }
        
        sum += high;
        
        return sum;
    }
    public void inorder(TreeNode root , List<Integer> list){
        if(root == null) return ;

        inorder(root.left , list);
        list.add(root.val);
        inorder(root.right, list);

        return;
    }
     
}