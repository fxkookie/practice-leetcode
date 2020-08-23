class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int[] count = new int[n];
        for(int i = 0;i<rounds.length-1;i++){
            int start = rounds[i];
            int end = rounds[i+1];
            int len = end;
            if(end<=start){
                len = end+count.length;
            }
            if(i == 0){
                count[(rounds[0]+n-1)%n]++;
            }
            for(int j = start+1;j<=len;j++){
                count[(j+n-1)%n]++;
                // System.out.printf("%d  ",j%rounds.length);
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        int temp = 0;
        for(int k = 0;k<n;k++){
            // System.out.printf(":%d ",count[k]);
            if(count[k] > temp){
                temp = count[k];
                ans.clear();
                ans.add(k+1);
            }
            else if(count[k] == temp){
                ans.add(k+1);
            }
        }
        return ans;
    }
}
