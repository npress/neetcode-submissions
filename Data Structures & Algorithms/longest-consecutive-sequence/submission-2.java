class Solution {
    public int longestConsecutive(int[] nums) {        
        int n = nums.length;  
        if(n == 0){
            return 0;
        }      
        int max = -1_000_000;
        int min = 1_000_000;
        for(int num : nums){             
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        BitSet bs = new BitSet(max - min + 1);
        for(int num : nums){
            bs.set(num - min);
        }
        int length = 1;  
        int maxLength = 1;     
        for(int i = 1; i <= bs.length(); i++){
            if(bs.get(i)){
                if(bs.get(i-1)){
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
