package homeworks.EX2;

import java.util.Scanner;

public class Exercises02 {

    //todo Task 1
    public void largestNumber()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1: ");
        double inputNumber = scanner.nextDouble();


        if (inputNumber <= 0)
        {
            System.out.println("No number entered.");
            return;
        }

        double maxNum = inputNumber;
        int count = 2;

        while (true)
        {
            System.out.print("Number " + count + ": ");
            inputNumber = scanner.nextDouble();

            if (inputNumber <= 0)
            {
                break;
            }

            if (inputNumber > maxNum)
            {
                maxNum = inputNumber;
            }

            count++;
        }

        //Code für String output und .format aus google und schlussendlich aus gemini genommen, da ich mich sonst nicht ausgekannt habe
        String output = String.format("%.2f", maxNum);
        System.out.println("The largest number is " + output);
    }

    //todo Task 2
    public void stairs()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");

        int n = scanner.nextInt();

        if (n <= 0)
        {
            System.out.println("Invalid number!");
            return;
        }

        int tempCount = 1;

        for (int row = 1; row <= n; row++)
        {
            for (int column = 1; column <= row; column++)
            {
                System.out.print(tempCount++ + " ");
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid()
    {

        int rows = 6;
        int starCounter = 0;

        for (int currentRow = 1; currentRow <= rows; ++currentRow, starCounter = 0)
        {
            for (int spacing = 1; spacing <= rows - currentRow; ++spacing)
            {
                System.out.print(" ");
            }

            while (starCounter != 2 * currentRow - 1)
            {
                System.out.print("*");
                ++starCounter;
            }

            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        int height = scanner.nextInt();

        System.out.print("c: ");
        char middleChar = scanner.next().charAt(0);

        //Höhe muss 0 sein wenn /2 = ungerade
        if (height % 2 == 0)
        {
            System.out.println("Invalid number!");
            return;
        }

        int half = height / 2;  //bestimmen wieviel Zeilen unter oder ober der  Mitte...

        //Top und Mitte
        for (int row = 0; row <= half; row++)
        {
            //Spacing vor der row von Buchstaber
            for (int spacing = 0; spacing < half - row; spacing++)
            {
                System.out.print(" ");
            }

            //Buchtaben symmetrisch
            for (int offset = -row; offset <= row; offset++)
            {
                char currentChar = (char)(middleChar - Math.abs(offset));
                System.out.print(currentChar);
            }

            System.out.println();
        }

        //bottom ohne mitte (da bei TOP) (symmetrisch)

        for (int row = half - 1; row >= 0; row--) {
            for (int spacing = 0; spacing < half - row; spacing++)
            {
                System.out.print(" ");
            }

            for (int offset = -row; offset <= row; offset++)
            {
                //char currentChar = (char)(middleChar - Math.abs(offset)); mit hilfe von https://stackoverflow.com/questions/21653677/calculating-character-values-in-java-given-an-initial-character-and-an-offset
                char currentChar = (char)(middleChar - Math.abs(offset));

                System.out.print(currentChar);
            }

            System.out.println();
        }
    }

    //todo Task 5
    public void marks()
    {
        Scanner scanner = new Scanner(System.in);

        int gradeIndex = 1;
        int numberOfValidGrades = 0;
        int numberOfFails = 0;
        int sumOfGrades = 0;

        while (true)
        {
            System.out.print("Mark " + gradeIndex + ": ");
            int enteredGrade = scanner.nextInt();


            if (enteredGrade == 0)
            {
                //Durchschnitt (nicht = 0)
                double average;

                if (numberOfValidGrades == 0)
                {
                    average = 0.0;
                }

                else
                {
                    average = (double) sumOfGrades / numberOfValidGrades;
                }

                //string.format von task 1 genommen
                String averageAsText = String.format("%.2f", average);

                System.out.println("Average: " + averageAsText);
                System.out.println("Negative marks: " + numberOfFails);
                return;
            }

            // Ungültig + Error Message
            if (enteredGrade < 1 || enteredGrade > 5)
            {
                System.out.println("Invalid mark!");
                continue;
            }

            // Gültig - nehmen
            sumOfGrades += enteredGrade;
            numberOfValidGrades++;

            if (enteredGrade == 5)
            {
                numberOfFails++;
            }

            gradeIndex++; //zu nächste Note gehen
        }
    }

    //todo Task 6
    public void happyNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");

        int originalNumber;
        originalNumber = scanner.nextInt();
        int currentValue = originalNumber;

        //wenn der current Value nicht 1 oder 4 → WEITER
        while (currentValue != 1 && currentValue != 4)
        {
            currentValue = sumOfSquaresOfDigits(currentValue);
        }

        //Ergebnise nachprüfen
        if (currentValue == 1)
        {
            System.out.println("Happy number!");
        }

        if (currentValue == 4) {
            System.out.println("Sad number!");
        }
    }

    // quadrierte Ziffernsummen berechnen, hier habe ich mir Hilfe geholt von Geeksforgeeks: https://www.geeksforgeeks.org/dsa/happy-numbers/
    private int sumOfSquaresOfDigits(int value) {
        int sumOfSquares = 0;

        while (value > 0)
        {
            //letztes Ziffer holen
            int lastDigit = value % 10;

            //quadrieren
            int square = lastDigit * lastDigit;
            sumOfSquares = sumOfSquares + square;

            //letztes Ziffer wegschneiden
            value = value / 10;
        }

        return sumOfSquares;
    }

    public static void main(String[] args){
        Exercises02 exercise2 = new Exercises02();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}