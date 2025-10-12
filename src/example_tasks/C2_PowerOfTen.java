package example_tasks;

/*
Aufgabe 2 (PDF C): Zehnerpotenz (5 Classroom Punkte)

Schreiben Sie eine Funktion powerOfTen, welche eine maximal dreistellige ganze Zahl
als Parameter übergeben bekommt und die Zerlegung der Zahl in Zehnerpotenzen aufzeigt.
Ist die Zahl negativ -> "Zahl darf nicht negativ sein."
Ist die Zahl größer als dreistellig -> "Zahl darf nur eine maximal dreistellige Zahl sein."
Kein Rückgabewert, nur Konsolenausgabe.
*/

public class C2_PowerOfTen
{
    public static void powerOfTen(int number)
    {
        if (number < 0)
        {
            System.out.println("Zahl darf nicht negativ sein.");
            return;
        }
        if (number > 999)
        {
            System.out.println("Zahl darf nur eine maximal dreistellige Zahl sein.");
            return;
        }

        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;

        String expression = "";
        boolean hasPart = false;

        if (hundreds > 0)
        {
            expression = expression + hundreds + " * 100";
            hasPart = true;
        }

        if (tens > 0)
        {
            if (hasPart)
            {
                expression = expression + " + ";
            }
            expression = expression + tens + " * 10";
            hasPart = true;
        }

        if (ones > 0 || number == 0)
        {
            if (hasPart)
            {
                expression = expression + " + ";
            }
            expression = expression + ones + " * 1";
        }

        System.out.println(number + " = " + expression);
    }

    public static void main(String[] args)
    {
        powerOfTen(-12);
        powerOfTen(1223);
        powerOfTen(4);
        powerOfTen(16);
        powerOfTen(638);
        powerOfTen(0);
    }
}
