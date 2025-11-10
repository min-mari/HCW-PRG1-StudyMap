package skeletons.general;
import java.util.*;

public class CherryPicsAbridged
{
    // Shared scanner (don’t close it in test setups)
    public static final Scanner SC = new Scanner(System.in);

    // =========================
    // main sandbox
    // =========================
    public static void main(String[] args)
    {
        // try these if you want:
        // trapExample();
        // int age = readIntInRange("Enter age (0–120): ", 0, 120);
        // System.out.println("Your age = " + age);
    }

    // ======================================================
    // 1) Scanner trap demo: nextInt() leaves a newline
    //
    // The newline remains in the buffer; if you call nextLine()
    // immediately after nextInt(), you’ll read that leftover newline.
    // Fix: consume the rest of that line first.
    // ======================================================
    public static void trapExample()
    {
        System.out.print("Enter a number: ");
        int n = SC.nextInt();      // reads the int, leaves '\n'
        SC.nextLine();             // flush newline out of buffer

        System.out.print("Enter a word (string): ");
        String word = SC.nextLine();  // now reads proper input
        System.out.println("n=" + n + ", word=" + word);
    }

    // =======================================================
    // 2) Repeat-until-valid input (typical validation pattern)
    //
    //  - prints a prompt
    //  - re-prompts if input not in valid range or not an int
    //  - consumes invalid tokens so Scanner doesn’t loop forever
    // =======================================================
    public static int readIntInRange(String prompt, int min, int max)
    {
        int value;
        while (true)
        {
            System.out.print(prompt);
            if (SC.hasNextInt())
            {
                value = SC.nextInt();
                if (value >= min && value <= max)
                {
                    SC.nextLine(); // clean newline
                    return value;
                }
                else
                {
                    System.out.println("Invalid input (out of range).");
                }
            }
            else
            {
                System.out.println("Invalid input (not a number).");
                SC.next(); // discard invalid token
            }
            SC.nextLine(); // clear rest of line before retry
        }
    }

    // ======================================================
    // 3) Minimal test-day core skeletons again for reference
    // ======================================================

    public static String readUntilZeroSummary()
    {
        long sum = 0;
        int count = 0;
        int v = SC.nextInt();
        while (v != 0)
        {
            if (v < 0)
            {
                v = SC.nextInt();
                continue;
            }
            sum += v;
            count++;
            v = SC.nextInt();
        }
        if (count == 0) return "No valid entries.";
        double avg = sum / (double) count;
        return String.format("Average: %.2f | Sum: %d | Count: %d", avg, sum, count);
    }

    public static String guardExample(int x)
    {
        if (x < 0) return "Invalid.";
        return "OK";
    }

    public static void breakContinueDemo(int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (i == 2) continue;
            if (i == 7) break;
            System.out.println("i = " + i);
        }
    }

    public static void rect(int rows, int cols, char ch)
    {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++) System.out.print(ch);
            System.out.println();
        }
    }

    public static void triUp(int h, char ch)
    {
        for (int r = 1; r <= h; r++)
        {
            for (int c = 1; c <= r; c++) System.out.print(ch);
            System.out.println();
        }
    }

    public static void pyramid(int h, char ch)
    {
        for (int r = 0; r < h; r++)
        {
            for (int s = 0; s < h - r - 1; s++) System.out.print(' ');
            for (int k = 0; k < 2 * r + 1; k++) System.out.print(ch);
            System.out.println();
        }
    }

    public static int sumDigits(int n)
    {
        int x = Math.abs(n), s = 0;
        while (x > 0)
        {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public static long fact(int n)
    {
        long f = 1L;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static String mmToUnits(int mm)
    {
        if (mm < 0) return "Invalid value.";
        int m = mm / 1000, rest = mm % 1000, cm = rest / 10, mmR = rest % 10;
        return "m: " + m + ", cm: " + cm + ", mm: " + mmR;
    }

    public static String secToHMS(int sec)
    {
        if (sec < 0) return "Invalid value.";
        int h = sec / 3600, r1 = sec % 3600, m = r1 / 60, s = r1 % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    public static int firstGreaterThan100(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) if (arr[i] > 100) return i;
        return -1;
    }

    public static int[] countEvenOdd(int[] arr)
    {
        int even = 0, odd = 0;
        for (int x : arr)
            if (x % 2 == 0) even++;
            else odd++;
        return new int[]{even, odd};
    }

}
