package example_tasks.Midterm1;
import java.util.*;

/*
Aufgabe 2 (PDF D): Sum Up (6 Classroom Punkte)

Schreiben Sie eine Methode sumUp, die von der Konsole zwei ganze Zahlen n1 und n2 einliest
und die Summe aller ganzen Zahlen von n1 bis n2 (inklusiv) ausgibt.
Wenn n1 oder n2 (oder beide) <= 0 -> entsprechende Meldung wie im Beispiel.
Wenn beide > 0, aber n2 < n1 -> Fehlermeldung.
Keine Übergabeparameter und kein Rückgabewert.
*/

public class D2_SumUp
{
    public static void sumUp()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n1:  ");
        int n1 = scanner.nextInt();

        System.out.print("n2:  ");
        int n2 = scanner.nextInt();

        boolean n1Invalid = n1 <= 0;
        boolean n2Invalid = n2 <= 0;

        if (n1Invalid && n2Invalid)
        {
            System.out.println("n1 and n2 must be > 0.");
            return;
        }
        if (n1Invalid)
        {
            System.out.println("n1 must be > 0.");
            return;
        }
        if (n2Invalid)
        {
            System.out.println("n2 must be > 0.");
            return;
        }
        if (n2 < n1)
        {
            System.out.println("n2 must be > n1.");
            return;
        }

        int sum = 0;
        int current = n1;
        while (current <= n2)
        {
            sum = sum + current;
            current = current + 1;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args)
    {
        sumUp();
    }
}
