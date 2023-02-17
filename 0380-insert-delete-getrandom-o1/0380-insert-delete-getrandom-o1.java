class RandomizedSet {

    HashMap<Integer,Integer> map;
    ArrayList<Integer> list;
    java.util.Random rnd = new java.util.Random();
    
    public RandomizedSet() {
         map = new HashMap<>();
         list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val,list.size());
            list.add(val);
            
            return true;
        }
        
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))  return false;
        
            int t = map.get(val);
           
        
        if(t<list.size()-1){
            int a = map.get(val);
            int b = list.get(list.size()-1);
            list.set(a,b);
            map.put(b,a);
        }
         map.remove(val);
        list.remove(list.size()-1);
        
        return true;
        
       
    }
    
    public int getRandom() {
        return list.get(rnd.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */