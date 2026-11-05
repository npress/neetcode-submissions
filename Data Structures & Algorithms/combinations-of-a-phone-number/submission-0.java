class Solution {
    private static final char[][] digitLetters = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    private String digits;
    private int n;
    public List<String> letterCombinations(String digits) {
        this.digits = digits;
        n = digits.length();
        List<String> res = new ArrayList<>();
        combo(new char[n], 0, res);
        return res;
    }
    private void combo(char[] output, int i, List<String> res){
        if(n == i){
            return;
        }
        int idx = digits.charAt(i) - '0';
        char[] letters = digitLetters[idx];
        for(char c : letters){
            output[i] = c;
            if(i == n - 1){
                res.add(String.valueOf(output));
            }
            else{
                combo(output, i + 1, res);
            }
        }
    }
}
