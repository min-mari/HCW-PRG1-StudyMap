package example_tasks;

/**
 * ÜBUNG 2 — Mustergenerator (Rechteckmuster aus abwechselnden Zeichen)
 *
 * Schreibe eine Methode drawPattern(int width, int height, char one, char two),
 * die NICHTS zurückgibt, sondern ein Muster auf die Konsole druckt:
 *
 * - Muster ist zeilenabhängig:
 *   - In geraden Zeilen (0,2,4,...) soll DIE GESAMTE ZEILE nur aus 'one' bestehen.
 *   - In ungeraden Zeilen (1,3,5,...) soll die Zeile abwechselnd aus 'one' und 'two'
 *     bestehen: pro Spalte abwechseln, beginnend mit 'one' an Spalte 0.
 *
 * Beispiel: drawPattern(8,8,'X','O')
 */

/*
 * 🔹 How nested loops build 2D patterns (for total beginners)
 *
 * Think of your output like a grid (like an Excel table):
 *   - "rows" = lines that go from top to bottom (vertical)
 *   - "columns" = characters that go from left to right (horizontal)
 *
 * The pattern is drawn by printing characters column by column
 * inside each row, then moving to a new line at the end.
 *
 * 🧩 Outer loop → controls the ROWS (top to bottom)
 *     for (int row = 0; row < height; row++) { ... }
 *     → this loop repeats once per printed line.
 *
 * 🧩 Inner loop → controls the COLUMNS (left to right)
 *     for (int col = 0; col < width; col++) { ... }
 *     → this loop prints all characters in one row.
 *
 * After the inner loop finishes, one line is complete,
 * so we use System.out.println() to jump to the next row.
 *
 * ⚙️ Why we use the modulo operator (%):
 *   - "row % 2" tells us whether the current row is even (0, 2, 4, …)
 *   - "col % 2" tells us whether the current column is even or odd
 *   → This lets us alternate characters in a checkerboard pattern.
 *
 * Example mental picture (width = 8, height = 4):
 *   Row 0 → all X (even row)
 *   Row 1 → XOXOXOXO (odd row)
 *   Row 2 → all X
 *   Row 3 → XOXOXOXO
 *
 * In short:
 *   - The outer loop decides WHICH row you’re drawing.
 *   - The inner loop decides WHAT to print in that row.
 *   - Modulo checks (row%2 / col%2) decide WHEN to switch characters.
 */

public class PV2_Mustergenerator {

    public static void drawPattern(int width, int height, char char1, char char2)
    {
        // äußere Schleife: jede Zeile von 0..height-1
        for (int rows = 0; rows < height; rows++)
        {
            // gerade Zeile → nur 'one' drucken
            if (rows % 2 == 0)
            {
                for (int columns = 0; columns < width; columns++)
                {
                    System.out.print(char1);
                }
            }
            else
            {
                // ungerade Zeile → pro Spalte abwechseln
                for (int col = 0; col < width; col++)
                {
                    if (col % 2 == 0)
                        System.out.print(char1);
                    else
                        System.out.print(char2);
                }
            }
            System.out.println(); // Zeilenumbruch am Ende der Zeile
        }
    }

    // Runnable: Beispiel aus der Folie
    public static void main(String[] args) {
        drawPattern(8, 8, 'X', 'O');
    }
}