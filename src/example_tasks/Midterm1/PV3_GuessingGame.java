package example_tasks.Midterm1;
/**
 * ÜBUNG 5 — Der Zahlenraten-Meister
 *
 * Schreibe guessingGame(int numberRange, int attempts):
 *  - Der Computer wählt eine Zufallszahl zwischen 1 und numberRange (inklusive).
 *  - Der Benutzer hat höchstens 'attempts' Versuche, die Zahl zu erraten.
 *  - Zu Beginn: Begrüßungsnachricht.
 *  - Bei korrekt geraten: Erfolgsnachricht und Spielende (vorzeitig).
 *  - Sonst: Hinweis "zu hoch" oder "zu niedrig".
 *  - Nach Ende (erraten ODER maximale Versuche erreicht): Ausgabe ob gewonnen/verl.
 *
 * Implementationsdetails (noob-freundlich):
 *  - Wir nutzen Math.random() und casten auf int: (int)(Math.random()*range)+1 → [1..range]
 *  - Einfache while/for-Schleife mit Zähler für die Versuche.
 */

import java.util.Scanner;
//import.java.until.Random; //if we do a Method for the random num
public class PV3_GuessingGame
{
    public static void guessingGame(int numberRange, int attempts)
    {
        Scanner sc = new Scanner(System.in);
/*        Random rnd = new Random();

        // Zufallszahl zwischen 1 und numberRange
        int secretNumber = rnd.nextInt(numberRange) + 1;*/  //if we choose to do the random number with method
        int secretNumber = (int)(Math.random() * numberRange) + 1; // 1..numberRange
        boolean won = false;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I chose a number between 1 and " + numberRange + ".");
        System.out.println("You have " + attempts + " attempts. Good luck!");

        for (int i = 1; i <= attempts; i++)
        {
            System.out.print("Attempt " + i + "/" + attempts + " - Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == secretNumber)
            {
                System.out.println("Correct! You guessed the number!");
                won = true;
                break; // Spiel beenden (vorzeitig)
            } else if (guess < secretNumber)
            {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        if (won)
        {
            System.out.println("You WIN!");
        }
        else
        {
            System.out.println("You LOSE! The number was: " + secretNumber);
        }
    }

    public static void main(String[] args)
    {
        guessingGame(50, 5);
    }
}
