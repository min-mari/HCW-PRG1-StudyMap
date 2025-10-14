package skeletons;

/**
 * HCW – PROGRAMMIEREN 1 (MIDTERM 1)
 * Study Map / Cheat Sheet (EIGENE AUSARBEITUNG!!!!! MIT QUELLEN!!!!)
 * <p>
 * Inhalt: Alles was im 1. Midterm vorkommen kann.
 * (Kontrollstrukturen, Schleifen, Methoden, Input/Output)
 * <p>
 * Tipp:
 * - Alles ist kommentiert, du kannst in IntelliJ suchen (Ctrl+F)
 * - Links zu Quellen sind im Code als Kommentar angegeben
 * - Keine Arrays, keine OOP, kein Interface/Inheritance hier!
 * <p>
 * Quellen:
 * - https://www.geeksforgeeks.org/
 * - https://www.w3schools.com/java/
 * - https://docs.oracle.com/javase/
 */

import java.util.Scanner;
import java.util.Random;

public class StudyMap {

    public static void main(String[] args)
    {
        System.out.println("== OPEN-BOOK STUDY GUIDE – MIDTERM 1 ==");
    }

    // ───────────────────────────────────────────────────────────────
    // 1. EINGABE / AUSGABE (SCANNER / PRINT)
    // ───────────────────────────────────────────────────────────────

    /*
     * Wichtigste Scanner-Methoden:
     *  - nextInt(), nextDouble(), nextLine(), next() → verschiedene Typen lesen
     *  - .trim() entfernt Leerzeichen
     *  - Scanner NICHT schließen (verhindert weitere Eingaben)
     *
     * Beispiele:
     *
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter your age: ");
     * int age = sc.nextInt();
     * System.out.println("You are " + age + " years old.");
     *
     * 📚 Quellen:
     *  - https://www.geeksforgeeks.org/scanner-class-in-java/
     *  - https://www.w3schools.com/java/java_user_input.asp
     */

    // ───────────────────────────────────────────────────────────────
    // 2. IF / ELSE / SWITCH (Kontrollstrukturen)
    // ───────────────────────────────────────────────────────────────

    /*
     * if / else:
     *  if (x > 0)
     * {
     *      System.out.println("positive");
     *  }
     * else if (x < 0)
     * {
     *      System.out.println("negative");
     *  }
     * else
     * {
     *      System.out.println("zero");
     *  }
     *
     * switch:
     * switch (grade)
     * {
     *      case 'A': System.out.println("Excellent"); break;
     *      case 'B': System.out.println("Good"); break;
     *      case 'C': System.out.println("Satisfactory"); break;
     *      default:  System.out.println("Invalid grade");
     *  }
     *
     * 📚 Quellen:
     *  - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
     *  - https://www.geeksforgeeks.org/switch-statement-in-java/
     */

    // ───────────────────────────────────────────────────────────────
    // 3. SCHLEIFEN (for / while / do-while)
    // ───────────────────────────────────────────────────────────────

    /*
     * for-Schleife:
     *  for (int i = 0; i < 5; i++)
     * {
     *      System.out.println("i = " + i);
     *  }
     *
     * while-Schleife:
     *  int count = 1;
     *  while (count <= 3)
     * {
     *      System.out.println(count);
     *      count++;
     *  }
     *
     * do-while-Schleife:
     *  int input;
     *  do
     * {
     *      input = sc.nextInt();
     *  }
     * while (input != 0);
     *
     * break → Schleife abbrechen
     * continue → nächsten Durchlauf überspringen
     *
     * 📚 Quellen:
     *  - https://www.geeksforgeeks.org/loops-in-java/
     *  - https://www.programiz.com/java-programming/nested-loop
     */

    // ───────────────────────────────────────────────────────────────
    // 4. METHODEN
    // ───────────────────────────────────────────────────────────────

    /*
    /*
    * 🔹 Methoden mit `void` → führen eine Aktion aus, deren Effekt „verbraucht“ ist.
    *   Beispiel: Text ausgeben, Datei schreiben, etwas anzeigen.
    *   → Das Ergebnis wird NICHT ans Programm zurückgegeben.
    *
    * 🔹 Methoden mit Rückgabewert (`int`, `double`, `boolean`, `String`, …) →
    *   liefern einen Wert, der weiterverwendet oder gespeichert werden kann.
    *   → Damit kann das Programm weiterrechnen, vergleichen, prüfen usw.
    *
    * 💡 Denkstütze:
    *   - void = „mach was“
    *   - return-Typ = „gib mir was“
     * Syntax:
     *  public static <returnType> <name>(<parameter>...)
     * {
     *      // code
     *      return <value>; // wenn returnType != void
     * }
     *
     * Beispiel:
     *  public static int add(int a, int b)
     * {
     *      return a + b;
     * }
     *
     * Aufruf:
     *  int sum = add(3, 4);
     *
     * 📚 Quellen:
     *  - https://www.w3schools.com/java/java_methods.asp
     *  - https://www.geeksforgeeks.org/methods-in-java/
     */

