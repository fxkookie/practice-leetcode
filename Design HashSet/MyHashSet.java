class MyHashSet {
    int[] hashTable = new int[10000];
    /** Initialize your data structure here. */
    public MyHashSet() {
        for(int i = 0;i<10000;i++){
            hashTable[i] = -1;
        }
    }
    public void add(int key) {
        int pos = hashFunc(key);
        hashTable[pos] = key;
    }

    public void remove(int key) {
        int pos = hashFunc(key);
        hashTable[pos] = -1;
    }
    public int hashFunc(int key){
        int val = (key^3)%9331;
        while(hashTable[val] != -1 && hashTable[val] != key){
            val = (val+931)%10000;
        }
        return val;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i = 0;i<hashTable.length;i++){
            if(hashTable[i] == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
