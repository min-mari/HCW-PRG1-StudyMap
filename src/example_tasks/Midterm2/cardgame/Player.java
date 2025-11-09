package example_tasks.Midterm2.cardgame;

public class Player
{
    /*
     * Klasse Player
     * Repräsentiert eine Spielerin bzw. einen Spieler im Trading Card Game.
     */


    // private Attribute
    private Card[] deck;
    private String name;
    private int health;

    /**
     * Konstruktor.
     * Initialisiert den Namen, das Deck (mit DECK_SIZE)
     * und die Lebenspunkte (mit MAX_HEALTH).
     */
    public Player(String name)
    {
        this.name = name;
        this.deck = new Card[Game.DECK_SIZE];
        this.health = Game.MAX_HEALTH;
    }

    // Getter-Methoden
    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    /**
     * Setter für health.
     * Health darf nicht unter 0 und nicht über MAX_HEALTH liegen.
     * Negative Eingaben setzen health auf 0.
     */
    public void setHealth(int health)
    {
        if (health < 0)
        {
            this.health = 0;
        }
        else if (health > Game.MAX_HEALTH)
        {
            this.health = Game.MAX_HEALTH;
        }
        else
        {
            this.health = health;
        }
    }

    /**
     * Prüft, ob das Deck leer ist.
     *
     * @return true, wenn keine Karten mehr vorhanden sind
     */
    public boolean deckIsEmpty()
    {
        if (deck.length == 0)
        {
            return true;
        }

        for (Card card : deck)
        {
            if (card != null)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Fügt eine Karte an die nächste freie Position im Deck hinzu.
     * Gibt true zurück, wenn erfolgreich, sonst false.
     */
    public boolean addCardToDeck(Card newCard)
    {
        for (int i = 0; i < deck.length; i++)
        {
            if (deck[i] == null)
            {
                deck[i] = newCard;
                return true;
            }
        }
        return false; // kein Platz mehr
    }

    /**
     * Liefert die erste Karte (Index 0) zurück
     * und entfernt sie aus dem Deck.
     */
    public Card playNextCard()
    {
        if (deckIsEmpty())
        {
            return null;
        }

        Card playedCard = deck[0];

        // Neues Array mit um 1 kleinerer Größe
        Card[] newDeck = new Card[deck.length - 1];
        for (int i = 1; i < deck.length; i++)
        {
            newDeck[i - 1] = deck[i];
        }

        deck = newDeck;
        return playedCard;
    }

    /**
     * Gibt alle Karten des Decks in der Konsole aus.
     */
    public void printDeck()
    {
        System.out.println("Deck von " + name + ":");
        for (Card card : deck)
        {
            if (card != null)
            {
                System.out.println(card.toString());
            }
        }
    }


}