    // ───────────────────────────────────────────────────────────────
    // 5. MATHEMATISCHE AUFGABEN
    // ───────────────────────────────────────────────────────────────

    /*
     * Kreisfläche / Umfang:
     *  double r = 3.5;
     *  double area = Math.PI * r * r;
     *  double circumference = 2 * Math.PI * r;
     *
     * Hypotenuse:
     *  double c = Math.sqrt(a*a + b*b);
     *
     * Zufallszahlen:
     *  Random rnd = new Random();
     *  int month = rnd.nextInt(12) + 1; // 1..12 +1 notwendig, da sonst von 0 bis 11 gezählt wird    *
     * Prozent & Durchschnitt:
     *  double avg = sum / count;
     *
     * 📚 Quellen:
     *  - https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
     *  - https://www.geeksforgeeks.org/random-class-java/
     */

    // ───────────────────────────────────────────────────────────────
    // 6. STRING / ZEICHENKETTEN LOGIK
    // ───────────────────────────────────────────────────────────────

    /*
     * Zeichen prüfen:
     *  Character.isDigit(ch);
     *  Character.isLetter(ch);
     *
     * Länge & Vergleich:
     *  str.length();
     *  str.equals("abc");
     *  str.equalsIgnoreCase("abc");
     *  str.trim(); // entfernt Leerzeichen außen
     *
     * Einzelzeichen holen:
     *  char c = str.charAt(0);
     *
     * 📚 Quellen:
     *  - https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
     *  - https://www.geeksforgeeks.org/java-string-class-methods/
     */

    // ───────────────────────────────────────────────────────────────
    // 7. HÄUFIGE AUFGABENTYPEN (aus Midterm & Übungen)
    // ───────────────────────────────────────────────────────────────

    /*
     * - Zufallsmonat generieren (1..12)
     * - Eingabevalidierung ("r" oder Zahl 1..12)
     * - Versandkosten berechnen (if / switch)
     * - Muster aus Sternchen (print/println)
     * - Maximum oder Summe finden bis Eingabe ≤ 0
     * - Zahlen vergleichen / sortieren
     * - Eingabe > 0 fordern, sonst „Invalid“
     * - Durchschnitt / Count / Sum berechnen
     */

    // ───────────────────────────────────────────────────────────────
    //  8. HÄUFIGE PRÜFUNGSFORMULIERUNGEN (gleiche Bedeutung)
    // ───────────────────────────────────────────────────────────────

    /*
     * "Lesen Sie Zahlen bis ..."      → while-Schleife mit Abbruchbedingung
     * "Berechnen Sie ..."             → einfache Formel + Ausgabe
     * "Schreiben Sie eine Methode..." → public static + Parameter
     * "Verwenden Sie keine Arrays"    → nur Variablen & Schleifen
     * "Wiederholen Sie ..."           → for- oder while-Schleife
     * "Formatieren Sie Ausgabe..."    → String.format() / printf()
     * "Überprüfen Sie Eingabe..."     → if / do-while
     * "Zufällige Zahl ..."            → Random.nextInt() + 1
     * "Solange gültig..."             → do-while oder while mit Flag
     * "Wert darf nicht negativ sein"  → if (x < 0) → „Invalid value.“
     * "Bis 0 eingegeben wird"         → while(true) + break
     * "Bis korrekte Eingabe erfolgt"  → do-while Schleife
     * "Formatierte Ausgabe"           → printf("%.2f%n", value)
     * "Zeilenweise Ausgabe"           → println in Schleife
     * "Zeichenweise Ausgabe"          → print in innerer Schleife
     */

    // ───────────────────────────────────────────────────────────────
    // 9. HÄUFIGE FEHLERQUELLEN
    // ───────────────────────────────────────────────────────────────

    /*
     * - println statt print → falsche Form bei Mustern
     * - nextLine() nach nextInt() → Zeilensprungproblem
     * - vergessenes break im switch
     * - falsche Initialisierung von sum/max/count
     * - Scanner schließen (nicht erlaubt!)
     * - return in void-Methode
     * - falscher Datentyp (int statt double)
     * - if (flag = true) statt if (flag == true)
     */

    // ───────────────────────────────────────────────────────────────
    // 10. QUICK REFERENCE – FORMATIERUNG & RANDOM
    // ───────────────────────────────────────────────────────────────

    /*
     * String.format("%.2f", value)     → 2 Nachkommastellen
     * System.out.printf("%.0f%n", val) → ohne Nachkommastellen
     *
     * Random:
     *  Random r = new Random();
     *  int x = r.nextInt(10) + 1; → 1..10
     *
     * Math.random():
     *  int n = (int)(Math.random()*10) + 1; → 1..10
     *
     * 📚 Quellen:
     *  - https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
     *  - https://www.w3schools.com/java/java_math.asp
     */
}