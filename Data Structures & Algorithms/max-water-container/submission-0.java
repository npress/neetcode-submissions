class Solution {
    public int maxArea(int[] heights) {
        //area = (r - l) * min(heights[r], heights[l]);
        int l = 0;
        int r = heights.length - 1;
        int area = 0;
        while(l < r){
            
            
            if(heights[r] < heights[l]){
                area = Math.max(area, (r-l) * heights[r]);
                r--;
            }
            else{
                area = Math.max(area, (r-l) * heights[l]);
                l++;
            }
        }
        return area;
    }
}
