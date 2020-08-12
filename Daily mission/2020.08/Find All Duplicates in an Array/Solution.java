class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        int l = nums.length;
        List<Integer> ans = new ArrayList<>();
        int[] vote = new int[l+1];
        for(int i = 0;i<l;i++){
            vote[nums[i]]++;
        }
        for(int j = 0;j<l+1;j++){
            if(vote[j] == 2){
                ans.add(j);
            }
        }
        return ans;
    }


    /*public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();

        for(int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if(nums[index] < 0) {
                list.add(Math.abs(nums[i]));
            } else {
                nums[index] = -1*nums[index];
            }
        }

        return list;
    }*/
}
