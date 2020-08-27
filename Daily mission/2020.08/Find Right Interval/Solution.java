class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[] ans = new int[n];
        for(int j = 0;j<n;j++){
            int min = -1;
            int val = 1000000;
            for(int i = 0;i<n;i++){
                if(i != j){
                    if(intervals[i][0] >= intervals[j][1]){
                        if(intervals[i][0]<val || min == -1){
                            min = i;
                            val = intervals[i][0];
                        }
                    }
                }
            }
            ans[j] = min;
        }
        return ans;
    }
}
