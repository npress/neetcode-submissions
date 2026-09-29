class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lenMinusOne = nums.length - 1;
        int first = findFirstLast(nums, target, lenMinusOne, true);
        int[] result = {-1, -1};
        int resultIdx = 0;
        if(first > -1){
            result[resultIdx++] = first;
            int last = findFirstLast(nums, target, lenMinusOne, false);           
            result[resultIdx] = last;            
        }
        return result;
    }
    private int findFirstLast(int[] nums, int target, int lenMinusOne, boolean first){
        int left = 0;
        int right = lenMinusOne;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left);
            int cur = nums[mid];
            if(first){
                if(cur >= target){
                    right = mid - 1;
                    if(cur == target){
                        ans = mid; 
                    }
                }
                else{// cur < target
                    left = mid + 1;
                }
            }
            else{
                if(cur <= target){
                    left = mid + 1;
                    if(cur == target){
                        ans = mid; 
                    }
                }
                else{// cur > target
                    right = mid - 1;
                }
            }
        }
        return ans;
    }
    
}