package folien.loops;
import java.util.Scanner;
public class l4_ReversedStairs
{
    /**
     * AUFGABENSTELLUNG
     * - Lese n. Drucke n Zeilen, beginnend mit n Sternen bis 1 Stern.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = n; row > 0; row--) // Zeilenanzahl
        {
            for (int col = 0; col < row; col++) // Sterne in der Zeile
            {
                System.out.print("*");             // WICHTIG: print, nicht println
            }
            System.out.println();                  // Zeilenumbruch am Ende
        }
    }

}
