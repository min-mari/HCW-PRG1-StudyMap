package example_tasks;
import java.util.*;
import java.util.Locale;

/*
Aufgabe RND4 – Rabattrechner

a) Schreiben Sie eine Methode double getDiscount(int price), die zu einem gegebenen
   Kaufpreis den Rabattfaktor (0.0 / 0.1 / 0.15 / 0.2) zurückliefert:
   - unter 500 € -> 0.0
   - 500–999 €   -> 0.1
   - 1000–1999 € -> 0.15
   - ab 2000 €   -> 0.2

b) Schreiben Sie eine Methode calculateDiscount(), die den Preis (int, Euro)
   von der Konsole einliest und dann Kaufpreis, Rabatt und Endpreis ausgibt.
   - Endpreis mit 2 Nachkommastellen.
   - Bei Preis <= 0 oder Preis >= 6000 -> "Fehler" ausgeben.
   - Ausgabeformat:
        Preis: 1200
        Kaufpreis: 1200€
        Rabatt: 15%
        Endpreis: 1020.00€
*/

public class RND4_DiscountCalculator
{
    public static double getDiscount(int price)
    {
        if (price < 500)
        {
            return 0.0;
        }
        else if (price <= 999)
        {
            return 0.1;
        }
        else if (price <= 1999)
        {
            return 0.15;
        }
        else
        {
            return 0.2;
        }
    }

    public static void calculateDiscount()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preis: ");
        int price = scanner.nextInt();

        // ungültige Werte abfangen
        if (price <= 0 || price >= 6000)
        {
            System.out.println("Fehler");
            return;
        }

        double discountFactor = getDiscount(price);
        int percent = (int) Math.round(discountFactor * 100);
        double finalPrice = price * (1.0 - discountFactor);

        System.out.println("Kaufpreis: " + price + "€");
        System.out.println("Rabatt: " + percent + "%");
        System.out.printf(Locale.US, "Endpreis: %.2f€%n", finalPrice);
    }

    public static void main(String[] args)
    {
        calculateDiscount();
    }
}