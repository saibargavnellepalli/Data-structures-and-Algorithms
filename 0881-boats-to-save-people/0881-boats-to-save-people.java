class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        
        Arrays.sort(people);
        
        int i=0,j=people.length-1;
        int ans=0;
        
        while(i<=j){
            
            if(i==j){
                ans ++;
                break;
            }
            else if(people[i]+people[j] <= limit){
                j--;
                i++;
                ans++;
            }
            else{
                j--;
                ans++;
            }
        }
        
        return ans;
    }
}