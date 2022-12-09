package problemsolving_leetcode;

public class P003_ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            StringBuilder rows = new StringBuilder();
            StringBuilder cols = new StringBuilder();
            StringBuilder cube = new StringBuilder();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.'
                        && rows.indexOf(String.valueOf(board[i][j])) != -1) {
                    return false;
                } else if (board[i][j] != '.') {
                    rows.append(String.valueOf(board[i][j]));
                }

                if (board[j][i] != '.' && cols.indexOf(String.valueOf(board[j][i])) != -1) {
                    return false;
                } else if (board[j][i] != '.') {
                    cols.append(String.valueOf(board[j][i]));
                }
                int cubeRow = 3 * (i / 3) + j / 3;
                int cubeCol = 3 * (i % 3) + j % 3;
                if (board[cubeRow][cubeCol] != '.'
                        && cube.indexOf(String.valueOf(board[cubeRow][cubeCol])) != -1) {
                    return false;
                } else if (board[cubeRow][cubeCol] != '.') {
                    cube.append(String.valueOf(board[cubeRow][cubeCol]));
                }
            }
        }
        return true;
    }
}
