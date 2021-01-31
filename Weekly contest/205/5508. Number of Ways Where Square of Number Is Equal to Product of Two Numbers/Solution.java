class Solution {
    int triplets = 0;
    public int numTriplets(int[] nums1, int[] nums2) {
        for(int k = 0;k<nums1.length;k++){
            long in = (long)nums1[k] * (long)nums1[k];
            test(in,nums2);
        }
        for(int z = 0;z<nums2.length;z++){
            long in = (long)nums2[z]*(long)nums2[z];
            test(in,nums1);
        }
        return triplets;
    }
    public void test(long tar,int[] x){
        long temp = 0;
        for(int i = 0;i<x.length;i++){
            for(int j = i+1;j<x.length;j++){
                temp = (long)x[i]*(long)x[j];
                if(temp == tar){
                    triplets++;
                }
            }
        }
    }
}