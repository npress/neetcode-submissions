class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        
        double[] times = new double[target];
        for(int i = 0; i < n; i++){
            times[position[i]] = (double)(target - position[i])/speed[i];
        }
        
        double prevTime = 0d;
        int fleets = 0;
        for(int i = target - 1; i >= 0; i--){
            double curTime = times[i];
            if(curTime > prevTime){
                prevTime = curTime;
                fleets++;
            }
        }
        return fleets;
    }
}
