package example_tasks;
import java.util.Scanner;

/* ============================================================
   Aufgabe 1 – Check Floats (8 Punkte)
   ------------------------------------------------------------
   Liest zwei Gleitkommawerte von der Konsole (n1, n2),
   akzeptiert Punkt oder Komma als Dezimaltrenner.
   Rundet beide Werte auf 3 Nachkommastellen (×1000, Math.round)
   und vergleicht sie.
   Gibt aus:
      "Numbers are equal."
      "Numbers are not equal."
   ------------------------------------------------------------
   Kein try/catch, kein fancy Code – einfache Logik.
   ============================================================ */
public class RND1_CompareDoubles
{
    public static void compareDoubles()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n1:");
        String input1 = scanner.nextLine().trim();   // erster eingegebener Wert
        System.out.println("n2:");
        String input2 = scanner.nextLine().trim();   // zweiter eingegebener Wert

        // Kommas in Punkte umwandeln, damit Double.parseDouble funktioniert
        double number1 = Double.parseDouble(input1.replace(',', '.'));
        double number2 = Double.parseDouble(input2.replace(',', '.'));

        // Auf 3 Nachkommastellen runden: *1000, dann Math.round(), dann int
        int rounded1 = (int) Math.round(number1 * 1000.0);
        int rounded2 = (int) Math.round(number2 * 1000.0);

        // Vergleich der gerundeten Werte
        if (rounded1 == rounded2)
        {
            System.out.println("Numbers are equal.");
        }
        else
        {
            System.out.println("Numbers are not equal.");
        }
    }

    // Optionaler main() zum schnellen Testen in der IDE
    public static void main(String[] args)
    {
        compareDoubles();
    }
}