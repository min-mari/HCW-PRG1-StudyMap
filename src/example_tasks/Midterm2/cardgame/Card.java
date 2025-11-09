package example_tasks.Midterm2.cardgame;
/*
========================================================
FH Campus Wien – Programmieren 1
Trading Card Game – Objektorientierte Programmierung
========================================================

Repository Link:
Akzeptieren Sie das Assignment via:
https://classroom.github.com/a/tDogiB-X

Wie gewohnt klonen Sie das Repository. Pushen Sie am Ende
die Lösung auf das Remote Repository und vergewissern Sie sich
auf github.com, ob das Autograding erfolgreich durchgeführt wurde.

--------------------------------------------------------
Aufgabe 1: Klasse Card (8 Classroom Punkte)
--------------------------------------------------------
Im Folgenden soll ein Trading Card Game mit Hilfe von
Objektorientierung implementiert werden.
Schreiben Sie zunächst eine Klasse Card, welche die
spielbaren Karten im Trading Card Game repräsentiert.

Die Klasse soll über die privaten Eigenschaften:
- attack (Angriffswert, int)
- defense (Verteidigungswert, int)
- name (Bezeichnung der Karte, String)
- type (Kartentyp, String)

verfügen. Datentypen der Attribute können Sie aus der
Abbildung 1 entnehmen.

Abbildung 1: Attribute und Methoden der Klasse Card
--------------------------------------------------------
+-------------------+
|       Card        |
+-------------------+
| - attack: int     |
| - defense: int    |
| - name: String    |
| - type: String    |
+-------------------+
| + getAttack():int |
| + getDefense():int|
| + getName():String|
| + getType():String|
| + toString():String|
+-------------------+

Die Klasse soll über einen einzigen Konstruktor verfügen,
der es ermöglicht, alle Attribute zu initialisieren.
Diese werden in der Reihenfolge name, attack, defense und type
übergeben.

Getter-Methoden der Klasse Card:
Implementieren Sie für alle Attribute entsprechende
Getter-Methoden.

Die Klasse Card soll keine Setter-Methoden erhalten.

Implementieren Sie die Methode toString() (@Override der Klasse
Object), welche einen String wie folgt formatiert zurückliefert:

Feuerdrache (Angriff: 10, Verteidigung: 5, Typ: Bestie)

Alle Methoden der Klasse Card sind öffentlich.

--------------------------------------------------------
Aufgabe 2: Klasse Player (16 Classroom Punkte)
--------------------------------------------------------
Implementieren Sie die Klasse Player.
Diese soll über die privaten Eigenschaften:
- deck (ein Array von Cards)
- name (Name des Players)
- health (Lebenspunkte)
verfügen.

Abbildung 2: Attribute und Methoden der Klasse Player
--------------------------------------------------------
+----------------------------------+
|             Player               |
+----------------------------------+
| - deck: Card[]                   |
| - name: String                   |
| - health: int                    |
+----------------------------------+
| + addCardToDeck(Card): boolean   |
| + getName(): String              |
| + getHealth(): int               |
| + setHealth(int): void           |
| + playNextCard(): Card           |
| + deckIsEmpty(): boolean         |
| + printDeck(): void              |
+----------------------------------+

Die Klasse erhält einen Konstruktor mit einem Parameter für den
Namen des Players. Außerdem wird das Deck-Array mit einer
Klassenkonstanten DECK_SIZE und die Lebenspunkte des Players mit
der Klassenkonstanten MAX_HEALTH initialisiert.
Beide Konstanten werden in der Klasse Game später eingeführt.

Getter-Methoden:
Implementieren Sie für name und health passende Getter-Methoden.

Setter-Methoden:
Implementieren Sie für health eine passende Setter-Methode.
Health darf dabei den Wert 0 nicht unterschreiten und keinen
höheren Wert als MAX_HEALTH annehmen. Wird eine negative Zahl
übergeben, wird der Wert auf 0 gesetzt.

Die Methode deckIsEmpty() liefert true zurück, wenn das Deck leer
ist, ansonsten false.

Die Methode addCardToDeck() fügt an die nächste freie Position im
Array die übergebene Karte hinzu. Bei Erfolg true, andernfalls false.

Die Methode playNextCard() liefert die erste Karte (Index 0)
zurück. In der Funktion ist sicherzustellen, dass diese Karte
aus dem Spielstapel entfernt wird. Dazu wird ein neues Array mit
reduzierter Größe erzeugt und alle verbleibenden Karten werden
kopiert.

Die Funktion printDeck() soll alle Karten des Spielers auf der
Konsole ausgeben (keine Parameter, kein Rückgabewert).

Alle Methoden der Klasse Player sind öffentlich.

--------------------------------------------------------
Aufgabe 3: Klasse Game (16 Classroom Punkte)
--------------------------------------------------------
Implementieren Sie die Klasse Game.
Diese soll über die privaten Eigenschaften:
- player1 (Player)
- player2 (Player)
- cardPool (Array von Cards)
verfügen.

Zusätzlich sind die Klassenkonstanten:
- MAX_HEALTH = 10
- DECK_SIZE = 10
zu deklarieren.

Der Konstruktor erhält zwei Player-Objekte als Parameter und ist
für die Initialisierung des Kartenpools verantwortlich.

Die private Methode createCardPool() steht bereits zur Verfügung
(muss noch „eingekommentiert“ werden) und soll an geeigneter Stelle
aufgerufen werden.

Schreiben Sie eine private Methode distributeCards(Player p),
welche zufällige Karten aus dem Kartenpool in das Deck des
übergebenen Players legt, bis das Deck gefüllt ist (DECK_SIZE).
Karten können wiederholt vorkommen.

Die Methode startGame() gibt "Spiel gestartet!" aus und verteilt
die Karten an beide Spieler*innen. (Keine Parameter, kein Return)

Die Methode playRound() simuliert einen Spielzug zwischen beiden
Spieler*innen.
Es gewinnt die/der Spieler*in mit dem höheren Angriffswert.
Bei Gleichstand bleibt die Runde unentschieden.

Die Berechnung des Schadens erfolgt nach der Formel:
Schaden = Angriffswert Gewinner*in - Verteidigungswert Verlierer*in

Der Schaden wird von den Lebenspunkten der/des Verlierer*in
abgezogen. Übersteigt der Verteidigungswert den Angriffswert,
wird kein Schaden verursacht.

Spezialfall:
Gewinnt eine "Bestie" gegen einen "Magier", verdoppelt sich der
verursachte Schaden.

--------------------------------------------------------
Ausgabeformat:
--------------------------------------------------------
1. Fall: keine Karten mehr im Deck:
"Die Spieler*innen haben keine Karten mehr im Deck."

2. Fall: Spieler*in 2 gewinnt:
Jane Doe spielt: Feuerdrache (Angriff: 10, Verteidigung: 5, Typ: Bestie)
John Doe spielt: Blitzkrieger (Angriff: 12, Verteidigung: 4, Typ: Krieger)
Jane Doe gewinnt die Runde! John Doe verliert 7 Lebenspunkte.

3. Fall: unentschieden:
Jane Doe spielt: Feuerdrache (Angriff: 10, Verteidigung: 5, Typ: Bestie)
John Doe spielt: Knochensöldner (Angriff: 10, Verteidigung: 6, Typ: Krieger)
Die Runde endet unentschieden!

4. Fall: "Bestie" gegen "Magier":
Jane Doe spielt: Windgeist (Angriff: 9, Verteidigung: 8, Typ: Magier)
John Doe spielt: Schattenpanther (Angriff: 11, Verteidigung: 4, Typ: Bestie)
John Doe gewinnt die Runde! Jane Doe verliert 6 Lebenspunkte.
Schaden verdoppelt: 11 - 8 = 3 → 2x Schadenswert = 6

--------------------------------------------------------
displayWinner()
--------------------------------------------------------
Ermittelt am Ende, wer das Spiel gewonnen hat:

1. Fall: Spieler*in X hat gewonnen:
Gewinner*in: Jane Doe.

2. Fall: unentschieden:
Das Spiel endet unentschieden.

Alle Methoden der Klasse Game sind öffentlich.
========================================================
*/

public class Card
{
    //private Attribute
    private int attack;
    private int defense;
    private String name;
    private String type;

    /**
     * Konstruktor.
     * Initialisiert alle Attribute in der Reihenfolge:
     * name, attack, defense, type
     */
    public Card(String name, int attack, int defense, String type)
    {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.type = type;
    }

    // Getter-Methoden

    public int getAttack()
    {
        return attack;
    }

    public int getDefense()
    {
        return defense;
    }

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    /**
     * Gibt die Karte im geforderten Format zurück, z.B.:
     * Feuerdrache (Angriff: 10, Verteidigung: 5, Typ: Bestie)
     */
    @Override
    public String toString()
    {
        return name + " (Angriff: " + attack
                + ", Verteidigung: " + defense
                + ", Typ: " + type + ")";
    }
}
