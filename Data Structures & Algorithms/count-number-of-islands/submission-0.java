class Solution {
    private int rows;
    private int cols;
    private boolean[] visited;
    private char[][] grid;
    private static final int[][] dirs = {{1, 0}, {-1,  0}, {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        this.grid = grid;
        visited = new boolean[rows * cols]; //(ij) is visited, then visited[i * cols + j] = true
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int idx = i * cols + j;
                if(grid[i][j] == '1' && !visited[idx]){
                    dfs(i,j);
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(int i, int j){
        int idx = i * cols + j;
        if(i < 0 || j < 0 || i == rows || j == cols || grid[i][j] == '0'|| visited[idx]){
            return;
        }
        visited[idx] = true;
        
        for(int[] dir : dirs){
            int inew = dir[0] + i;
            int jnew = dir[1] + j;
            dfs(inew, jnew);
        }
    }
}
