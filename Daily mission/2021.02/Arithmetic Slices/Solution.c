int isArithmetic(int *arr, int size){
    if(size<3){
        return 0;
    }
    int dif = arr[1] - arr[0];
    for(int i = 1;i<size-1;i++){
        if(arr[i+1] - arr[i] != dif){
            return 0;
        }
    }
    return 1;
}


int numberOfArithmeticSlices(int* A, int ASize){
    int count = 0;
    for(int i =0;i<ASize-2;i++){
        for(int j = i+2;j<ASize;j++){
            if(isArithmetic(A+i, j-i+1)){
                count++;
            }
            else{
                break;
            }
        }
    }
    return count;
}
