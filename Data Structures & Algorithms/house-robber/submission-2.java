class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] max = new int[n]; 
        max[0] = nums[0]; 
        if(n >= 2)
            max[1] = Math.max(nums[1], max[0]); 
        if(n >= 3)
            max[2] = Math.max(max[0] + nums[2], max[1]); 
        for(int i = 3; i < n; i++){
            max[i] = Math.max(max[i-1], nums[i] + Math.max(max[i-2], max[i-3])); 
        }
        return max[n-1];
    }
}
