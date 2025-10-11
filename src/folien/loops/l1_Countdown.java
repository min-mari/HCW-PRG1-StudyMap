package folien.loops;
import java.util.Scanner;
public class l1_Countdown
{
    /**
     * AUFGABENSTELLUNG
     * - Lese Startzahl n. Zähle bis 0 herunter und gib jede Zahl aus.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 0; i--)
        {
            System.out.print(i);
            if (i > 0) System.out.print(" ");
        }
        System.out.println();
    }


}
