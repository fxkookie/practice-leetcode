class Solution {
    public int getMaxLen(int[] nums) {
        boolean nega = false;//no negative = false;
        int localMax = 0;
        int globalMax = 0;
        int curMax = 0;
        int posMax = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == 0){
                if(globalMax < curMax){
                    if(nega == false){
                        globalMax = curMax;
                    }
                    else{
                        globalMax = localMax>posMax? localMax:posMax;
                    }
                }
                curMax = 0;
            }
            else if(nums[i] <0){
                if(nega == false){
                    localMax = curMax;  
                    posMax = 0;
                }
                curMax++;
                nega = !nega;
            }
            else{
                if(nega == true){
                    posMax++;
                    curMax++;
                }
                else{
                    curMax++;
                }
            }
        }
        if(globalMax > curMax){
            return globalMax;
        }
        else{
            if(nega == true){
                return localMax>posMax? localMax:posMax;
            }
            else{
                return curMax;
            }
        }
    }

}