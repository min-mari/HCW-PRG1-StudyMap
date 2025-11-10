package skeletons.oop;

public class Sk_F_GridGame
{
    public class Skeleton_GridGame
    {
        private static final int ROWS = 3;
        private static final int COLS = 3;

        private char[][] board;

        public Skeleton_GridGame()
        {
            board = new char[ROWS][COLS];

            int number = 1;
            for (int r = 0; r < ROWS; r++)
            {
                for (int c = 0; c < COLS; c++)
                {
                    board[r][c] = (char) ('0' + number);
                    number++;
                }
            }
        }

        // --- Place a symbol (like 'X' or 'O') ---
        public boolean placeMove(char symbol, int row, int col)
        {
            if (row < 0 || row >= ROWS || col < 0 || col >= COLS)
            {
                return false; // invalid index
            }

            char cell = board[row][col];
            if (cell == 'X' || cell == 'O')
            {
                return false; // already occupied
            }

            board[row][col] = symbol;
            return true;
        }

        // --- Print board nicely ---
        public void printBoard()
        {
            for (int r = 0; r < ROWS; r++)
            {
                for (int c = 0; c < COLS; c++)
                {
                    System.out.print(board[r][c]);
                    if (c < COLS - 1)
                    {
                        System.out.print(" | ");
                    }
                }
                System.out.println();

                if (r < ROWS - 1)
                {
                    System.out.println("--+---+--");
                }
            }
        }

        // --- Check if a player has won ---
        public boolean checkIfWon(char symbol)
        {
            // rows
            for (int r = 0; r < ROWS; r++)
            {
                if (board[r][0] == symbol && board[r][1] == symbol && board[r][2] == symbol)
                {
                    return true;
                }
            }

            // columns
            for (int c = 0; c < COLS; c++)
            {
                if (board[0][c] == symbol && board[1][c] == symbol && board[2][c] == symbol)
                {
                    return true;
                }
            }

            // diagonals
            if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            {
                return true;
            }

            if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            {
                return true;
            }

            return false;
        }

        // --- Optional: reset / clear board ---
        public void resetBoard()
        {
            int number = 1;
            for (int r = 0; r < ROWS; r++)
            {
                for (int c = 0; c < COLS; c++)
                {
                    board[r][c] = (char) ('0' + number);
                    number++;
                }
            }
        }
    }
}
