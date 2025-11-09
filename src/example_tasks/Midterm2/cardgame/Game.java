package example_tasks.Midterm2.cardgame;
import java.util.Random;
public class Game
{
    // Klassenkonstanten
    public static final int MAX_HEALTH = 10;
    public static final int DECK_SIZE = 10;

    // private Attribute
    private Player player1;
    private Player player2;
    private Card[] cardPool;

    /**
     * Konstruktor.
     * Bekommt zwei Player-Objekte und initialisiert den Kartenpool.
     */
    public Game(Player player1, Player player2)
    {
        this.player1 = player1;
        this.player2 = player2;
        this.cardPool = createCardPool();
    }

    /**
     * Erstellt den Kartenpool.
     * In deinem Repo wird diese Methode vermutlich schon vorgegeben sein.
     * Dort dann bitte die gegebene Version "einkommentieren"
     * und nicht diese hier benutzen.
     */
    private Card[] createCardPool()
    {
        Card[] pool = new Card[]
                {
                        new Card("Feuerdrache", 10, 5, "Bestie"),
                        new Card("Blitzkrieger", 12, 4, "Krieger"),
                        new Card("Knochensöldner", 10, 6, "Krieger"),
                        new Card("Windgeist", 9, 8, "Magier"),
                        new Card("Schattenpanther", 11, 4, "Bestie"),
                        // ein paar zusätzliche Karten, damit der Pool größer ist:
                        new Card("Eisgolem", 8, 9, "Bestie"),
                        new Card("Lichtmagier", 7, 3, "Magier"),
                        new Card("Waldwächter", 6, 7, "Krieger"),
                        new Card("Flammenkobold", 5, 2, "Bestie"),
                        new Card("Dunkelritter", 9, 5, "Krieger")
                };
        return pool;
    }

    /**
     * Verteilt zufällige Karten aus dem cardPool an den übergebenen Player,
     * bis dessen Deck mit DECK_SIZE Karten gefüllt ist.
     */
    private void distributeCards(Player player)
    {
        Random random = new Random();

        for (int i = 0; i < DECK_SIZE; i++)
        {
            int index = random.nextInt(cardPool.length);
            Card randomCard = cardPool[index];
            player.addCardToDeck(randomCard);
        }
    }

    /**
     * Startet das Spiel, verteilt die Karten an beide Spieler*innen
     * und gibt "Spiel gestartet!" aus.
     */
    public void startGame()
    {
        distributeCards(player1);
        distributeCards(player2);
        System.out.println("Spiel gestartet!");
    }

    /**
     * Simuliert einen Spielzug.
     * Kein Parameter, kein Rückgabewert.
     */
    public void playRound()
    {
        // Fall 1: beide Decks leer
        if (player1.deckIsEmpty() && player2.deckIsEmpty())
        {
            System.out.println("Die Spieler*innen haben keine Karten mehr im Deck.");
            return;
        }

        // Zur Sicherheit: wenn nur ein Deck leer ist, brechen wir auch ab
        if (player1.deckIsEmpty() || player2.deckIsEmpty())
        {
            System.out.println("Die Spieler*innen haben keine Karten mehr im Deck.");
            return;
        }

        Card card1 = player1.playNextCard();
        Card card2 = player2.playNextCard();

        // Ausgabe der gespielten Karten
        System.out.println(player1.getName() + " spielt: " + card1.toString());
        System.out.println(player2.getName() + " spielt: " + card2.toString());

        int attack1 = card1.getAttack();
        int attack2 = card2.getAttack();

        // Fall 3: unentschieden (gleicher Angriffswert)
        if (attack1 == attack2)
        {
            System.out.println("Die Runde endet unentschieden!");
            return;
        }

        // Gewinner / Verlierer bestimmen
        Player winner;
        Player loser;
        Card winnerCard;
        Card loserCard;

        if (attack1 > attack2)
        {
            winner = player1;
            loser = player2;
            winnerCard = card1;
            loserCard = card2;
        }
        else
        {
            winner = player2;
            loser = player1;
            winnerCard = card2;
            loserCard = card1;
        }

        // Schaden berechnen
        int baseDamage = winnerCard.getAttack() - loserCard.getDefense();
        int damage = 0;

        if (baseDamage > 0)
        {
            damage = baseDamage;

            // Spezialfall: Bestie gewinnt gegen Magier -> doppelter Schaden
            if (winnerCard.getType().equals("Bestie")
                    && loserCard.getType().equals("Magier"))
            {
                damage = baseDamage * 2;
                System.out.println(
                        "Schaden verdoppelt: "
                                + winnerCard.getAttack() + " > " + loserCard.getAttack()
                                + " --> " + winnerCard.getAttack() + " - "
                                + loserCard.getDefense() + " = " + baseDamage
                                + " -> 2x Schadenswert = " + damage
                );
            }

            // Lebenspunkte des Verlierers anpassen
            loser.setHealth(loser.getHealth() - damage);
        }

        // Fall 2 / normaler Sieg-Output
        System.out.println(
                winner.getName() + " gewinnt die Runde! "
                        + loser.getName() + " verliert " + damage + " Lebenspunkte."
        );
    }

    /**
     * Gibt am Ende des Spiels aus, wer gewonnen hat,
     * oder ob es unentschieden ist.
     */
    public void displayWinner()
    {
        if (player1.getHealth() > player2.getHealth())
        {
            System.out.println("Gewinner*in: " + player1.getName() + ".");
        }
        else if (player2.getHealth() > player1.getHealth())
        {
            System.out.println("Gewinner*in: " + player2.getName() + ".");
        }
        else
        {
            System.out.println("Das Spiel endet unentschieden.");
        }
    }
}
