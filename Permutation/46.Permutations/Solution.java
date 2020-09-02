class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        round(nums,0);
        return ans;
    }
    public void round(int[] n,int start){
        List<Integer> temp = new ArrayList<Integer>();
        if(start == n.length){
            for(int j = 0;j<n.length;j++){
                temp.add(n[j]);
            }
            ans.add(temp);
            return;
        }
        for(int i = start;i<n.length;i++){
            swap(n,i,start);
            round(n,start+1);
            swap(n,i,start);
        }

    }
    public void swap(int[] x,int a,int b){
        int temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
