class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        int[][] stack = new int[n][];//value, index
        int size = 0;
        for(int i = 0; i < n; i++){
            int cur = temperatures[i];
            while(size > 0 && cur > stack[size - 1][0]){
                int[] valIdx = stack[--size];
                int idx = valIdx[1];
                result[idx] = i - idx;
            }
            stack[size++] = new int[]{cur, i};
        }
        return result;
    }
}
