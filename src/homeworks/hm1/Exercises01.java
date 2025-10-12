package homeworks.hm1;
import java.util.Scanner;

public class Exercises01
{

    //todo Task 1
    public void sayHelloWorld(){

        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char letter = 'Z';
        int hexadezimal = 0xface;
        int octal = 012;
        long longNum = 80L;
        float float1 = 44e-1f;
        float float2 = 5.5f;
        double double1 = 8.88e1;
        double double2 = 99.9;

        int sum = 0;

        sum += letter;
        sum += hexadezimal;
        sum += octal;
        sum += (int) longNum;
        sum += (int) float1;
        sum += (int) float2;
        sum += (int) double1;
        sum += (int) double2;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        x = x + y; //x=5+2 =7
        y = x - y; //y=7-2 = 5
        x = x - y; //x=7-5 = 2

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = input.nextInt();
        System.out.print("n2: ");
        int n2 = input.nextInt();

        if (n1 > n2)
        {
            System.out.println("n1 > n2");
        }

        else if (n2 > n1)
        {
            System.out.println("n2 > n1");
        }

        else
        {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");

        int revenue = input.nextInt();

        if (revenue < 0 || revenue >= 100000)
        {
            System.out.println("Invalid Revenue");

        }

        else if (revenue < 20000)
        {
            System.out.println("Poor Sales Revenue");

        }

        else if (revenue < 50000)
        {
            System.out.println("Average Sales Revenue");

        }

        else if (revenue < 80000)
        {
            System.out.println("Good Sales Revenue");
        }

        else
        {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");
        int commissionClass = input.nextInt();
        double commissionRate;

        switch (commissionClass)
        {
            case 1:
                commissionRate = 0.01;
                break;
            case 2:
                commissionRate = 0.02;
                break;
            case 3:
                commissionRate = 0.03;
                break;
            case 4:
                commissionRate = 0.04;
                break;
            default:
                commissionRate = 0.0;
                break;
        }

        System.out.println("Your Commission Rate was set to " + commissionRate);
    }

    //todo Task 9
    public void leapyear(){
        Scanner input = new Scanner(System.in);

        System.out.print("Year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("Leapyear");
        }

        else
        {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    //Task 10 muss man auf 3-Stellige Nummer angehen...ich habe das nicht berücksichtigt.
    public void transposedNumbers(){
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");


        int num = input.nextInt();
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;
        int reversed = ones * 100 + tens * 10 + hundreds;
        System.out.println(reversed);
    }


    public static void main(String[] args){
        Exercises01 exercise1 = new Exercises01();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}