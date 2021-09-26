public class Main{
    public static int maxWidthRampI(int[] A) {
        int n = A.length;
        int[] rMax = new int[n];
        rMax[n - 1] = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], A[i]);
        }
        int left = 0, right = 0;
        int ans = 0;
        while (right < n) {
            while (left < right && A[left] > rMax[right]) {
                left++;
            }
            ans = Math.max(ans, right - left);
            right++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num[] = {6,0,8,2,1,5};
        System.out.printf("ans:%d", maxWidthRampI(num));
    }
}