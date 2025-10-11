package folien.methods;
import java.util.Scanner;
public class m4_CoimposeMethods
{
    /**
     * AUFGABENSTELLUNG
     * - getNumberFromUser(): liest int, isEven(int): parity-check.
     * - In main: boolean isNumberEven = isEven(getNumberFromUser()); dann Text ausgeben.
     */


    public static int getNumberFromUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }

    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public static void main(String[] args)
    {
        boolean isNumberEven = isEven(getNumberFromUser());
        if (isNumberEven) System.out.println("the given number is even.");
        else System.out.println("the given number is odd.");
    }

}
