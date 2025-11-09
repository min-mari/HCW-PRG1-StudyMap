package example_tasks.Midterm1;
import java.util.*;

/*
Aufgabe 1 (PDF C): Registrierkasse (5 Classroom Punkte)

Schreiben Sie eine Methode cashRegister, die einen zu zahlenden Betrag (int) und
einen erhaltenen Betrag (int) von der Konsole einliest. Die Funktion berechnet das
Rückgeld und gibt dieses zurück (int).

Regeln:
- Eingabe ist fehlerhaft, wenn zu zahlender Betrag oder erhaltener Betrag < -1 ist.
- Wenn der erhaltene Betrag kleiner als der zu zahlende Betrag ist -> Fehlermeldung.
- Bei Fehler: "Eingabe fehlerhaft oder erhaltener Betrag zu klein." und neue Eingabe.
- Die Eingabe -1 beendet die Funktion; in diesem Fall soll die Funktion -1 zurückgeben.
- Beispiele wie im PDF.
*/

public class C1_CashRegister
{

    // liest selbst von der Konsole und gibt int zurück
    public static int cashRegister()
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Zu zahlender Betrag: ");
            int toPay = scanner.nextInt();

            // Abbruchbedingung
            if (toPay == -1)
            {
                System.out.println("(return Value => -1)");
                return -1;
            }

            // Ungültig, weil < -1
            if (toPay < -1)
            {
                System.out.println("Eingabe fehlerhaft oder erhaltener Betrag zu klein.");
                continue; // neue Eingabe
            }

            System.out.print("Erhalten: ");
            int received = scanner.nextInt();

            // Abbruchbedingung
            if (received == -1)
            {
                System.out.println("(return Value => -1)");
                return -1;
            }

            // Ungültig, weil < -1
            if (received < -1)
            {
                System.out.println("Eingabe fehlerhaft oder erhaltener Betrag zu klein.");
                continue;
            }

            // zu wenig Geld erhalten
            if (received < toPay)
            {
                System.out.println("Eingabe fehlerhaft oder erhaltener Betrag zu klein.");
                continue;
            }

            // gültiger Fall: Rückgeld berechnen
            int change = received - toPay;
            System.out.println("(return Value => " + change + ")");
            return change;
        }
    }

    // ausführbar
    public static void main(String[] args)
    {
        cashRegister();
    }
}
