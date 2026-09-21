import java.util.HashSet;
public class ValidSudoku{
   public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int row = 0; row < 9; row++) {
            HashSet<Character> set = new HashSet<>();

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {
                    continue;
                }

                if (set.contains(board[row][col])) {
                    return false;
                }

                set.add(board[row][col]);
            }
        }

        // Check columns
        for (int col = 0; col < 9; col++) {
            HashSet<Character> set = new HashSet<>();

            for (int row = 0; row < 9; row++) {

                if (board[row][col] == '.') {
                    continue;
                }

                if (set.contains(board[row][col])) {
                    return false;
                }

                set.add(board[row][col]);
            }
        }

        // Check 3 x 3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') {
                            continue;
                        }

                        if (set.contains(board[i][j])) {
                            return false;
                        }

                        set.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
