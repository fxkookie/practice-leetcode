class Solution {
    public int minOperations(int n) {
        int l = n/2;
        if(n%2 == 0){
            return l*(l-1)+l;
        }
        else{
            return l*(l+1);
        }
    }
}
