class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        return Math.max(robHelper(nums, 0, nums.length - 1), robHelper(nums, 1, nums.length));
        
    }
    private int robHelper(int[] nums, int start, int end){
        int n = end-start;
        int[] max =  new int[n]; //length = 2, start = 0, end = 2 
        max[0] = nums[start]; //max[0] = max[0] = 3
        if(n >= 2)
            max[1] = Math.max(nums[start + 1], max[0]); //max[1] = max(nums[1], 9) = 9
        for(int i = 2; i < end-start; i++){
            max[i] = Math.max(nums[i + start] + max[i-2], max[i-1]); //max[3] = max(nums[3] + max[1], max[2]) = max(3+9, 9) = 12
            //max[4] = max(nums[4] + max[2], max[3]) = max(6+9, 12) = 15
        }
        return max[end-start - 1];
    }
}
