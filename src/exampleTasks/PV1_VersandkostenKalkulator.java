package exampleTasks;
/**
 * ÜBUNG 1 — Versandkosten-Kalkulator
 *
 * Schreibe eine Methode calculateShippingCosts(double weight, char zone),
 * die das Gewicht (in kg) und die Zone ('A','B','C') erhält und die Versandkosten
 * als double zurückliefert.
 *
 * Regeln (aus der Folie):
 * - Es gibt Basispreise pro Zone (Konstanten in der Hauptklasse).
 * - Zone A: Basispreis. Wenn weight > 10 kg → 20% Zuschlag auf den Basispreis.
 * - Zone B: Basispreis. Wenn weight > 50 kg → fixer Zuschlag von 15.00 €.
 * - Zone C: nur Basispreis, KEINE Zuschläge.
 * - Ungültige Zone → gib eine Fehlermeldung aus und return 0.0.
 *
 * Hinweis aus der Folie: In main verschiedene Beispiele aufrufen und
 * „ohne Kommastellen“ ausgeben → dafür benutzen wir printf mit %.0f.
 */
public class PV1_VersandkostenKalkulator
{
    private static final double BASE_ZONE_A = 5.0;
    private static final double BASE_ZONE_B = 10.0;
    private static final double BASE_ZONE_C = 15.0;

    public static double calculateShippingCosts (double weight, char zone)
    {
        char z = Character.toUpperCase(zone); // für vergleichbare Zone-Eingaben: Großbuchstaben vereinheitlichen

        switch (z)
        {
            case 'A':
            {
                double price = BASE_ZONE_A;
                if (weight > 10.0)
                {
                    double percentageOfPrice = price * 0.2;
                    price = price + percentageOfPrice;
                }
                return price;
            }
            case 'B':
            {
                double price = BASE_ZONE_B;
                if (weight > 50.0)
                {
                    double percentageOfPrice = price * 0.15;
                    price = price + percentageOfPrice;
                }
                return price;
            }
            case 'C':
            {
                return BASE_ZONE_C; //da keine Zuschläge as per Aufgabenstellung
            }
            default:
                System.out.println("Invalid Zone: " + zone);
                return 0.0;

        }
    }
    public static void main(String[] args) {


        double a = calculateShippingCosts(2.0,  'A');   // unter 10kg → nur Basispreis A
//        double b = calculateShippingCosts(60.0, 'B');   // über 50kg → +15€
//        double c = calculateShippingCosts(12.0, 'A');   // über 10kg → +20%
//        double d = calculateShippingCosts(8.0,  'C');   // C ohne Zuschläge
//        double e = calculateShippingCosts(3.0,  'D');   // ungültig

        // „ohne Kommastellen“ ausgeben (%.0f)
        System.out.printf("A: %.0f%n", a);
//        System.out.printf("B: %.0f%n", b);
//        System.out.printf("C: %.0f%n", c);
//        System.out.printf("D: %.0f%n", d);
//        System.out.printf("Invalid: %.0f%n", e);
    }

}
