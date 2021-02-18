bool carPooling(int** trips, int tripsSize, int* tripsColSize, int capacity){
    int *city = calloc(1000,sizeof(int));
    for(int i = 0;i<tripsSize;i++){
        for(int j = trips[i][1];j<trips[i][2];j++){
            city[j] += trips[i][0];
            if(city[j] > capacity){
                return false;
            }
        }
    }
    return true;
}
