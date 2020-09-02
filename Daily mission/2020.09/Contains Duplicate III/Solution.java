import java.math.BigInteger;
class Solution {
    //k represent pos
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k <= 0 || t < 0) return false;
        TreeSet<Long> tree = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            Long x = tree.ceiling((long) nums[i] - t);
            if (x != null && x <= (long) nums[i] + t) return true;
            if (i >= k)
                tree.remove((long) nums[i - k]);
            tree.add((long) nums[i]);
        }
        return false;
    }
    // public int[] subArray(int[] x,int start,int k){
    //     int[] temp;
    //     if(start+k>x.length-1){
    //         System.out.println("a");
    //         temp = new int[x.length-start];
    //     }
    //     else{
    //         System.out.println("b");
    //         temp = new int[k+1];
    //     }
    //     System.out.printf("%d",temp.length);
    //     for(int i = 0;i<temp.length;i++){
    //         temp[i] = x[start+i];
    //         // System.our.printf("%d",temp[])
    //     }
    //     Arrays.sort(temp);
    //     return temp;
    // }

}
