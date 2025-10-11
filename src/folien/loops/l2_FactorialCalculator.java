package folien.loops;
import java.util.Scanner;
public class l2_FactorialCalculator
{
    /**
     * AUFGABENSTELLUNG
     * - Lese n (int >= 0) und berechne n! (Produkt 1..n). Gib Ergebnis aus.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result = 1;                  // long, damit mehr Platz
        for (int i = 2; i <= n; i++)
        {
            result *= i;
        }
        System.out.println(n + "! = " + result);
    }
}
