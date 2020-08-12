class Solution {
    // public int titleToNumber(String s) {
    //     Stack stack = new Stack();
    //     int len = s.length();
    //     int ans = 0;
    //     int count = 0;
    //     do{
    //         stack.push(s.charAt(count));
    //         count++;
    //     }while(count != len);
    //     count = 0;
    //     do{
    //         char c = (char)stack.pop();
    //         ans += (c-64)*(Math.pow(26,count));
    //         count++;
    //     }while(!stack.isEmpty());
    //     return ans;
    // }
    public int titleToNumber(String s) {
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
             ans += (c-64)*(Math.pow(26,s.length()-i-1));
        }
        return ans;
    }

}
