#include <stdio.h>
#include <stdlib.h>
/* iterative solution -> TLE
int compare(int *nums, int i, int j, int numSize){
    if(j == numSize-1) return nums[i]<=nums[j]? (j-i) : 0;
    else{
        int n = compare(nums, i, j+1, numSize);
        int w = nums[i]<=nums[j]? (j-i) : 0;
        printf("N:%d and W:%d\n", n, w);
        return (n>w)? n : w;
    }
}

int maxWidthRamp(int* nums, int numsSize){
    int ans = 0;
    int temp = 0;
    for(int i = 0;i<numsSize-1;i++){
        if(ans >= (numsSize-i-1)) return ans;
        temp = compare(nums, i, i+1, numsSize);
        ans = ans>temp? ans:temp;
        printf("i:%d, ans:%d\n", i, ans);
    }
    return ans;
}
*/

/* simple while loop -> TLE
int maxWidthRamp(int* nums, int numsSize){

    for(int i = 0;i<numsSize-1;i++){
        if(ans >= (numsSize-i-1)) return ans;
        for(int j = numsSize-1;j>i;j--){
            if(nums[i] <= nums[j]){
                ans = (j-i)>ans? (j-i):ans;
                break;
            }
        }
    }
}
*/
int maxWidthRamp(int* nums, int numsSize){
    int ans = 0;
    
    int *max = (int*)malloc(sizeof(int) * numsSize);
    max[numsSize-1] = nums[numsSize-1];
    for(int i = numsSize-2;i>= 0;i--){
        max[i] = max[i+1]>nums[i]? max[i+1]:nums[i];
    }
    int left = 0, right = 0;
    while (right < numsSize){
        while (left < right && nums[left] > max[right]){
            left++;
        }
        ans = ans>(right-left)? ans:(right-left);
        right++;
    }
    return ans;
}



int main(){
    int nums[6] = {6,0,8,2,1,5};
    int nums2[2] = {1, 0};
    int nums3[3] = {2, 2, 1};
    printf("%d\n", maxWidthRamp(nums, 6));

    return 0;
}