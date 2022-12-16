import java.util.*;
public class schecker{

    public static void main( String args[] ) {
        int [] [] board = {
                {1, 4, 7, 0, 0, 0, 0, 0, 3},
                {2, 5, 0, 0, 0, 1, 0, 0, 0},
                {3, 0, 9, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 0, 2, 0, 0, 0, 4},
                {0, 0, 0, 4, 1, 0, 0, 2, 0},
                {9, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 9},
                {4, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 1, 0, 0, 8, 0, 0, 7},
        };
        showboard(board);
        goodb(board);

        int [] [] board2 = {
                {1, 4, 4, 0, 0, 0, 0, 0, 3},
                {2, 5, 0, 0, 0, 1, 0, 0, 0},
                {3, 0, 9, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 0, 2, 0, 0, 0, 4},
                {0, 0, 0, 4, 1, 0, 0, 2, 0},
                {9, 0, 0, 0, 0, 0, 6, 0, 0},
                {0, 0, 3, 0, 0, 0, 0, 0, 9},
                {4, 0, 0, 0, 0, 2, 0, 0, 0},
                {0, 0, 1, 0, 0, 8, 0, 0, 7},
        };
        showboard(board2);
        goodb(board2);
    }


    public static int checkrow(int row, int [][] board){
        int temp[] = board[row];
        Set<Integer>set = new HashSet<Integer>();
        for (int value : temp) {
            if (value < 0 || value > 9){
                System.out.println( "Invalid" );
                return -1;
            }
            //Checking for repeated values.
            else if (value != 0){
                if (set.add(value) == false) {
                    return 0;
                }
            }
        }
        return 1;
    }
    public static int checkcol(int col, int [][] board){
        Set<Integer>set = new HashSet<Integer>();
        for (int i =0 ; i< 9; i++) {

            if (board[i][col] < 0 || board[i][col] > 9){
                System.out.println( "try again" );
                return -1;
            }
            else if (board[i][col] != 0){
                if (set.add(board[i][col]) == false) {
                    return 0;
                }
            }
        }
        return 1;
    }

    public static int checksqaure(int [][] board){
        for (int row = 0 ; row < 9; row = row + 3) {
            for (int col = 0; col < 9; col = col + 3) {
                Set<Integer>set = new HashSet<Integer>();
                for(int r = row; r < row+3; r++) {
                    for(int c= col; c < col+3; c++){
                        // Checking for values outside 0 and 9;
                        // 0 is considered valid because it
                        // denotes an empty cell.
                        // Removing zeros and the checking for values and
                        // outside 1 and 9 is another way of doing
                        // the same thing.
                        if (board[r][c] < 0 || board[r][c] > 9){
                            System.out.println( "wrongg input" );
                            return -1;
                        }
                        // Checking for repeated values.
                        else if (board[r][c] != 0){
                            if (set.add(board[r][c]) == false) {
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }
    public static void goodb(int [][] board){
        for (int i =0 ; i< 9; i++) {
            int part1 = checkrow(i, board);
            int part2 = checkcol(i, board);
            if (part1 < 1 || part2 < 1) {
                System.out.println( "invalid." );
                return;
            }
        }
        int part3 = checksqaure(board);
        if (part3 < 1) {
            System.out.println( " invalid." );
        }
        else {
            System.out.println( "valid." );
        }
    }
    public static void showboard(int [][] board) {
        for (int[] row : board) {
            System.out.print("[");
            for (int y : row) {
                System.out.print(y + ", ");
            }
            System.out.println("]");
        }
    }
}
