class Trie {
    Trie[] child;
    boolean isEnd = false;
    /** Initialize your data structure here. */
    public Trie() {
        child = new Trie[26];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
      Trie point = this;
      char[] c = word.toCharArray();
      for(int i = 0;i<c.length;i++){
        int index = c[i] - 'a';
        if(point.child[index] == null){
          point.child[index] = new Trie();
          //point.isEnd = false;
        }
        point = point.child[index];
      }
      point.isEnd = true;
    }
    public boolean search(String word) {
        Trie point = this;
        char[] c = word.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(c[i] == '.'){
                String subc = word.substring(i+1);
                for(int j = 0;j<26;j++){
                    if(point.child[j]!= null && point.child[j].search(subc)){
                        return point.child[j].search(subc);
                    }
                }
                return false;
            }
            int index = c[i] - 'a';
            if(point.child[index] == null){
                return false;
            //child[index] = new Trie();
            }
            point = point.child[index];
        }
        return point.isEnd;
    }
}
