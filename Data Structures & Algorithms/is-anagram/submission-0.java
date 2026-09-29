class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        byte[] sBytes = s.getBytes();
        int[] count = new int[26];
        for(byte b : sBytes){
            count[b - 'a']++;
        }
        sBytes = t.getBytes();
        for(byte b :sBytes){
            count[b - 'a']--;
        }
        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
