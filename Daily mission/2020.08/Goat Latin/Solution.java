class Solution {
    int end = 0;
    public String toGoatLatin(String s) {
        String[] split = s.split("\\s+");
        end = split.length;
        for(int i = 0;i<split.length;i++){
            split[i] = goat(split[i],i+1);
        }
        String ans = "";
        for(int k = 0;k<split.length;k++){
            ans += split[k];
        }
        return ans;

    }
    public String goat(String s,int index){
        char first = s.charAt(0);
        if(first == 'a' ||first == 'e' || first == 'i'||first == 'o'||first == 'u'
           ||first == 'A'||first == 'E'||first == 'I'||first == 'O'||first == 'U'){
            s += "ma";
        }
        else{
            s = s.substring(1);
            s += first + "ma";
        }
        for(int j = 0;j<index;j++){
            s += 'a';
        }
        if(index == end){
            return s;
        }
        return s + " ";
    }
}
