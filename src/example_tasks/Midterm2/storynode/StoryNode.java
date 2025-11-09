package example_tasks.Midterm2.storynode;

public class StoryNode
{
    private String description;
    private String choice1;
    private String choice2;
    private int choice1Index;
    private int choice2Index;
    private boolean hasWon;
    private Item item;

    public StoryNode(String description,
                     String choice1,
                     String choice2,
                     int choice1Index,
                     int choice2Index,
                     boolean hasWon)
    {
        this(description, choice1, choice2, choice1Index, choice2Index, hasWon, null);
    }

    public StoryNode(String description,
                     String choice1,
                     String choice2,
                     int choice1Index,
                     int choice2Index,
                     boolean hasWon,
                     Item item)
    {
        this.description = description;
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice1Index = choice1Index;
        this.choice2Index = choice2Index;
        this.hasWon = hasWon;
        this.item = item;
    }

    // Getter-Methoden für alle Instanzvariablen

    public String getDescription()
    {
        return description;
    }

    public String getChoice1()
    {
        return choice1;
    }

    public String getChoice2()
    {
        return choice2;
    }

    public int getChoice1Index()
    {
        return choice1Index;
    }

    public int getChoice2Index()
    {
        return choice2Index;
    }

    public boolean getHasWon()
    {
        return hasWon;
    }

    public Item getItem()
    {
        return item;
    }

    // Aufgabe 3: hasNext
    public boolean hasNext()
    {
        // Es gibt einen Folge-Node, wenn mindestens einer der Indizes nicht negativ ist
        return choice1Index >= 0 || choice2Index >= 0;
    }

    // Aufgabe 4: hasItem
    public boolean hasItem()
    {
        return item != null;
    }

    // Aufgabe 5: getEndingText
    public String getEndingText()
    {
        // Kein End-Node → noch nicht vorbei
        if (hasNext())
        {
            return "Game is not over yet...";
        }

        // End-Node + hasWon
        if (hasWon)
        {
            return "You win!";
        }

        // End-Node + nicht gewonnen
        return "Game Over";
    }
}
