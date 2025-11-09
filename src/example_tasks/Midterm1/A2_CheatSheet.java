package example_tasks.Midterm1;
import java.util.*;

/*
Aufgabe 2 (PDF A): Rechengitter (6 Classroom Punkte)

Ein Rechengitter ist eine Additionstabelle.
Schreiben Sie eine Methode cheatSheet, welche zwei Integer Werte (Spalten & Zeilen)
von der Konsole einliest und anschließend die zugehörige Additionstabelle auf der Konsole ausgibt.
Sowohl Zeilen als auch Spalten müssen im Bereich 2-10 liegen. Im Fehlerfall: "Eingabe ungültig"
und Methode abbrechen.

Format:
- Zahlen immer auf 2 Stellen formatiert, durch ein Leerzeichen getrennt.
- Am Ende jeder Zeile ein Leerzeichen und dann ein Zeilenumbruch.
- Keine Rückgabe, keine Input-Parameter.
*/

public class A2_CheatSheet {

    // keine Parameter, kein Return
    public static void cheatSheet()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl Spalten: ");
        int columnCount = scanner.nextInt();

        System.out.print("Anzahl Zeilen: ");
        int rowCount = scanner.nextInt();

        // Bereichsprüfung
        if (columnCount < 2 || columnCount > 10 || rowCount < 2 || rowCount > 10)
        {
            System.out.println("Eingabe ungültig");
            return; // Abbruch
        }

        // Sehr einfache Logik wie im Beispiel: Startwert 2, dann Addition
        int startValue = 2;

        // Äußere Schleife = Zeilen
        for (int rowIndex = 0; rowIndex < rowCount; rowIndex++)
        {
            // Innere Schleife = Spalten
            for (int colIndex = 0; colIndex < columnCount; colIndex++)
            {
                int value = startValue + rowIndex + colIndex;
                System.out.printf("%2d ", value);
            }
            System.out.println(); // Zeilenumbruch
        }
    }

    // macht die Klasse direkt ausführbar
    public static void main(String[] args)
    {
        cheatSheet();
    }
}
