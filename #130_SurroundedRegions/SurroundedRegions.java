import java.util.Arrays;

public class SurroundedRegions {


    public void solve(char[][] board) {
        if (board.length == 0) {
            return;
        }

        int last_row = board.length - 1;
        int last_col = board[0].length - 1;

        for (int j = 0; j <= last_col; j++) {
            if (board[0][j] == 'O') {
                find(board, 0, j, last_row, last_col);
            }
            if (board[last_row][j] == 'O') {
                find(board, last_row, j, last_row, last_col);
            }
        }

        for (int k = 0; k <= last_row; k++) {
            if (board[k][0] == 'O') {
                find(board, k, 0, last_row, last_col);
            }
            if (board[k][last_col] == 'O') {
                find(board, k, last_col, last_row, last_col);
            }
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == 'O') {
                    board[row][col] = 'X';
                }
                if (board[row][col] == 'C') {
                    board[row][col] = 'O';
                }
            }
        }
    }

    public void find(char[][] board, int row, int col, int last_row, int last_col) {
        if (row < 0 || col < 0 || col > last_col || row > last_row) {
            return;
        }
        if (board[row][col] == 'X' || board[row][col] == 'C') {
            return;
        }
        board[row][col] = 'C';

        find(board, row - 1, col, last_row, last_col);
        find(board, row + 1, col, last_row, last_col);
        find(board, row, col - 1, last_row, last_col);
        find(board, row, col + 1, last_row, last_col);
    }

    public static void main(String[] args) {
        SurroundedRegions action = new SurroundedRegions();

        char[][] test1 = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        char[][] result1 = {{'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'X', 'X', 'X'}, {'X', 'O', 'X', 'X'}};

        action.solve(test1);
        System.out.println(Arrays.deepEquals(test1, result1));

        char[][] test2 = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};
        char[][] result2 = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};

        action.solve(test2);
        System.out.println(Arrays.deepEquals(test2, result2));

    }
}
