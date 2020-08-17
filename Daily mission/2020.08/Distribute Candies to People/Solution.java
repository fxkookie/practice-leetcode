class Solution {
    int[] people;
    int max;
    public int[] distributeCandies(int candies, int num_people) {
        people = new int[num_people];
        max = num_people;
        give(1,candies);
        return people;
    }
    public void give(int number,int remain){
        if(remain >= number){
            people[(number-1)%max] += number;
            remain -= number;
        }
        else{
            people[(number-1)%max] += remain;
            remain = 0;
        }
        if(remain != 0){
            give(number+1,remain);
        }
    }
    /*
    others solution
    for (int i = 0; candies > 0; ++i) {
            res[i % n] += Math.min(candies, i + 1);
            candies -= i + 1;
    }
    */
}
