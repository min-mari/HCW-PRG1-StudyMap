package folien.datatypes_operators_controlstructures;
import java.util.Scanner;

public class d6_EvenOdd_Modulo
{
    /**
     * AUFGABENSTELLUNG
     * - Lese eine int-Zahl. Gib "even" aus, wenn number % 2 == 0, sonst "odd".
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) System.out.println("even");
        else                 System.out.println("odd");
    }

}
