package example_tasks.Midterm2.storynode;
import java.util.Scanner;
public class AdventureGame
{
    private StoryNode[] storyNodes;
    private int inventoryCount;
    private Item[] inventory;

    // Aufgabe 6: Konstruktor
    public AdventureGame(StoryNode[] storyNodes)
    {
        this.storyNodes = storyNodes;
        this.inventory = new Item[5];
        this.inventoryCount = 0;
    }

    // Aufgabe 7: addItemToInventory
    public boolean addItemToInventory(Item item)
    {
        if (inventoryCount >= inventory.length)
        {
            System.out.println("Inventory is full! You can't carry more items.");
            return false;
        }

        inventory[inventoryCount] = item;
        inventoryCount++;
        return true;
    }

    // Aufgabe 8: playGame
    public void playGame(Scanner scanner)
    {
        if (storyNodes == null || storyNodes.length == 0)
        {
            return;
        }

        StoryNode current = storyNodes[0];

        while (true)
        {
            // 1. Beschreibung des aktuellen StoryNode ausgeben
            System.out.println(current.getDescription());

            // 3. Wenn End-Node -> EndingText ausgeben und Schleife verlassen
            if (!current.hasNext())
            {
                System.out.println(current.getEndingText());
                break;
            }

            // 2. aktueller StoryNode ist kein End-Node

            // Prüfen, ob ein Item hinterlegt ist
            if (current.hasItem())
            {
                System.out.println(">> You found an item: " + current.getItem().getName() + " <<");
            }

            // Wahlmöglichkeiten ausgeben
            System.out.println("1: " + current.getChoice1());
            System.out.println("2: " + current.getChoice2());
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Restzeile leeren

            // Ungültige Eingabe
            if (choice != 1 && choice != 2)
            {
                System.out.println("Invalid choice.");
                System.out.println();
                continue; // wieder bei Schritt 1 mit gleichem StoryNode
            }

            // Wahl == 1 und Node hat Item → Item ins Inventar
            if (choice == 1 && current.hasItem())
            {
                if (addItemToInventory(current.getItem()))
                {
                    System.out.println("Item added to your inventory.");
                }
            }

            // aktuellen StoryNode auf hinterlegten Index setzen
            if (choice == 1)
            {
                current = storyNodes[current.getChoice1Index()];
            }
            else // choice == 2
            {
                current = storyNodes[current.getChoice2Index()];
            }

            System.out.println();
        }

        // 4. Inventar ausgeben, wenn nicht leer
        if (inventoryCount > 0)
        {
            System.out.println("Your inventory:");
            for (int i = 0; i < inventoryCount; i++)
            {
                System.out.println("- " + inventory[i].getName());
            }
        }
    }

    // Beispiel-main (so kannst du das Verhalten mit den Konsolenbeispielen vergleichen)
    public static void main(String[] args)
    {
        Item sword = new Item("Magical Sword");

        // Die StoryNodes sind so gewählt, dass die gezeigten Konsolenbeispiele
        // reproduzierbar sind.

        StoryNode n0 = new StoryNode(
                "You are standing in a dark forest. You see a path ahead.",
                "Walk down the path",
                "Look around",
                1,
                2,
                false
        );

        StoryNode n1 = new StoryNode(
                "You walk down the path and encounter a wild boar!",
                "Fight the boar",
                "Run away",
                3,
                4,
                false
        );

        StoryNode n2 = new StoryNode(
                "You see a small chest hidden behind a tree.",
                "Open the chest",
                "Leave it",
                5,
                4,
                false
        );

        StoryNode n3 = new StoryNode(
                "You walked away safely but lost the opportunity to find a treasure.",
                "",
                "",
                -1,
                -1,
                false
        );

        StoryNode n4 = new StoryNode(
                "You ran away safely but lost the opportunity to find a treasure.",
                "",
                "",
                -1,
                -1,
                false
        );

        StoryNode n5 = new StoryNode(
                "Inside the chest, you find a magical sword. You can feel its power.",
                "Take the sword",
                "Leave it",
                6,
                4,
                false,
                sword
        );

        StoryNode n6 = new StoryNode(
                "You take the sword and feel stronger.",
                "Go back to the mystical path from before.",
                "Leave the forest",
                7,
                4,
                false
        );

        StoryNode n7 = new StoryNode(
                "You walk down the path and encounter a wild boar!\n"
                        + "1: Fight it with your magical sword!\n"
                        + "2: Get your snacks out of your backpack and try to calm it...\n"
                        + "Instead of fighting, you offer the boar some snacks. It eats calmly, "
                        + "and in return, it leaves you alone.",
                "",
                "",
                -1,
                -1,
                true
        );

        StoryNode[] storyNodes = { n0, n1, n2, n3, n4, n5, n6, n7 };

        AdventureGame game = new AdventureGame(storyNodes);
        Scanner scanner = new Scanner(System.in);
        game.playGame(scanner);
    }
}
