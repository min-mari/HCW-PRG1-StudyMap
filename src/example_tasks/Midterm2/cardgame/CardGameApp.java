package example_tasks.Midterm2.cardgame;

public class CardGameApp
{
    public static void main(String[] args)
    {
        // Zwei Spieler*innen erstellen
        Player player1 = new Player("Jane Doe");
        Player player2 = new Player("John Doe");

        // Neues Spiel mit den beiden Spielern starten
        Game game = new Game(player1, player2);
        game.startGame();

        // Spielrunden ausführen, bis ein Deck leer ist
        for (int round = 1; round <= Game.DECK_SIZE; round++)
        {
            System.out.println("\n--- Runde " + round + " ---");
            game.playRound();

            // Wenn ein Deck leer ist, beenden
            if (player1.deckIsEmpty() || player2.deckIsEmpty())
            {
                break;
            }
        }

        // Gewinner*in anzeigen
        System.out.println("\n--- Endergebnis ---");
        game.displayWinner();
    }
}
