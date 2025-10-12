package example_tasks;
import java.util.*;

public class A1_ZipCodeChecker
{
    /*
    Aufgabe: Wiener Postleitzahlen (4 Classroom Punkte)

    Postleitzahlen in Wien haben das Format 1BBF, wobei
    - B der Bezirk ist, von 01 bis 23, und
    - F die Filiale.

    Schreiben Sie eine Methode checkZipCode, die eine Wiener Postleitzahl als Integer übergeben bekommt und den Bezirk als Integer zurückliefert. Die Methode soll den übergebenen Integer Wert auf Bezirksebene überprüfen und im Fehlerfall -1 zurückliefern sowie eine Fehlermeldung ausgegeben ("Postleitzahl ungültig"). Es wird davon ausgegangen, dass die Postleitzahl mit 1 beginnt und genau 4 Stellen hat.
    */

    public static int checkZipCode(int zipCode)
    {
        // Wir gehen davon aus: 4-stellig und beginnt mit 1.
        // Wir extrahieren die Bezirkszahl (zweite und dritte Ziffer).
        int hundreds = (zipCode / 100) % 10; // zweite Ziffer nach der führenden 1
        int tens = (zipCode / 10) % 10;      // dritte Ziffer
        int district = hundreds * 10 + tens;

        if (district < 1 || district > 23) {
            System.out.println("Postleitzahl ungültig");
            return -1;
        } else {
            return district;
        }
    }

    // Testrun
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Postleitzahl eingeben: ");
        int zip = scanner.nextInt();

        int result = checkZipCode(zip);
        if (result != -1) {
            System.out.println(result + ". Bezirk");
        }
    }
}





