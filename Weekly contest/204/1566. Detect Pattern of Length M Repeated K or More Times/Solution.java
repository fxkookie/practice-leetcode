class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        for(int i = 0;i<arr.length;i++){
            if(detect(arr,i,m,k)){
                return true;
            }
        }
        return false;
    }
    public boolean detect(int[] x,int index,int m,int k){
        int n = x.length;
        int round = 0;
        int last = 0;
        int[] pattern = new int[m];
        if(index+m > n || index+(m*k)-1 >= n){
            return false;
        }
        for(int i = index;i<m+index;i++){
            pattern[round] = x[i];
            round++;
            last = i;
        }
        last++;
        for(int j = 0;j<k-1;j++){
            for(int s = 0;s<m;s++){
                if(x[last] != pattern[s]){
                    return false;
                }
                last++;
            }
        }
        return true;
    }
}