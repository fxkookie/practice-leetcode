class Solution {
    public int lengthOfLastWord(String s) {
        if(s == "" || s == " "){
            return 0;
        }
        String[] temp = s.split(" ");
        if(temp.length == 0){
            return 0;
        }
        return temp[temp.length-1].length();
    }
}
