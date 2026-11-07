class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();//value, index
        
        for(int i = 0; i < n; i++){
            int cur = temperatures[i];
            while(!stack.isEmpty() && cur > stack.peek()[0]){
                int[] valIdx = stack.pop();
                int idx = valIdx[1];
                result[idx] = i - idx;
            }
            stack.push(new int[]{cur, i});
        }
        return result;
    }
}
