class Solution {
    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
    ArrayList<Integer> list=new ArrayList<>();
    helper(list,n,k,0);    
    int[] ans=new int[res.size()];
    for(int i=0;i<res.size();i++)
    {
        ArrayList<Integer> x=res.get(i);
        String num="";
        for(int j=x.size()-1;j>=0;j--)
        {
           num=x.get(j)+num;
        }
         ans[i]=Integer.parseInt(num);
        }
      return ans;  
    }
    public void helper(ArrayList<Integer> list,int n,int k,int ind)
    {
        if(list.size()==n)
        {
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<=9;i++)
        {
           if(i!=0 && list.size()==0)
           {
             list.add(i);
             helper(list,n,k,i);
             list.remove(list.size()-1);  
           }   
           else if(list.size()>0 && (Math.abs(i-list.get(list.size()-1))==k)) 
           {
               list.add(i);
               helper(list,n,k,i);
               list.remove(list.size()-1);
           }
           else{
               continue;
           }  
        } 
        return;
    }
}