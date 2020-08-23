class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        for(int i = 0;i<piles.length/3;i++){
            System.out.printf("%d ",piles.length-2-3*i);
            ans += piles[piles.length-2-2*i];
        }
        return ans;
    }
}
