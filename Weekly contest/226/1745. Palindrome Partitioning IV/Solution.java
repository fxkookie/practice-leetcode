class Solution {
    public boolean checkPartitioning(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<n;j++){
                if (i >= j){
                    dp[i][j] = true;
                }
                else if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i + 1][j - 1];
                }
            }
        }
        for (int i = 1;i<n;i++){
            for (int j = i+1;j<n;j++){
                if (dp[0][i-1] && dp[i][j-1] && dp[j][n-1])
                    return true;
            }
        }
        return false;
    }
}

// class Solution {
//     public boolean checkPartitioning(String s) {
//       for(int i = 1;i<s.length()-1;i++){
//         for(int j = s.length()-1;j>=i;j--){
//           String s1 = s.substring(0,i);
//           String s2 = s.substring(i,j+1);
//           String s3 = s.substring(j+1);
//           // System.out.printf("s1:%s, s2:%s, s3:%s\n",s1, s2, s3);
//           if(p(s1) && p(s2) && p(s3)){
//             return true;
//           }
//         }
//       }
//       return false;
//     }
//     public static boolean p(String s){
//         Stack st = new Stack();
//         for(int i = 0;i<s.length();i++){
//             st.push(s.charAt(i));
//         }
//         int index = 0;
//         while(!st.isEmpty()){
//             if(s.charAt(index) != (char)st.pop()){
//                 return false;
//         }
//         index++;
//     }
//     return true;
//   }
// } timeout case
