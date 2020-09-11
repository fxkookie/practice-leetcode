class Solution {
    String getHint(String secret, String guess) {
        char[] sec = secret.toCharArray();
        char[] gu = guess.toCharArray();
        int a = 0;
        int b = 0;
        for(int i = 0;i<sec.length;i++){
            if(sec[i] == gu[i]){
                a++;
                sec[i] = 'A';
                gu[i] = 'A';
            }
        }
        for(int j = 0;j<sec.length;j++){
            if(gu[j]!= 'A'){
                for(int k = 0;k<sec.length;k++){
                    if(k != j){
                        if(gu[j] == sec[k]){
                            b++;
                            sec[k] = 'B';
                            k = sec.length;
                        }
                    }
                }
            }
        }
        // for(int z = 0;z<sec.length;z++){
        //     System.out.printf("%c ",sec[z]);
        // }
        String ans = a + "A" + b + "B";
        return ans;
    }
};
