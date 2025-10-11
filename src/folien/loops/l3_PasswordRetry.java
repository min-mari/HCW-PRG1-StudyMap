package folien.loops;
import java.util.Scanner;
public class l3_PasswordRetry
{
    /**
     * AUFGABENSTELLUNG
     * - Erlaube max. 3 Passwort-Versuche. Bei Treffer: "Access granted",
     *   sonst nach 3 Fehlversuchen: "Access denied".
     */


    public static void main(String[] args)
    {
        final String SECRET = "letmein";
        Scanner sc = new Scanner(System.in);

        boolean ok = false;
        for (int i = 1; i <= 3; i++)
        {
            System.out.print("Password: ");
            String p = sc.nextLine();
            if (p.equals(SECRET))
            {
                ok = true;
                break;
            }

            System.out.println("Wrong password.");
        }

        System.out.println(ok ? "Access granted" : "Access denied");
    }

}
