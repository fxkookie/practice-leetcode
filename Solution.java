class Solution {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<Integer> temp = new ArrayList<Integer>();
      run(temp,0,candidates.length-1,target,candidates);
      return ans;
    }
    public void run(List<Integer> res,int sum,int index,int target,int[] candidates){
      if(sum == target){
        ans.add(res);
      }
      for(int i = index;i>= 0;i--){
        if(sum + candidates[i] <= target){
          res.add(candidates[i]);
          run(res,sum+candidates[i],i,target,candidates);
          res.remove(res.size()-1);
        }
      }
    }
}
