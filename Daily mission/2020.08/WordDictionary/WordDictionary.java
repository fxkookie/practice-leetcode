class WordDictionary {
    Trie root;
    /** Initialize your data structure here. */
    public WordDictionary() {
        root = new Trie();
    }

    /** Adds a word into the data structure. */
    public void addWord(String word) {
        root.insert(word);
    }

    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return root.search(word);
    }
}
