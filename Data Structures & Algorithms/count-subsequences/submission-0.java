class Solution {
    byte[] s;
    byte[] t;
    int[][] memo;
    int sLen;
    int tLen;
    public int numDistinct(String s, String t) {
        this.s = s.getBytes();
        this.t = t.getBytes();
        sLen = this.s.length;
        tLen = this.t.length;
        memo = new int[sLen][tLen];
        for(int i = 0; i < sLen; i++){
            Arrays.fill(memo[i], -1);
        }
        return numWays(0,0);
    }
    private int numWays(int i, int j){
        if(j == tLen){
            return 1;
        }
        if(i == sLen){
            return 0;
        }
        if(memo[i][j] >= 0){
            return memo[i][j];
        }
        if(s[i] == t[j]){
            memo[i][j] = numWays(i+1, j+1) + numWays(i+1, j);
        }
        else{
            memo[i][j] = numWays(i+1, j); //j stays the same, b/c haven't found char in t yet
        }
        return memo[i][j];
    }
}
