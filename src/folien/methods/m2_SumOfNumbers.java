package folien.methods;

public class m2_SumOfNumbers
{
    /**
     * AUFGABENSTELLUNG
     * - Methode sumOfNumbers(start, end): gib die Summe aller ints von start bis end zurück.
     * - In main testen und Ergebnis ausgeben.
     */

    public static int sumOfNumbers(int start, int end)
    {
        int sum = 0;
        for (int i = start; i <= end; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int sum = sumOfNumbers(2, 4); // 2+3+4 = 9
        System.out.println(sum);
    }

}
