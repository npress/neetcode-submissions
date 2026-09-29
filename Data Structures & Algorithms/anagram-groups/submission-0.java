class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<CountWrapper, List<String>> count2Anagrams = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            char[] ca = s.toCharArray();
            for(char c : ca){
                count[c-'a']++;
            }
            CountWrapper cw = new CountWrapper(count);
            count2Anagrams.putIfAbsent(cw, new ArrayList<String>());
            List<String> list = count2Anagrams.get(cw);
            list.add(s);
        }   
        return count2Anagrams.values().stream().toList();
    }
    private class CountWrapper{
        int[] count = new int[26];
        
        @Override
        public boolean equals(Object other){
            if(this == other){
                return true;
            }
            if(! (other instanceof CountWrapper)){
                return false;
            }
            return Arrays.equals(this.count, ((CountWrapper)other).count);
        }
        
        @Override
        public int hashCode(){
            return Arrays.hashCode(count);
        }
        CountWrapper(int[] count){
            this.count = count;
        }
    }
}
