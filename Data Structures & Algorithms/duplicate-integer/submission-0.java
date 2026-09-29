class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){ //add returns true if not already present
                return true;
            }
        }
        return false;
    }
}