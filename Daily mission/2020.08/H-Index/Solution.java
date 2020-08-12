class Solution {
    public int hIndex(int[] citations) {
        sort(citations, 0, citations.length-1);
        int ans = 0;
        for(int i = citations.length-1;i>=0;i--){
            if(citations[i] >= citations.length-i){
                ans++;
            }
            else{
                return ans;
            }
        }
        return ans;
    }


    public void sort(int[] number, int left, int right) {
        if(left < right) {
            int q = partition(number, left, right);
            sort(number, left, q-1);
            sort(number, q+1, right);
        }

    }
    public int partition(int number[], int left, int right) {
        int i = left - 1;
        for(int j = left; j < right; j++) {
            if(number[j] <= number[right]) {
                i++;
                swap(number, i, j);
            }
        }
        swap(number, i+1, right);
        return i+1;
    }

    public void swap(int[] number, int i, int j) {
        int t = number[i];
        number[i] = number[j];
        number[j] = t;
    }
}
