package folien.datatypes_operators_controlstructures;
import java.util.Scanner;
public class d3_SignClassifier
{
    /**
     * AUFGABENSTELLUNG
     * - Lese eine ganze Zahl x und gib aus: "negative", "zero" oder "positive".
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x < 0)
        {
            System.out.println("negative");
        }
        else if (x == 0)
        {
            System.out.println("zero");
        }
        else
        {
            System.out.println("positive");
        }
    }
}
