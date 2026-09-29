class Solution {
    public int[] searchRange(int[] nums, int target) {
        int lenMinusOne = nums.length - 1;
        int[] result = {-1, -1};
        if(lenMinusOne < 0){
            return result;
        }
        int first = findFirst(nums, target, lenMinusOne);
        int resultIdx = 0;
        if(first > -1){
            result[resultIdx++] = first;
            int last = findLast(nums, target, lenMinusOne);           
            result[resultIdx] = last;            
        }
        return result;
    }
    private int findFirst(int[] nums, int target, int lenMinusOne){
        int left = 0;
        int right = lenMinusOne;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left);
            int cur = nums[mid];       
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
        return ans;
    }
    private int findLast(int[] nums, int target, int lenMinusOne){
        int left = 0;
        int right = lenMinusOne;
        int ans = -1;
        while(left <= right){
            int mid = left + (right - left);
            int cur = nums[mid];
            
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
        return ans;
    }
    
}