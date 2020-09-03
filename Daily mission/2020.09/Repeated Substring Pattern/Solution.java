class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i = 1;i<=s.length()/2;i++){
            if(check(s,i)){
                return true;
            }
        }
        return false;
    }
    public boolean check(String s,int k){
        if(s.length()%k == 0){
            char[] code = new char[k];
            for(int i = 0;i<k;i++){
                code[i] = s.charAt(i);
            }
            int index = 0;
            while(index<s.length()){
                if(s.charAt(index) != code[index%k]){
                    return false;
                }
                index++;
            }
            return true;
        }
        else{
            return false;
        }
    }
}
