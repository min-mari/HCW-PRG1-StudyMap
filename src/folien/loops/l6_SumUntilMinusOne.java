package folien.loops;
import java.util.Scanner;
public class l6_SumUntilMinusOne
{
    /**
     * AUFGABENSTELLUNG
     * - Lies Zahlen und addiere sie, bis -1 eingegeben wird. Dann Summe ausgeben.
     */

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) // Endlosschleife mit break
        {
            int number = scan.nextInt();
            if (number == -1) break;
            sum += number;
        }
        System.out.println("sum is " + sum);
    }

}
