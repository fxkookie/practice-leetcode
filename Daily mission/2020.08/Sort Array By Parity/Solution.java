class Solution {
    public int[] sortArrayByParity(int[] a) {
        Stack even = new Stack();
        Stack odd = new Stack();
        for(int i = 0;i<a.length;i++){
            if(a[i] % 2 == 0){
                even.push(a[i]);
            }
            else{
                odd.push(a[i]);
            }
        }
        int index = 0;
        while(!even.empty()){
            a[index] = (int)even.pop();
            index++;
        }
        while(!odd.empty()){
            a[index] = (int)odd.pop();
            index++;
        }
        return a;
    }
}
