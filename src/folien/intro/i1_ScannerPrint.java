package folien.intro;
import java.util.Scanner;
public class i1_ScannerPrint
{
    /**
     * AUFGABENSTELLUNG (Intro – Struktur & I/O)
     * - Frage nach dem Namen und begrüße die Person: "Hello, <Name>!"
     * - Trainiert: Scanner, println, String-Konkatenation.
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();              // ganze Zeile lesen
        System.out.println("Hello, " + name + "!");
        // Scanner in Midterm nicht schließen
    }

}
