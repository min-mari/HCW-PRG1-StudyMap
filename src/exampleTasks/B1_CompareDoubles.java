package exampleTasks;
import java.util.Scanner;

/**
 * AUFGABENSTELLUNG (Midterm 2021 B – Task 1)
 * compareDoubles():
 *   - Lese zwei double-Werte von der Konsole.
 *   - Prüfe, ob sie bis zur DRITTEN Nachkommastelle gleich sind.
 *   - Rückgabe: boolean (true/false).
 * HINWEIS: epsilon = 0.001 → |a - b| < 0.001 → gleich bis 3 Stellen.
 */
public class B1_CompareDoubles
{

    public static boolean compareDoubles()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1: ");           // exakt wie oft in Midterms
        double a = sc.nextDouble();
        System.out.print("Number2: ");
        double b = sc.nextDouble();

        double diff = Math.abs(a - b);           // absoluter Unterschied
        boolean equalTo3rd = diff < 0.001;       // < 0.001 → gleich bis 3. Stelle
        return equalTo3rd;
    }

    // Runnable test
    public static void main(String[] args)
    {
        System.out.println(compareDoubles());
    }
}