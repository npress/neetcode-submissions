class Solution {
    
   
    
    public int numDistinct(String sStr, String tStr) {
        byte[] s = sStr.getBytes();
        byte[] t = tStr.getBytes();
        int sLen = s.length;
        int tLen = t.length;
        //                     j         i
        int[][] dp = new int[tLen + 1][sLen + 1];
        //when i related to s is euqal to sLen, dp[j][sLen] = 0
        //when j related to t is equal to tLen, dp[tLen][i] = 1
        Arrays.fill( dp[tLen], 1);
        for(int j = tLen - 1; j >= 0; j--){
            for(int i = sLen - 1; i >= 0; i--){
                if(s[i] == t[j]){
                    dp[j][i] = dp[j+1][i + 1] + dp[j][i+1];
                }
                else{
                    dp[j][i] = dp[j][i+1];
                }
            }
        }
        

        return dp[0][0];
    }
    
}
