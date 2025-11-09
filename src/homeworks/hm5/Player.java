package homeworks.hm5;
import java.util.Scanner;
public class Player {
    /*
     * Define instance variables
     *
     * Define a constructor
     *
     * Define public methods
     *
     * */
    private char symbol;
    private String name;

    public Player(char symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public char getSymbol()
    {
        return symbol;
    }

    public void makeMove(TicTacToe ticTacToe, Scanner scanner)
    {
     /*   System.out.print(name + " make your move (choose a number): ");
        int input = scanner.nextInt();
        Integer[] allowedInput = {1,2,3,4,5,6,7,8,9};
        Player player = new Player(getSymbol(), getName());
        int row = 0;
        int col = 0;
        if (input == 1)
        {
            row = 1;
            col = 1;

        }
        else if (input == 2)
        {
            row = 1;
            col = 2;
        }
        else if (input == 3)
        {
            row = 1;
            col = 3;
        }
        else if (input == 4)
        {
            row = 2;
            col = 1;
        }
        else if (input == 5)
        {
            row = 2;
            col = 2;
        }
        else if (input == 6)
        {
            row = 2;
            col = 3;
        }
        else if (input == 7)
        {
            row = 3;
            col = 1;
        }
        else if (input == 8)
        {
            row = 3;
            col = 2;
        }
        else if (input == 9)
        {
            row = 3;
            col = 3;
        }


        boolean IsValid = ticTacToe.placeTic(player, row, col);

        while (!Arrays.asList(allowedInput).contains(input) || !IsValid)
        {
            System.out.println("Ungültig! Neu angeben, 1-9:");

            input = scanner.nextInt();
        }



        //placeholder????? Vl noch was hier


*/

        boolean validMove = false;

        while (!validMove)
        {

            System.out.print(name + " make your move (choose a number): ");

            int input = scanner.nextInt();


            if (input < 1 || input > 9)
            {
                continue;
            }


           /* int row = (input - 1) / 3;
            int col = (input - 1) % 3; Quelle: Google....aber nicht benutzt da ich mich verwirrt habe */

            int row = 0;
            int col = 0;
            if (input == 1)
            {
                row = 0;
                col = 0;

            }
            else if (input == 2)
            {
                row = 0;
                col = 1;
            }
            else if (input == 3)
            {
                row = 0;
                col = 2;
            }
            else if (input == 4)
            {
                row = 1;
                col = 0;
            }
            else if (input == 5)
            {
                row = 1;
                col = 1;
            }
            else if (input == 6)
            {
                row = 1;
                col = 2;
            }
            else if (input == 7)
            {
                row = 2;
                col = 0;
            }
            else if (input == 8)
            {
                row = 2;
                col = 1;
            }
            else if (input == 9)
            {
                row = 2;
                col = 2;
            }

            boolean placed = ticTacToe.placeTic(this, row, col);

            if (placed)
            {
                validMove = true;
            }

        }
    }

}
