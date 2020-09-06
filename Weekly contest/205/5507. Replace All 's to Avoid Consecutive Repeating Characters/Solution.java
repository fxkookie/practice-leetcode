class Solution {
    public String modifyString(String s) {
        char pre = 'a';
        char post = 'a';
        char[] ch = s.toCharArray();
        for (int i = 0;i<ch.length;i++){
            if(i != ch.length-1){
                post = ch[i+1];    
            }
            if(ch[i] == '?'){
                if(pre+1 <= 122){
                    ch[i] = (char)(pre+1);
                }
                else{
                    ch[i] = (char)(pre-1);
                }
                System.out.printf("post:%c now:%c\n",post,ch[i]);
                if(ch[i] == post){
                    if(post+1<=122){
                        ch[i] = (char)(post+1);
                    }
                    else{
                        ch[i] = (char)(pre-1);
                    }
                }
            }
            pre = ch[i];
            // System.out.printf("%c ",ch[i]);
        }
        String ans = "";
        for(int j = 0;j<ch.length;j++){
            ans += ch[j];
        }
        return ans;
    }
}