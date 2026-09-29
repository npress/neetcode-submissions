class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int left = 1;
        
        for(int i = 0; i < n; i++){
            int curVal = nums[i];
            if(i > 0 && curVal == nums[i-1]){ //do not process duplicate triplets
                continue;
            }
            left = i+1;            
            int right = n - 1;
            while(left < right){
                int threesum = curVal + nums[left] + nums[right];
                if(threesum == 0){
                    res.add(List.of(curVal, nums[left], nums[right]));
                    do{
                        left++;
                    }while(left < right && nums[left] == nums[left-1]);
                    do{
                        right--;
                    }while(left < right && nums[right] == nums[right + 1]);
                }
                else if(threesum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}
