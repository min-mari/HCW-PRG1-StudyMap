package example_tasks;
import java.util.*;

/*
Aufgabe RND3 – Caesar-Verschlüsselung

Schreiben Sie eine Methode encrypt, die ein einzelnes Zeichen (char)
und eine ganze Zahl key (int) von der Konsole einliest.
Anschließend soll das Zeichen im Alphabet um key Stellen nach rechts verschoben
und ausgegeben werden.

Regeln:
- Kleinbuchstabe rein => Kleinbuchstabe raus.
- Großbuchstabe rein => Großbuchstabe raus.
- Nach 'z' kommt wieder 'a', nach 'Z' wieder 'A' (zyklisch).
- Nur Buchstaben sind erlaubt (A–Z / a–z). Alles andere => "Fehler".
- Ein negativer key => "Fehler".
- Zum Einlesen eines Zeichens: scanner.next().charAt(0)
- Formeln (zur Orientierung):
  (char) ('a' + ((c - 'a' + key) % 26))
  (char) ('A' + ((c - 'A' + key) % 26))
*/

public class RND3_Encrypt
{
    public static void encrypt()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zeichen: ");
        char c = scanner.next().charAt(0);

        System.out.print("key: ");
        int key = scanner.nextInt();

        // negative Keys sind verboten
        if (key < 0)
        {
            System.out.println("Fehler");
            return;
        }

        // auf 0..25 reduzieren
        int k = key % 26;

        if (c >= 'a' && c <= 'z')
        {
            int pos = c - 'a';
            int newPos = (pos + k) % 26;
            char out = (char) ('a' + newPos);
            System.out.println(out);
        }
        else if (c >= 'A' && c <= 'Z')
        {
            int pos = c - 'A';
            int newPos = (pos + k) % 26;
            char out = (char) ('A' + newPos);
            System.out.println(out);
        }
        else
        {
            System.out.println("Fehler");
        }
    }

    public static void main(String[] args)
    {
        encrypt();
    }
}