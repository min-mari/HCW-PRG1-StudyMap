package beispieleAusarbeitungen;
import java.util.Scanner;

/**
 * AUFGABENSTELLUNG (Midterm 2020 D – Task 2)
 * incomeStatistics():
 *   - Lese ganze Zahlen bis 0.
 *   - Negative Werte → "Invalid income." ausgeben, NICHT mitzählen.
 *   - Nach der 0:
 *       - Wenn keine gültigen Werte → "No valid entries."
 *       - Sonst drucke (eigene Zeilen, Format 2 Nachkommastellen):
 *           "Average: <Ø>"
 *           "Sum: <Σ>"
 *           "Count: <Anzahl>"
 * HINWEIS:
 *   - Scanner nicht schließen (Autograder/Console).
 *   - Achte auf exakte Texte und Formatierung.
 */
public class D2_IncomeStatistics
{

    public static void incomeStatistics()
    {
        Scanner sc = new Scanner(System.in);

        int count = 0;               // Anzahl gültiger Werte
        double sum = 0.0;            // Summe als double für Ø

        while (true)
        {
            int income = sc.nextInt();   // liest nächste ganze Zahl
            if (income == 0) break;      // 0 beendet Eingabe

            if (income < 0)
            {
                System.out.println("Invalid income."); // negatives ignorieren
                continue;                               // nächste Zahl lesen
            }

            sum += income;               // gültig → zählen
            count++;
        }

        if (count == 0)
        {
            System.out.println("No valid entries.");   // kein gültiger Wert
        }
        else
        {
            double avg = sum / count;                  // Durchschnitt
            System.out.printf("Average: %.2f%n", avg); // 2 Nachkommastellen
            System.out.printf("Sum: %.2f%n", sum);
            System.out.printf("Count: %d%n", count);
        }
    }

    // Runnable test
    public static void main(String[] args)
    {
        // Beispiel-Eingabe (Konsole): 1000 1500 -5 1800 0
        incomeStatistics();
    }
}