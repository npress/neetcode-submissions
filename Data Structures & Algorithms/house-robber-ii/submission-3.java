class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        return Math.max(robHelper(nums, 0, nums.length - 1), robHelper(nums, 1, nums.length));
        
    }
    private int robHelper(int[] nums, int start, int end){
        int n = end-start;
        int[] max =  new int[n]; 
        max[0] = nums[start]; 
        if(n >= 2)
            max[1] = Math.max(nums[start + 1], max[0]); 
        for(int i = 2; i < n; i++){
            max[i] = Math.max(nums[i + start] + max[i-2], max[i-1]); 
        }
        return max[n - 1];
    }
}
