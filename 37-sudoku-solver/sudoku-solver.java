class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);

    }
    public static boolean solve(char board[][], int row, int col){
        if(row == 9){
            return true;
        }
        int newRow = row;
        int newCol = col+1;
        if(newCol == 9){
            newRow = row+1;
            newCol = 0;
        }
        if(board[row][col] != '.'){
           return solve(board,newRow,newCol);
        }
        for(char dig = '1'; dig <= '9'; dig++){
            if(isSafe(board,row,col,dig)){
                board[row][col] = dig;
                if(solve(board,newRow,newCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    public static boolean isSafe(char board[][], int row, int col, char dig){
        for(int i=0;i<9;i++){
            if(board[row][i] == dig){
                return false;
            }
        }
        for(int j=0;j<9;j++){
            if(board[j][col] == dig){
                return false;
            }
        }
        int matRow = (row/3)*3;
        int matCol = (col/3)*3;
        for(int i=matRow; i<=matRow+2; i++){
            for(int j=matCol; j<=matCol+2; j++){
                if(board[i][j] == dig){
                    return false;
                }
            }
        }
        return true;
    }
}