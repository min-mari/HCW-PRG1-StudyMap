package homeworks.hm5;

import java.util.Scanner;


public class TicTacToe {

    /*
     * Define instance variables
     *
     * Define a constructor
     *
     * Define public and private methods
     *
     * */
    private static final int ROWS = 3;
    private static final int COLS = 3;

    char[][] gameBoard = new char [ROWS][COLS];
    private Player p1;
    private Player p2;

    public TicTacToe(Player p1, Player p2)
    {
        this.p1 = p1;
        this.p2 = p2;

        int number = 1;
        for (int r = 0; r < ROWS; r++)
        {
            for (int c = 0; c < COLS; c++)
            {
                gameBoard[r][c] = (char) ('0' + number);
                number++;
            }
        }
    }



    public boolean placeTic (Player p, int row, int col) // WIE IST DAS NICHT BESETZT WENN BEREITS ZAHLEN DRINNEN SIND????????????????????????
    {
        char cell = gameBoard[row][col];

        if (cell == 'X' || cell == 'O')
        {
            return false;
        }

        gameBoard[row][col] = p.getSymbol();
        return true;
    }

    private void prettyPrintGameBoard()
    {
        for (int r = 0; r < ROWS; r++)
        {
            for (int c = 0; c < COLS; c++)
            {
                System.out.print(gameBoard[r][c]);

                if (c < COLS - 1)
                {
                    System.out.print(" | ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

            if (r < ROWS - 1)
            {
                System.out.println("--+---+--");
            }
        }
    }

    public boolean checkIfWon(Player p)
    {
        char s = p.getSymbol();

        //rowsa
        for (int r = 0; r < ROWS; r++)
        {
            if (gameBoard[r][0] == s && gameBoard[r][1] == s && gameBoard[r][2] == s)
            {
                return true;
            }
        }

        //columns
        for (int c = 0; c < COLS; c++)
        {
            if (gameBoard[0][c] == s && gameBoard[1][c] == s && gameBoard[2][c] == s)
            {
                return true;
            }
        }

        // Diagonalen
        if (gameBoard[0][0] == s && gameBoard[1][1] == s && gameBoard[2][2] == s)
        {
            return true;
        }

        if (gameBoard[0][2] == s && gameBoard[1][1] == s && gameBoard[2][0] == s)
        {
            return true;
        }

        return false;
    }

    public void playGame()
    {
        Scanner scanner = new Scanner(System.in);
        Player current = p1;
        int moves = 0;

        while (moves < ROWS * COLS)
        {
            prettyPrintGameBoard();
            System.out.println();

            current.makeMove(this, scanner);
            moves++;

            if (checkIfWon(current))
            {
                System.out.println(current.getName() + " has won the game!");
                prettyPrintGameBoard();
                return;
            }

            if (current == p1)
            {
                current = p2;
            }
            else
            {
                current = p1;
            }
        }

        System.out.println("Nobody wins!");
        prettyPrintGameBoard();
    }








    public static void main(String[] args) {



        /*
         * Create Instances of Class Player like:
         * Player p1 = new Player(....);
         * Player p2 = new Player(....);
         * Create an Instance of TicTacToe itself:
         * TicTacToe ttt = new TicTacToe(....);
         * Start the game via the reference (ttt)
         * */



        Player p1 = new Player('O', "Burli");
        Player p2 = new Player('X', "Madli");


        TicTacToe game = new TicTacToe(p1, p2);


        game.playGame();

    }
}
