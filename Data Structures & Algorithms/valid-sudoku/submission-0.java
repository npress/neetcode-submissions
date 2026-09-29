class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] seen;
        for(char[] row : board){
            seen = new boolean[9];
            for(char c : row){
                if(c!= '.'){
                    int val = c - '1';
                    if(seen[val]){
                        return false;
                    }
                    seen[val] = true;
                }
            }
        }
        
        for(int col = 0; col < 9; col++){
            seen = new boolean[9];
            for(int row = 0; row < 9; row++){
                char c = board[row][col];
                if(c == '.'){
                    continue;
                }
                int val = c-'1';
                if(seen[val]){
                    return false;
                }
                seen[val] = true;
            }
        }
        
        for(int i = 0; i < 3; i++){ //multiple of 3 to offset the row
            int boxRowOffset = i * 3;
            char[] row0 = board[boxRowOffset];
            char[] row1 = board[boxRowOffset + 1];
            char[] row2 = board[boxRowOffset + 2];
            for(int j = 0; j < 3; j++){ //multiple of 3 to offset the col
                seen = new boolean[9];
                int colstart = j * 3;
                int colend = colstart + 3;
                for(int col = colstart; col < colend; col++){
                    char c = row0[col];
                    int val;
                    if(c != '.'){     
                        val = c - '1';
                        if(seen[val]){
                            return false;
                        }
                        seen[val] = true;
                    }
                    c = row1[col];
                    if(c != '.'){     
                        val = c - '1';
                        if(seen[val]){
                            return false;
                        }
                        seen[val] = true;
                    }
                    c = row2[col];
                    if(c != '.'){
                        val = c - '1';     
                        if(seen[val]){
                            return false;
                        }
                        seen[val] = true;
                    }
                }
                
            }
        }
        return true;
    }
}
