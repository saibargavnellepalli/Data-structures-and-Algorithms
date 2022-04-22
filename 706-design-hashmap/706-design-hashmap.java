class MyHashMap {
Integer[] forKey;
    Integer[] forVal;
    public MyHashMap() {
        forKey = new Integer[1000003];
        forVal = new Integer[1000003];
    }
    
    public void put(int key, int value) {
        forKey[key] = key;
        forVal[key] = value;
    }
    
    public int get(int key) {
        if(forVal[key]!=null)
            return forVal[key];
        return -1;
    }
    
    public void remove(int key) {
        forKey[key] = null;
        forVal[key] = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */