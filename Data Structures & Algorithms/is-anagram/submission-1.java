class Solution {
    public boolean isAnagram(String s, String t) {    
        byte[] sBytes = s.getBytes();
        byte[] tBytes = t.getBytes();
        int sLen = sBytes.length;
        
        if(sLen != tBytes.length){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < sLen; i++){            
            count[sBytes[i] - 'a']++;
            count[tBytes[i] - 'a']--;
        }
        
        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        return true;
    }
}
