package folien.methods;
import java.util.Scanner;
public class m3_IsEvenDemo
{
    /**
     * AUFGABENSTELLUNG
     * - Implementiere isEven(int): true, wenn Zahl gerade.
     * - Lies eine Zahl und gib "even"/"odd" aus, indem du isEven nutzt.
     */

    public static boolean isEven(int number)
    {
        return number % 2 == 0; // Kurzform wie in den Folien
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isEven(n) ? "even" : "odd");
    }

}
