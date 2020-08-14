class CombinationIterator {
    int combine;
    Queue<String> ans = new LinkedList<>();
    public CombinationIterator(String characters, int combinationLength) {
        combine = combinationLength;
        put(characters,0,"");
    }
    public void put(String all,int index,String now){
        if(now.length() == combine){
            ans.add(now);
            return;
        }
        for(int i = index;i<all.length();i++){
            put(all,i+1,now + all.charAt(i));
        }
    }
    public String next() {
        return ans.poll();
    }
    public boolean hasNext() {
        return ans.size()>0;
    }
}
/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
