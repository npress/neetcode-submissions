class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];
        int[] output = new int[n];
        
        for(int i = 0; i < n; i++){
            prefixProduct[i] = (i>0?prefixProduct[i-1]:1) * nums[i];
            suffixProduct[n-i-1] = (i > 0? suffixProduct[n-i]:1) * nums[n-i-1];
        }
        for(int i = 0; i < n; i++){
            output[i] = (i > 0 ? prefixProduct[i-1] : 1) * (i < n-1? suffixProduct[i+1] : 1);
        }
        return output;
    }
}  
