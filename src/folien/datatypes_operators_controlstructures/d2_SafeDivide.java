package folien.datatypes_operators_controlstructures;
import java.util.Scanner;
public class d2_SafeDivide
{
    /**
     * AUFGABENSTELLUNG
     * - Lese x und y (double). Ist y==0 → Fehlermeldung.
     * - Sonst Ergebnis x/y ausgeben.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: "); double x = sc.nextDouble();
        System.out.print("y: "); double y = sc.nextDouble();

        if (y == 0)
        {
            System.out.println("Error: can't divide by zero");
        }
        else
        {
            double z = x / y;
            System.out.println("The result is " + z);
        }
    }
}
