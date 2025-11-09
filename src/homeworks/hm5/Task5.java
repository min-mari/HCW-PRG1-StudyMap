package homeworks.hm5;

public class Task5
{
    /*
------------------------------------------------------------
ÜBUNG 5 – TIC TAC TOE
------------------------------------------------------------
Ziel:
Ein Konsolen-Spiel „Tic Tac Toe“ für zwei Spieler*innen umsetzen.
Es wird auf einem 3x3-Spielfeld gespielt, abwechselnd, höchstens 9 Züge.

Allgemeine Hinweise:
- Es gibt ein vorgegebenes Projektgerüst, Klassennamen und Signaturen
  dürfen nicht verändert werden.
- Ein- und Ausgaben müssen genau wie in den Beispielen formatiert sein.
- In App.java sind alle Methoden public static.
- Testdateien (*Test.java) und der .github-Ordner dürfen nicht verändert werden.

------------------------------------------------------------
Aufgabe 1 – Klasse Player anlegen
------------------------------------------------------------
- Neue Klasse Player erstellen.
- Instanzvariablen:
    - symbol (char)  → Spielstein, z.B. 'X' oder 'O'
    - name   (String) → Name der Spieler*in
- Konstruktor mit Parametern für Symbol und Name implementieren und
  beide Felder setzen.

------------------------------------------------------------
Aufgabe 2 – Getter in Player
------------------------------------------------------------
- Öffentliche Getter-Methoden schreiben:
    - getName()
    - getSymbol()

------------------------------------------------------------
Aufgabe 3 – makeMove in Player
------------------------------------------------------------
- Methode:
    - public void makeMove(TicTacToe ttt, Scanner scanner)
- Aufgaben der Methode:
    - Von der Konsole eine Zahl zwischen 1 und 9 einlesen.
    - Nur Werte 1–9 akzeptieren, ansonsten Eingabe wiederholen.
    - Jede Zahl steht für genau ein Feld auf dem Spielfeld.
    - Es darf nicht auf ein bereits belegtes Feld gesetzt werden.
    - Für das eigentliche Setzen des Symbols wird eine Methode der
      Klasse TicTacToe verwendet (placeTic / placeMove o.ä.).
    - Solange Eingabe ungültig oder Feld belegt ist, erneut abfragen.
- Scanner-Objekt wird von außen übergeben, in der Methode darf kein
  neues Scanner-Objekt erzeugt werden.

------------------------------------------------------------
Aufgabe 4 – Klasse TicTacToe anlegen
------------------------------------------------------------
- Neue Klasse TicTacToe anlegen.
- Instanzvariablen:
    - Referenzen auf zwei Player-Objekte (p1, p2)
    - 2D-Array für das Spielfeld, z.B. char[][] gameBoard
- Konstruktor:
    - Zwei Player-Objekte als Parameter übernehmen und Felder setzen.
    - Spielfeld initialisieren:
        - 3 Zeilen, 3 Spalten.
        - Zu Beginn stehen anstelle von 'X'/'O' die Ziffern '1' bis '9'
          in den Feldern (als char).

------------------------------------------------------------
Aufgabe 5 – placeTic
------------------------------------------------------------
- Methode:
    - public boolean placeTic(Player p, int row, int col)
- Verhalten:
    - Prüft die angegebene Position im Spielfeld.
    - Wenn dort schon ein Symbol ('X' oder 'O') liegt → false zurückgeben.
    - Wenn das Feld noch nicht belegt ist:
        - Symbol der Spieler*in (p.getSymbol()) in das Feld schreiben.
        - true zurückgeben.

------------------------------------------------------------
Aufgabe 6 – prettyPrintGameBoard
------------------------------------------------------------
- Methode:
    - private void prettyPrintGameBoard()
- Verhalten:
    - Gibt das Spielfeld formatiert auf der Konsole aus.
    - Zwischen den Feldern Trennstriche und Linien wie im Console-Beispiel.
    - Es werden entweder die Zahlen '1'–'9' oder die Spieler-Symbole
      angezeigt, je nachdem, was aktuell im Array steht.

------------------------------------------------------------
Aufgabe 7 – checkIfWon
------------------------------------------------------------
- Methode:
    - public boolean checkIfWon(Player p)
- Verhalten:
    - Prüft, ob die Spieler*in p gewonnen hat.
    - Gewinnbedingungen:
        - Drei gleiche Symbole in einer Zeile, oder
        - drei gleiche Symbole in einer Spalte, oder
        - drei gleiche Symbole auf einer der beiden Diagonalen.
    - Wenn gewonnen → true, sonst false.

------------------------------------------------------------
Aufgabe 8 – playGame
------------------------------------------------------------
- Methode:
    - public void playGame()
- Aufgaben:
    - Spielsteuerung für ein gesamtes Match.
    - Es spielen p1 und p2 abwechselnd.
    - Maximal 9 Züge werden gemacht.
    - Player 1 beginnt immer.
    - Vor jedem Zug:
        - aktuelles Spielfeld mit prettyPrintGameBoard() ausgeben.
    - Zug der aktuellen Spieler*in über makeMove(...) einholen.
    - Nach jedem Zug:
        - Mit checkIfWon(...) prüfen, ob die aktuelle Spieler*in gewonnen hat.
        - Wenn ja:
            - Meldung: "<Name> has won the game!"
            - Spielfeld nochmals ausgeben, Methode beenden.
    - Wenn alle 9 Felder belegt sind und niemand gewonnen hat:
        - Meldung: "Nobody wins!"
        - Spielfeld nochmals ausgeben.

------------------------------------------------------------
Aufgabe 9 – Computer-Spieler (optional, keine Bewertung)
------------------------------------------------------------
- Erweiterungsidee:
    - Spiel gegen den Computer ermöglichen.
    - Klasse Player erweitern, z.B. um boolean isHuman.
    - Zusätzliche Methode implementieren, die automatisch einen Zug
      für den Computer auswählt (z.B. gewinnen, blockieren, sonst
      zufälliges freies Feld).
------------------------------------------------------------
*/

}
