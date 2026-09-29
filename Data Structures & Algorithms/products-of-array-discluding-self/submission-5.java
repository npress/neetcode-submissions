class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] product = new int[n];
        int prefix = 1;
        int suffix = 1;
        Arrays.fill(product, 1);
        for(int i = 0; i < n; i++){
            product[i] *= prefix;
            product[n-1-i] *= suffix;
            prefix *= nums[i];
            suffix *= nums[n-1-i];
        }       
        return product;
    }
}  
