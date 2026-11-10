class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        
        int[][] positionSpeed = new int[n][2];
        for(int i = 0; i < n; i++){
            positionSpeed[i][0] = position[i];
            positionSpeed[i][1] = speed[i];
        }
        Arrays.sort(positionSpeed, (a,b) -> Integer.compare(b[0], a[0]));
        double prevTime = (double)(target - positionSpeed[0][0])/positionSpeed[0][1];
        int fleets = 1;
        for(int i = 1; i < n; i++){
            int[] pair = positionSpeed[i];
            double curTime = (double)(target - pair[0])/pair[1];
            if(curTime > prevTime){
                prevTime = curTime;
                fleets++;
            }
        }
        return fleets;
    }
}
