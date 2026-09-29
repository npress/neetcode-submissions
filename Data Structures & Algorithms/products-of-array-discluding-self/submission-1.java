class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] output = new int[n];
        
        for(int i = 0; i < n; i++){           
            suffix[n-i-1] = (i > 0? suffix[n-i]:1) * nums[n-i-1];
            prefix[i] = (i>0 ? prefix[i-1]:1);
            output[i] = prefix[i];   
            prefix[i] *= nums[i];        
        }
        for(int i = 0; i < n; i++){
            output[i] *= (i < n-1? suffix[i+1] : 1);
        }
        return output;
    }
}  
