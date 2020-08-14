class Solution {
    List<List<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    int poolDepth;
    int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      poolDepth = candidates.length;
      this.candidates = candidates;
      List<Integer> temp = new ArrayList<Integer>();

    }
    public void run(List<Integer> res,int sum,int index){
      if(sum == target){
        ans.add(res);
      }
      for(int i = index;i>= 0;i--){
        if(sum + candidates[i] <= target){
          res.add(candidates[i]);
          run(res,sum+candidates[i],i);
          res.remove(res.size()-1);
        }
      }

    }


    public static void public static void main(String[] args) {
      int candidate[] = {2,3,6,7};
      int target = 7;

    }
}
