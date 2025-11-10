package skeletons.oop;

public class Sk_0_ReferenceMap
{
    /*
=====================================================================
🧭 STUDYMAP: JAVA SKELETON REFERENCE GUIDE
=====================================================================

📂 Folder: /skeletons

    Sk_A_Entity.java
    Sk_B_ArrayManager.java
    Sk_C_SlotAndSlotManager.java
    Sk_D_StaticTrackedEntity.java
    Sk_E_CLIMenuApp.java
    Sk_F_GridGame.java
    Sk_G_StoryNodeAndController.java

=====================================================================
🔍 QUICK DECISION CHECKLIST  →  Which skeleton to open?
=====================================================================

If the task says or implies...                        → Use skeleton

"Class with attributes, constructor, getters..."       → Sk_A_Entity
"Store multiple X in array (add, list, filter...)"     → Sk_B_ArrayManager
"Spots / deck / lockers / first free / remove key"     → Sk_C_SlotAndSlotManager
"Track total number / revenue / static stats"          → Sk_D_StaticTrackedEntity
"Console menu / scanner / commands 1–N / loop"         → Sk_E_CLIMenuApp
"Board / grid (3x3 etc.) / print / check win"          → Sk_F_GridGame
"Story with choices / next scene / inventory"          → Sk_G_StoryNodeAndController

=====================================================================
🧩 PATTERN → SKELETON → EXAMPLE TASK
=====================================================================

A) SIMPLE ENTITY CLASS
----------------------
Use: Sk_A_Entity
Pattern: Data class with attributes, constructor, getters, logic.
Examples:
    - CardGame → Card, Player
    - Cars / Cat → Car, Cat
    - Students → Student
    - MyTunes → Music
    - ShoppingCart → Product
    - StoryNode / AdventureGame → Item

--------------------------------------------------------------

B) ARRAY MANAGER (LIST OF OBJECTS + SIZE + FILTERS)
----------------------------------------------------
Use: Sk_B_ArrayManager
Pattern: Manage multiple entities in an array, with add/filter/total methods.
Examples:
    - MyTunes → Music[] pieces
    - ShoppingCart → Product[] items
    - AdventureGame → Item[] inventory

--------------------------------------------------------------

C) SLOT / SPOT MANAGER
----------------------
Use: Sk_C_SlotAndSlotManager
Pattern: Fixed “places” that may be empty or filled.
         Find first free slot, remove by key.
Examples:
    - ParkingGarage → ParkingSpot[] spots
    - CardGame → Player.deck[] cards

--------------------------------------------------------------

D) STATIC TRACKED ENTITY (GLOBAL COUNTERS/STATS)
------------------------------------------------
Use: Sk_D_StaticTrackedEntity
Pattern: Track totals across all instances (static fields).
Examples:
    - Students → Student.studentCount
    - ShoppingCart → Cart.cartCount, Cart.revenue

--------------------------------------------------------------

E) CLI MENU APP (USER INTERACTION LOOP)
---------------------------------------
Use: Sk_E_CLIMenuApp
Pattern: While loop + Scanner + numbered menu options.
Examples:
    - ParkingGarage → menu 1–4
    - MyTunes → run() with 1–5 commands
    - AdventureGame → playGame(Scanner)
    - TicTacToe → playGame() (round-based)

--------------------------------------------------------------

F) GRID GAME (2D BOARD)
-----------------------
Use: Sk_F_GridGame
Pattern: 2D array board (char[][] or int[][]), print, check win in row/col/diag.
Examples:
    - TicTacToe → gameBoard, placeTic, checkIfWon

--------------------------------------------------------------

G) STORY NODE GRAPH / CONTROLLER
--------------------------------
Use: Sk_G_StoryNodeAndController
Pattern: Nodes with text + choices → next node, optional inventory, win/lose end.
Examples:
    - StoryNode / AdventureGame → StoryNode[], playGame(Scanner)

=====================================================================
🧠 SUMMARY SHORTCUT
=====================================================================

| Concept          | Skeleton                     | Core Data Pattern                | Example           |
|------------------|------------------------------|----------------------------------|-------------------|
| Entity           | Sk_A_Entity                  | single object with data          | Card, Car, Music  |
| Array of entities| Sk_B_ArrayManager            | array + size + filters           | MyTunes, Inventory|
| Slots            | Sk_C_SlotAndSlotManager      | fixed positions (free/occupied)  | ParkingGarage     |
| Static totals    | Sk_D_StaticTrackedEntity     | global counters / totals         | Student count     |
| CLI App          | Sk_E_CLIMenuApp              | while loop + user input          | MyTunes App       |
| Grid             | Sk_F_GridGame                | 2D board / win check             | TicTacToe         |
| Story            | Sk_G_StoryNodeAndController  | node graph with choices          | AdventureGame     |

=====================================================================
⚙️  EXAM STRATEGY (HOW TO APPLY)
=====================================================================

1. Read the new task description carefully.
2. Identify what kind of data handling is described.
3. Match keywords to patterns in the quick checklist.
4. Open the corresponding skeleton(s) and adapt:
      - Rename classes and variables.
      - Adjust data types (String → int → double).
      - Implement only the logic described in the task.

Example reasoning:
    "Program stores cars in a garage with fixed number of spots,
     user can park/take cars via menu."
 → Sk_A_Entity (Car)
 → Sk_C_SlotAndSlotManager (garage spots)
 → Sk_E_CLIMenuApp (menu control)

=====================================================================
END OF STUDYMAP SKELETON REFERENCE
=====================================================================
*/
}
