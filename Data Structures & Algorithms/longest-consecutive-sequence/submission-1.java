class Solution {
    public int longestConsecutive(int[] nums) {        
        int n = nums.length;  
        if(n == 0){
            return 0;
        }      
        int max = -1_000_000;
        int min = 1_000_000;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){            
            set.add(nums[i]); 
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        int length = 1;  
        int maxLength = 1;     
        for(int i = min; i <= max; i++){
            if(set.contains(i)){
                if(set.contains(i) && set.contains(i-1)){
                    maxLength = Math.max(maxLength, ++length);
                }
                else{
                    length = 1;
                }                
            }
        }
        return maxLength;
    }
}
