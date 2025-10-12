package homeworks.hm3;


import java.util.Random;
import java.util.Scanner;

public class Exercises03
{
    // Implement all methods as public static

    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }

    // Task 1 - One Month Calender
    /*Schreibe eine Methode, die einen Monatskalender auf der Konsole ausgibt.
     Parameter:
    daysInMonth – Anzahl der Tage im Monat (z. B. 30)
    firstDay    – Wochentag des 1. Tages (1=Montag … 7=Sonntag)
    Die Ausgabe soll alle Tage mit zwei Stellen und einem Leerzeichen trennen.
    Nach jedem Sonntag soll ein Zeilenumbruch erfolgen.
    Beispielausgabe für (30, 6):
                   1  2
    3  4  5  6  7  8  9
    10 11 12 13 14 15 16
    17 18 19 20 21 22 23
    24 25 26 27 28 29 30
    */

    public static void oneMonthCalendar(int daysInAMonth, int firstDayOfTheMonth) {
        //we need empty spaces before the first day....sadly have to be deduced with the help of AppTest....
        for (int i = 1; i < firstDayOfTheMonth; i++) {
            System.out.print("   ");
        }

        //all day of the month
        for (int day = 1; day <= daysInAMonth; day++) {
            if (day < 10) {
                System.out.print(" " + day + " ");
            } else {
                System.out.print(day + " ");
            }

            //after every sunday --> new line  (because 7thday)
            if ((day + firstDayOfTheMonth - 1) % 7 == 0) {
                System.out.println();
            }
        }

        //if LAST week of the MONTH doesnt end on the 7th day, sunday, ---> jump
        if ((daysInAMonth + firstDayOfTheMonth - 1) % 7 != 0) {
            System.out.println();
        }
    }


    //Task 2 - Pseudo Random Numbers
    /*
	Implementiere einen linearen Kongruenzgenerator (LCG) zur Erzeugung
	von Zufallszahlen. Verwende folgende Parameter:
		m = 2^31
		a = 1103515245
		c = 12345
	Parameter:
		seed – Startwert
	Rückgabewert:
		Ein long[]-Array mit den ersten 10 generierten Zufallszahlen.
	Formel: Xn+1 = (a * Xn + c) % m
	*/
    public static long[] lcg(long seed) {
        long[] numbers = new long[10];
        long m = (long) Math.pow(2, 31);
        long a = 1103515245;
        long c = 12345;

        long x = seed;

        for (int i = 0; i < numbers.length; i++) {
            x = (a * x + c) % m;
            numbers[i] = x;
        }

        return numbers;
    }

    // Task 3 - Guessing Game
    /*
	Schreibe ein Zahlratespiel. Die Methode erhält die gesuchte Zahl als Parameter.
	Der Benutzer hat 10 Versuche, sie zu erraten (Eingabe über Scanner).
	Nach jedem Versuch soll ausgegeben werden:
		- "The number AI picked is lower than your guess." wenn zu hoch
		- "The number AI picked is higher than your guess." wenn zu niedrig
		- "You won wisenheimer!" wenn richtig geraten
	Wenn nach 10 Versuchen kein Treffer erreicht wird:
		- "You lost! Have you ever heard of divide & conquer?"
	*/

    public static void guessingGame(int numberToGuess)
    {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;

        while (tries < 10)
        {
            tries++;
            System.out.print("Guess number " + tries + ": ");
            int guess = scanner.nextInt();

            if (guess == numberToGuess)
            {
                System.out.println("You won wisenheimer!");
                return;
            }
            else if (guess > numberToGuess)
            {
                if (tries == 10)
                {
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    return;
                }

                System.out.println("The number AI picked is lower than your guess.");
            }
            else
            {
                if (tries == 10)
                {
                    System.out.println("You lost! Have you ever heard of divide & conquer?");
                    return;
                }
                System.out.println("The number AI picked is higher than your guess.");
            }
        }

    }

    //Task 3 additional hepling method for random calling
    public static int randomNumberBetweenOneAndHundred()
    {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        return num;
    }

    //Task 4 - Swap Arrays
    /*
	Schreibe eine Methode, die die Inhalte zweier Arrays vertauscht.
	Parameter:
		a – erstes Array
		b – zweites Array
	Bedingungen:
		- Nur tauschen, wenn beide Arrays gleich lang sind.
	Rückgabewert:
		true, wenn getauscht wurde; false, wenn nicht (z. B. ungleiche Länge).
	*/

    public static boolean swapArrays(int[] first, int[] second)
    {
        if (first == null || second == null)
        {
            return false;
        }

        if (first.length != second.length)
        {
            return false;
        }

        for (int i = 0; i < first.length; i++)
        {
            int temp = first[i];
            first[i] = second[i];
            second[i] = temp;
        }
        return true;
    }

    //Task 5 - Camel Case
    /*
	Schreibe eine Methode, die einen Text in CamelCase umwandelt.
	Regeln:
		- Nur Buchstaben werden übernommen.
		- Jedes Wort beginnt mit einem Großbuchstaben, Rest klein.
		- Satzzeichen, Zahlen und Leerzeichen werden entfernt.
	Beispiel:
		Eingabe: "my name isn't Alice!"
		Ausgabe: "MyNameIsntAlice"
	*/

    public static String camelCase(String input)
    {
        String result = "";
        boolean newWord = true;

        for (int i = 0; i < input.length(); i++)
        {
            char c = input.charAt(i);

            //only letter chars count
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            {
                if (newWord)
                {
                    //makeing an uppercase in start
                    if (c >= 'a' && c <= 'z')
                    {
                        c = (char) (c - 32);
                    }
                    result = result + c;
                    newWord = false;
                }
                else
                {
                    //inner world should be lowercase
                    if (c >= 'A' && c <= 'Z')
                    {
                        c = (char) (c + 32);
                    }
                    result = result + c;
                }
            }

            else
            {
                /* Only set newWord to true for actual word separators (spaces, punctuation), but NOT for apostrophes within words.
                 Source: https://www.geeksforgeeks.org/dsa/camel-case-given-sentence/
                */

                if (c != '\'')
                {
                    newWord = true;
                }
            }
        }
        return result;
    }

    // Task 6 - Check digit
    /*
	Schreibe eine Methode zur Berechnung einer Prüfziffer.
	Parameter:
		code – Array von int-Ziffern
	Schritte:
		1. Multipliziere jedes Element mit (Index + 2).
		2. Summiere alle Produkte.
		3. Berechne sum % 11 → Rest.
		4. Prüfziffer = 11 − Rest
		5. Sonderfälle:
			Wenn Prüfziffer == 10 → 0
			Wenn Prüfziffer == 11 → 5
	Rückgabewert:
		die berechnete Prüfziffer (int)
	*/

    public static int checkDigit(int[] code)
    {
        int sum = 0;
        for (int i = 0; i < code.length; i++)
        {
            sum = sum + code[i] * (i + 2);
        }

        int rest = sum % 11;
        int result = 11 - rest;

        if (result == 10)
        {
            return 0;
        }
        else if (result == 11)
        {
            return 5;
        }
        else
        {
            return result;
        }
    }


}
