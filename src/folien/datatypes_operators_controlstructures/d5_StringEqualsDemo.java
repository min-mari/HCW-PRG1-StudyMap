package folien.datatypes_operators_controlstructures;
import java.util.Scanner;
public class d5_StringEqualsDemo
{
    /**
     * AUFGABENSTELLUNG
     * - Lese einen String und prüfe, ob er exakt "secret" ist (equals, nicht ==).
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equals("secret"))
        {
            System.out.println("Match!");
        }
        else
        {
            System.out.println("No match");
        }
    }
}
