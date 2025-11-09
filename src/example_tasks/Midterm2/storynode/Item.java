package example_tasks.Midterm2.storynode;

public class Item
{
    /*
==========================================
FH CAMPUS WIEN – PROGRAMMIERUNG 1 ILV
ZWISCHENTEST 2B – TEXT ADVENTURE GAME
==========================================

🕹 Allgemeine Beschreibung des Spiels
------------------------------------
Ihre Aufgabe ist es, ein kleines Text-Adventure-Game zu entwickeln, das aus den Klassen
AdventureGame, StoryNode und Item besteht (siehe Klassen-Diagramme).

Ein AdventureGame Objekt besteht aus mehreren StoryNode Objekten, welche im Zuge des Spiels
vom Spielenden durchlaufen werden können. So können die Spielenden zu jedem StoryNode eine
Entscheidung treffen, welche zum ausgewählten nächsten StoryNode führt.

Ziel des Spiels ist es, einen Endknoten (StoryNode ohne weiterführende Verweise) zu erreichen
und dabei bestenfalls nicht zu sterben. 🪦


==========================================
AUFGABEN
==========================================

🧱 Aufgabe 1 – Klasse Item (1 Classroom Punkt)
----------------------------------------------
Erstellen Sie eine Klasse Item im Package "at.ac.fhcampuswien".
Ein Item soll über eine private Variable name vom Typ String verfügen.
Es soll einen Konstruktor geben, dem der Name übergeben wird.
Schreiben Sie außerdem eine Getter-Methode getName(), die den Namen zurückgibt.


🧱 Aufgabe 2 – Klasse StoryNode (3 Classroom Punkte)
----------------------------------------------------
Erstellen Sie eine Klasse StoryNode im Package "at.ac.fhcampuswien".

Die Klasse StoryNode soll 7 private Instanzvariablen haben:
- description : String
- choice1 : String
- choice2 : String
- choice1Index : int
- choice2Index : int
- hasWon : boolean
- item : Item

Erstellen Sie zwei Konstruktoren:
1️⃣ StoryNode(String description, String choice1, String choice2, int choice1Index, int choice2Index, boolean hasWon)
2️⃣ StoryNode(String description, String choice1, String choice2, int choice1Index, int choice2Index, boolean hasWon, Item item)

Schreiben Sie passende öffentliche Getter-Methoden für alle Instanzvariablen.


🧭 Aufgabe 3 – Methode hasNext (6 Classroom Punkte)
---------------------------------------------------
Schreiben Sie eine öffentliche Methode hasNext(),
die true zurückgibt, wenn das StoryNode-Objekt einen Folge-Node hat,
und false, wenn nicht.
(Dabei gilt: kein Folge-Node existiert, wenn choice1Index UND choice2Index negativ sind.)


🎒 Aufgabe 4 – Methode hasItem (2 Classroom Punkte)
---------------------------------------------------
Schreiben Sie eine öffentliche Methode hasItem().
Sie soll true zurückgeben, wenn beim Erstellen des StoryNode-Objekts ein Item übergeben wurde,
und false, wenn kein Item oder null übergeben wurde.


🏁 Aufgabe 5 – Methode getEndingText (4 Classroom Punkte)
---------------------------------------------------------
Schreiben Sie eine öffentliche Methode getEndingText(),
die einen String zurückgibt.

Handelt es sich um einen End-Node (es gibt keinen Folge-Node)
und die Instanzvariable hasWon ist wahr, dann soll "You win!" zurückgegeben werden.
Gibt es keinen Folge-Node und hasWon ist falsch, dann soll "Game Over" zurückgegeben werden.
Wird die Methode auf einem Objekt aufgerufen, das Folge-Nodes besitzt,
soll "This story is not yet complete..." zurückgegeben werden.


==========================================
KAPITEL 2 – KLASSE ADVENTUREGAME
==========================================

🏗 Aufgabe 6 – Klasse AdventureGame (2 Classroom Punkte)
--------------------------------------------------------
Erstellen Sie die Klasse AdventureGame mit 3 privaten Instanzvariablen:
- storyNodes : StoryNode[]
- inventory : Item[]
- inventoryCount : int

Initialisieren Sie im Konstruktor:
- inventory als neues Item-Array der Größe 5
- inventoryCount auf 0


📦 Aufgabe 7 – Methode addItemToInventory (3 Classroom Punkte)
--------------------------------------------------------------
Schreiben Sie eine Methode addItemToInventory(Item item).

Wenn das inventory noch nicht voll ist, soll das Item hinzugefügt werden
und die Methode true zurückgeben.

Ist das inventory voll, geben Sie die Meldung:
"Inventory is full! You can't carry more items."
in der Konsole aus und geben false zurück.

Ein inventory gilt als voll, wenn alle 5 Plätze belegt sind (und nicht null!).
Tipp: Nutzen Sie die Hilfsvariable inventoryCount.


🧩 Aufgabe 8 – Methode playGame (19 Classroom Punkte)
-----------------------------------------------------
Schreiben Sie eine öffentliche Methode playGame(Scanner scanner),
die die Spiellogik enthält.

Die Methode soll mit einem Scanner arbeiten, um die Entscheidungen der Spielenden einzulesen.
Gestartet wird mit dem ersten StoryNode-Objekt im storyNodes-Array.

Die Spiellogik verläuft wie folgt:

1️⃣ Geben Sie die Beschreibung des aktuellen StoryNode aus.
2️⃣ Prüfen Sie, ob StoryNode ein End-Node ist.
    - Wenn ja: Geben Sie den EndingText aus und beenden Sie das Spiel.
3️⃣ Prüfen Sie, ob StoryNode ein Item enthält.
    - Wenn ja: Geben Sie ">> You found an item: <<itemName>> <<" aus.
4️⃣ Geben Sie choice1 und choice2 aus.
5️⃣ Lesen Sie eine gültige Eingabe (1 oder 2) vom Scanner ein.
    - Bei ungültiger Eingabe: "Invalid choice." und Schritt 1 wiederholen.
6️⃣ Wenn Wahl == 1 und Item vorhanden → fügen Sie es dem Inventar hinzu.
    Geben Sie "Item added to your inventory." aus.
7️⃣ Setzen Sie den aktuellen StoryNode auf den gewählten Folge-Node (choice1Index oder choice2Index)
    und wiederholen Sie den Ablauf ab Schritt 1.
8️⃣ Wenn End-Node erreicht, geben Sie das Inventory aus (falls nicht leer).


💡 Tipp:
Testen Sie Ihre Implementierung mit dem bereitgestellten StoryNode[] Array in der main-Methode
und vergleichen Sie die Konsolenausgabe mit den Beispielen auf dem Aufgabenblatt.
*/

    private String name;

    public Item(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
