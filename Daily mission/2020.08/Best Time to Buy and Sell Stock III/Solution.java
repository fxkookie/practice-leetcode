class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        //highest profit in 0 ... i
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];

        // DP from left to right
        left[0] = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            left[i] = Math.max(left[i-1], prices[i] - min);
        }

        // DP from right to left
        right[prices.length - 1] = 0;
        int max = prices[prices.length - 1];
        for (int j = prices.length - 2; j >= 0; j--) {
            max = Math.max(max, prices[j]);
            right[j] = Math.max(right[j+1], max - prices[j]);
        }

        int profit = 0;
        for (int k = 0; k < prices.length; k++) {
            profit = Math.max(profit, left[k] + right[k]);
        }
        return profit;
    }
}
    // public void run(int[] prices){
    //     int n = prices.length;
    //     for(int i = 0;i<n;i++){
    //         for(int j = i+1;j<n;j++){
    //             int profit = prices[j] - prices[i];
    //             if(profit>0){
    //                 trade[index] = new Transaction(profit,i,j);
    //                 index++;
    //             }
    //         }
    //     }
    // }
    // public void cal(){
    //     int l = index;
    //     for(int i = 0;i<l;i++){
    //         if(trade[i].profit > maxSum){
    //             maxSum = trade[i].profit;
    //         }
    //         for(int j = i+1;j<l;j++){
    //             if(trade[i].end < trade[j].begin){
    //                 int sum = trade[i].profit + trade[j].profit;
    //                 if(maxSum < sum ){
    //                     maxSum = sum;
    //                 }
    //             }
    //         }
    //     }
    // }
    // public class Transaction{
    //     int profit;
    //     int begin;
    //     int end;
    //     public Transaction(int earn,int start,int last){
    //         profit = earn;
    //         begin = start;
    //         end = last;
    //     }
    // }
