package folien.datatypes_operators_controlstructures;
import java.util.Scanner;
public class d4_TinyCalculatorSwitch
{
    /**
     * AUFGABENSTELLUNG
     * - Lese zwei int (x,y) und einen Operator (+,-,*,/).
     * - Berechne gemäß Operator das Ergebnis, sonst "invalid operator".
     */

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char op = sc.next().charAt(0);

        switch (op)
        {
            case '+': System.out.println(x + y); break;
            case '-': System.out.println(x - y); break;
            case '*': System.out.println(x * y); break;
            case '/':
                if (y == 0) System.out.println("Error: can't divide by zero");
                else        System.out.println(x / y);
                break;
                default:  System.out.println("invalid operator passed!");
        }
    }
}
