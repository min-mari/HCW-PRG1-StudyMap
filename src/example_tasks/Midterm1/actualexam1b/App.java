package example_tasks.Midterm1.actualexam1b;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {

    }

    //Aufgabe 1 Generation
    //Name:
    //Year:
    //System.out.println(name + " is " + generation);
    private static final int CURRENT_YEAR = 2025; //CONSTANTE!!!

    public static void checkGeneration()
    {
        Scanner sc = new Scanner(System.in);
        //Quelle: https://www.geeksforgeeks.org/java/scanner-uselocale-method-in-java-with-examples/ und https://www.w3schools.com/java/java_try_catch.asp

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Year of Birth: ");
        //da hier werde ich try-catch da ich sonst durcheinander gekomemn bin und 1 stunde nur auf diesen task gesessen. Quelle: https://www.geeksforgeeks.org/java/java-try-catch-block/

        int year;
        try
        {
            String line = sc.nextLine();
            year = Integer.parseInt(line.trim());
        }

        catch (Exception e)
        {
            System.out.println("Error: year is less than 1946");
            return;
        }

        if (year < 1946)
        {
            System.out.println("Error: year is less than 1946");
            return;
        }
        if (year > CURRENT_YEAR)
        {
            System.out.println("Error: year is in the future");
            return;
        }

        String generation ="";

        if (year <= 1964)
        {
            generation = "Baby Boomer";
        }
        else if (year <= 1980)
        {
            generation = "Generation X";
        }
        else if (year <= 1996)
        {
            generation = "Millenial";
        }
        else if (year <= 2012)
        {
            generation = "Zoomer";
        }
        else
        {
            generation = "Generation Alpha";
        }

        System.out.println(name + " is " + generation);
    }

    //Aufgabe 2 Triangels // NICHT vergessen floats! -1
    public static int getTriangleType(float a, float b, float c)
    {
        if (a <= 0 || b <= 0 || c <= 0)
        {
            return -1; //Quelle da vergessen: https://www.scaler.com/topics/return-statement-in-java/
        }

        final double eps = 1e-6; //0.000001

        if (Math.abs(a - b) < eps && Math.abs(b - c) < eps)
        {
            return 1; //gleichs.
        }

        double aa = a * a;
        double bb = b * b;
        double cc = c * c;

        if (Math.abs(aa + bb - cc) < eps
                || Math.abs(aa + cc - bb) < eps
                || Math.abs(bb + cc - aa) < eps)
        {
            return 0; //rechtw.
        }

        //Quelle für MathAbs.: https://programmers.io/blog/absolute-value-abs-in-java/#:~:text=abs()%20method%20in%20Java,Understanding%20how%20to%20use%20Math.
        if (Math.abs(a - b) < eps || Math.abs(a - c) < eps || Math.abs(b - c) < eps)
        {
            return 2; //gleichw.
        }

        return 3; //anders als oben
    }


    public static void checkTriangles()
    {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("a: ");
            float a = Float.parseFloat(sc.nextLine().trim()); //Quelle: https://www.geeksforgeeks.org/java/float-parsefloat-method-in-java-with-examples/

            System.out.print("b: ");
            float b = Float.parseFloat(sc.nextLine().trim());

            System.out.print("c: ");
            float c = Float.parseFloat(sc.nextLine().trim());

            if (a <= 0 || b <= 0 || c <= 0) //Eine oder mehrere ... = oder oder oder
            {
                System.out.println("Done");
                break;
            }

            int type = getTriangleType(a, b, c);
            System.out.println("Typ: " + type);
        }
    }
}
