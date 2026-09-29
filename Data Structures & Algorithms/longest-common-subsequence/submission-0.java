class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int n = t1.length;
        int m = t2.length;
        int[][] dp = new int[m+1][n+1];
        //set last row to all 0
        
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(t2[i] == t1[j]){
                    dp[i][j] = 1 + dp[i+1][j+1];     
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);          
                }
            }
        }
        return dp[0][0];
    }
}
