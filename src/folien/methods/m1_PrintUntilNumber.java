package folien.methods;

public class m1_PrintUntilNumber
{
    /**
     * AUFGABENSTELLUNG
     * - Methode printUntilNumber(int number): druckt 1..number (jeweils in neuer Zeile).
     * - In main mit verschiedenen Parametern aufrufen.
     */

    public static void printUntilNumber(int number)
    {
        for (int i = 1; i <= number; i++)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        printUntilNumber(5); // 1..5
    }

}
