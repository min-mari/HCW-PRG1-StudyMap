package folien.datatypes_operators_controlstructures;
import java.util.Scanner;
public class d1_MinOfThree
{
    /**
     * AUFGABENSTELLUNG
     * - Lese drei ganze Zahlen first, second, third.
     * - Speichere das kleinste in Variable min und gib es aus.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("first: ");  int first = sc.nextInt();
        System.out.print("second: "); int second = sc.nextInt();
        System.out.print("third: ");  int third = sc.nextInt();

        int min;
        if (first < second) min = first;
        else                min = second;

        if (third < min) min = third;

        System.out.println("min = " + min);
    }
}
