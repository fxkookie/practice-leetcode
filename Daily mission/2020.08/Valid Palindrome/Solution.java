import java.lang.Character;
class Solution {
    public boolean isPalindrome(String s) {
        Stack sh = new Stack();
        Stack st = new Stack();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            char ct = s.charAt(s.length()-1-i);
            if( (ch>=48&&ch<=57) || (ch>=65&&ch<=90) || (ch>=97&&ch<=122)){
                sh.push(ch);
            }
            if( (ct>=48&&ct<=57) || (ct>=65&&ct<=90) || (ct>=97&&ct<=122)){
                st.push(ct);
            }
        }
        while(!sh.empty()){
            char ch = (char)sh.pop();
            char ct = (char)st.pop();
            ch = Character.toUpperCase(ch);
            ct = Character.toUpperCase(ct);
            if(ch != ct){
                return false;
            }
        }
        return true;
    }
}
