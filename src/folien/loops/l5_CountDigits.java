package folien.loops;
import java.util.Scanner;
public class l5_CountDigits
{
    /**
     * AUFGABENSTELLUNG
     * - Lese eine positive ganze Zahl und gib die Anzahl ihrer Ziffern aus.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0)
        {
            System.out.println("Enter positive integer!");
            return;
        }

        int count = 0;
        while (n > 0)
        {
            n /= 10;     // eine Ziffer "abschneiden"
            count++;
        }

        System.out.println(count + " digits");
    }
}
