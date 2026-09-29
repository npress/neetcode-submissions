class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[2001];  //add 1000 to the number to get the index
        for(int i : nums){
            freq[i+1000]++;
        }
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a[0], b[0]));
        for(int i = 0; i < 2001; i++){
            if(freq[i] > 0){
                int[] pair = {freq[i], i-1000};
                minHeap.add(pair);
                if(minHeap.size() > k){
                    minHeap.poll();
                }
                
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k && !minHeap.isEmpty(); i++){
            int[] pair = minHeap.poll();
            result[i] = pair[1];
        }
        return result;
    }
}
