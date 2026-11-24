class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        boolean[] chars = new boolean[127];
        int max = 0;
        for(int r = 0, l = 0; r < n; ){
            int idx = s.charAt(r);
            if(!chars[idx]){
                chars[idx] = true;
                r++;
                max = Math.max(max, r - l);
            }
            else{
                chars[s.charAt(l)] = false;
                l++;
            }
        }
        return max;
    }
}
