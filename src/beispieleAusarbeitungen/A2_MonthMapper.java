/**
 * AUFGABENSTELLUNG (Midterm 2021 A – Task 2)
 * monthMapper():
 *   - Lese über Konsole ENTWEDER:
 *       "r" → wähle zufälligen Monat (nutze generateRandomMonth())
 *       ODER eine Zahl 1..12 → mappe auf Monatsnamen (English)
 *   - Ungültige Eingaben → gib "Invalid month" zurück.
 *   - Hinweis: Eingabe mit nextLine() lesen.
 */

// Warum + wie:
//  - nextInt(12) liefert 0..11 → plus 1 = 1..12 (inklusive).
//  - Integer-Range wie in der Angabe gefordert.
// -----------------------------------------------------------

package beispieleAusarbeitungen;
import java.util.Random;
import java.util.Scanner;

public class A2_MonthMapper
{
    public static String monthMapper()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1-12 or 'r' to pick a random month:");
        String input = sc.nextLine().trim();

        int monthNumber;

        if (input.equals("r"))
        {
            monthNumber = generateRandomMonth();
            System.out.println("(random picked: " + monthNumber + ")"); //Optional
        }
        else if (isAllDigits(input))
        {
            //eine Ziffernfolge
            monthNumber = Integer.parseInt(input);
        }
        else
        {
            return "Invalid month";
        }

        switch (monthNumber)
        {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }

    // true, wenn s aus mind. 1 Ziffer besteht und nur Ziffern enthält
    private static boolean isAllDigits(String s)
    {
        if (s.isEmpty()) return false;
        for (int i = 0; i < s.length(); i++)
        {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    private static int generateRandomMonth()
    {
        return new Random().nextInt(12) + 1; // 1..12 und nicht 0 bis 11, deswegen +1
    }

    // Runnable entry point
    public static void main(String[] args) {
        System.out.println("-> " + monthMapper());
    }
}