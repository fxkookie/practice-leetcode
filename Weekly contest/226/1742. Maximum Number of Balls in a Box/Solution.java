class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int max = 0;
        int sum[] = new int[100000];
        for(int i = lowLimit;i<=highLimit;i++){
          int temp = 0;
          for(int j = i;j>0;j/=10){
              temp += j%10;
          }
          sum[temp]++;
          if(sum[temp] > max){
              max = sum[temp];
          }
        }
        return  max;
    }
}
