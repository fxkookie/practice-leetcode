class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int odd = 0;
        for(int i = 0;i<arr.length-2;i++){
            for(int j = i;j<i+3;j++){
                if(arr[j] %2 == 1){
                    odd+=1;
                }
            }
            if(odd ==3){
                return true;
            }
            odd = 0;
        }
        return false;
    }
}
