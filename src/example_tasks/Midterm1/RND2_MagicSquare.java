package example_tasks.Midterm1;
import java.util.Scanner;

/* ============================================================
   Aufgabe 2 – Magic Square Matrix (12 Punkte)
   ------------------------------------------------------------
   Liest:
      1) eine ganze Zahl n (Matrixgröße)
      2) einen Buchstaben C (Startbuchstabe)
   Prüft:
      n muss zwischen 1 und 42 liegen
      C muss zwischen 'A' und 'Z' liegen
   Wenn etwas ungültig:
      "Invalid number."
      "Invalid symbol."
   Wenn alles gültig:
      gibt eine n×n-Matrix mit Buchstaben aus, beginnend bei C.
      Nach 'Z' wieder mit 'A' fortsetzen.
   Beispiel:
      n = 3, C = X
      Ausgabe:
         X Y Z
         A B C
         D E F
   ------------------------------------------------------------
   Kein try/catch, nur einfache Schleifen und Bedingungen.
   ============================================================ */
public class RND2_MagicSquare
{
    public static void magicSquareMatrix()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n:");
        String inputNumber = scanner.nextLine().trim();  // Eingabe für Matrixgröße

        System.out.println("C:");
        String inputLetter = scanner.nextLine().trim();  // Eingabe für Startbuchstabe

        // ---------- Prüfung der Zahl ----------
        boolean numberValid = true; // gilt zunächst als gültig
        int matrixSize = 0;         // wird erst gesetzt, wenn gültig

        // Prüfen: besteht inputNumber nur aus Ziffern?
        if (inputNumber.length() == 0)
        {
            numberValid = false;
        }
        else
        {
            for (int i = 0; i < inputNumber.length(); i++)
            {
                char currentChar = inputNumber.charAt(i);
                if (currentChar < '0' || currentChar > '9')
                {
                    numberValid = false;
                }
            }
        }

        // Wenn Zahl gültig aussieht → umwandeln in int
        if (numberValid)
        {
            matrixSize = Integer.parseInt(inputNumber);
        }

        // Prüfen, ob Zahl im Bereich 1..42 liegt
        if (matrixSize < 1 || matrixSize > 42)
        {
            numberValid = false;
        }

        // ---------- Prüfung des Buchstabens ----------
        boolean letterValid = true;
        char startLetter = '\0';

        if (inputLetter.length() == 0)
        {
            letterValid = false;
        }
        else
        {
            startLetter = inputLetter.charAt(0);
            if (startLetter < 'A' || startLetter > 'Z')
            {
                letterValid = false;
            }
        }

        // ---------- Fehlermeldungen ausgeben ----------
        if (!numberValid)
        {
            System.out.println("Invalid number.");
        }
        if (!letterValid)
        {
            System.out.println("Invalid symbol.");
        }

        // Wenn eine Eingabe ungültig ist → Ende
        if (!numberValid || !letterValid)
        {
            return;
        }

        // ---------- Matrix ausgeben ----------
        char currentLetter = startLetter;

        for (int row = 0; row < matrixSize; row++)
        {
            for (int column = 0; column < matrixSize; column++)
            {
                System.out.print(currentLetter);

                // Leerzeichen zwischen Buchstaben (außer am Zeilenende)
                if (column < matrixSize - 1)
                {
                    System.out.print(" ");
                }

                // Nächster Buchstabe → nach 'Z' wieder 'A'
                if (currentLetter == 'Z')
                {
                    currentLetter = 'A';
                }
                else
                {
                    currentLetter = (char) (currentLetter + 1);
                }
            }
            System.out.println(); // neue Zeile für nächste Reihe
        }
    }

    // Optionaler main() zum schnellen Testen
    public static void main(String[] args)
    {
        magicSquareMatrix();
    }
}