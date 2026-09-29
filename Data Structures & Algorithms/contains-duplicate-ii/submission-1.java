class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int j = 0; j < nums.length; j++){
            if(j - i > k){
                set.remove(nums[i]);
                i++;
            }
            if(set.contains(nums[j])){
                return true;
            }
            set.add(nums[j]);
        }
        return false;
    }
}