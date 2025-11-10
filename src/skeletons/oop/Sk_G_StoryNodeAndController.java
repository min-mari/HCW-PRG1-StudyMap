package skeletons.oop;
import java.util.Scanner;
public class Sk_G_StoryNodeAndController
{


    public class StoryNode
    {
        private String description;
        private String choice1;
        private String choice2;
        private int choice1Index;
        private int choice2Index;
        private boolean hasWon;
        private String item; // optional, can be null

        public StoryNode(String description, String choice1, String choice2,
                         int choice1Index, int choice2Index, boolean hasWon, String item)
        {
            this.description = description;
            this.choice1 = choice1;
            this.choice2 = choice2;
            this.choice1Index = choice1Index;
            this.choice2Index = choice2Index;
            this.hasWon = hasWon;
            this.item = item;
        }

        public StoryNode(String description, String choice1, String choice2,
                         int choice1Index, int choice2Index, boolean hasWon)
        {
            this(description, choice1, choice2, choice1Index, choice2Index, hasWon, null);
        }

        public boolean hasNext()
        {
            return choice1Index >= 0 || choice2Index >= 0;
        }

        public boolean hasItem()
        {
            return item != null;
        }

        public String getItem()
        {
            return item;
        }

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

        public boolean isWinNode()
        {
            return hasWon;
        }
    }

    public class StoryController
    {
        private StoryNode[] storyNodes;
        private String[] inventory;
        private int inventoryCount;

        public StoryController(StoryNode[] storyNodes)
        {
            this.storyNodes = storyNodes;
            this.inventory = new String[5]; // can adjust capacity
            this.inventoryCount = 0;
        }

        private boolean addItem(String item)
        {
            if (inventoryCount >= inventory.length)
            {
                System.out.println("Inventory full!");
                return false;
            }

            inventory[inventoryCount] = item;
            inventoryCount++;
            return true;
        }

        private void showInventory()
        {
            if (inventoryCount == 0)
            {
                System.out.println("Inventory empty.");
                return;
            }

            System.out.println("Inventory:");
            for (int i = 0; i < inventoryCount; i++)
            {
                System.out.println("- " + inventory[i]);
            }
        }

        public void playGame(Scanner scanner)
        {
            if (storyNodes == null || storyNodes.length == 0)
            {
                return;
            }

            StoryNode current = storyNodes[0];

            while (true)
            {
                System.out.println();
                System.out.println(current.getDescription());

                if (!current.hasNext())
                {
                    if (current.isWinNode())
                    {
                        System.out.println("You win!");
                    }
                    else
                    {
                        System.out.println("Game over.");
                    }
                    break;
                }

                if (current.hasItem())
                {
                    System.out.println("You found: " + current.getItem());
                    addItem(current.getItem());
                }

                System.out.println("1: " + current.getChoice1());
                System.out.println("2: " + current.getChoice2());
                System.out.print("Your choice: ");

                int choice;
                try
                {
                    choice = Integer.parseInt(scanner.nextLine());
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid input!");
                    continue;
                }

                if (choice == 1)
                {
                    current = storyNodes[current.getChoice1Index()];
                }
                else if (choice == 2)
                {
                    current = storyNodes[current.getChoice2Index()];
                }
                else
                {
                    System.out.println("Invalid choice!");
                }
            }

            System.out.println();
            showInventory();
        }
    }
}
