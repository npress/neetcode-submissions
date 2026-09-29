class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> count2Anagrams = new HashMap<>();
        for(String s : strs){
            int[] count = new int[26];
            char[] ca = s.toCharArray();
            for(char c : ca){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append('#').append(i);
            }
            String key = sb.toString();
            count2Anagrams.putIfAbsent(key, new ArrayList<String>());
            List<String> list = count2Anagrams.get(key);
            list.add(s);
        }   
        return new ArrayList<>(count2Anagrams.values());
    }
}
