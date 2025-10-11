package beispieleAusarbeitungen;

/**
 * AUFGABENSTELLUNG (Midterm 2020 D – Task 1)
 * lengthUnitConverter(int mm):
 *   - Für mm < 0 → gib exakt "Invalid value." zurück.
 *   - Zerlege mm in m, cm, mmRest mit Ganzzahldivision und Modulo:
 *       m = mm / 1000;
 *       rest = mm % 1000;
 *       cm = rest / 10;
 *       mmRest = rest % 10;
 *   - Rückgabestring GENAU:
 *       "m: <m>, cm: <cm>, mm: <mmRest>"
 */
public class D1_LengthAndUnitConverter
{

    public static String lengthUnitConverter(int mm)
    {
        if (mm < 0) return "Invalid value.";    // Vorgabe-Fehlermeldung

        int m = mm / 1000;                      // ganze Meter
        int rest = mm % 1000;                   // Rest unter 1000 mm
        int cm = rest / 10;                     // ganze Zentimeter
        int mmRest = rest % 10;                 // restliche Millimeter

        return "m: " + m + ", cm: " + cm + ", mm: " + mmRest;
    }

    // Runnable test
    public static void main(String[] args)
    {
        System.out.println(lengthUnitConverter(2127)); // m: 2, cm: 12, mm: 7
    }
}