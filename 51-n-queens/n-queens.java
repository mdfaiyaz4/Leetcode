class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
       solve(ans,board,n,0);
        return ans;
    }
    public static void solve(List<List<String>> ans,char[][] board, int n, int row){
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,n,col)){
                board[row][col] = 'Q';
                solve(ans,board,n,row+1);
                board[row][col] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int n, int col){

        for(int i=0; i<n;i++){ //vertical
            if(board[i][col] == 'Q')
            return false;
        }
        
        //horizontal
        for(int i=0; i<n;i++){
            if(board[row][i] == 'Q')
            return false;
        }

         //left diagonal
        for(int i=row,j=col; i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q')
            return false;
        }

        for(int i=row,j=col; i>=0 && j<n;i--,j++){
            if(board[i][j] == 'Q')
            return false;
        }
        return true;
    }
}