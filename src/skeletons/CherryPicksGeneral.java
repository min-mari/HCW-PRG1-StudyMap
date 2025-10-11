package skeletons;
import java.util.*;
public class CherryPicksGeneral
{

    // Shared Scanner for any skeleton that needs console input.
    // (Do not close; it can break other reads or test runners.)
    public static final Scanner SC = new Scanner(System.in);

    // =========================
    // 0) Setup / main playground
    // =========================
    public static void main(String[] args)
    {
        // Uncomment what you want to try locally:

        // System.out.println(ifElseValidate(5));
        // System.out.println(readUntilZero());          // enter numbers, end with 0
        // forRepeat(5);
        // doWhileExample();

        // loopWithBreakContinue(10);
        // System.out.println(earlyReturnProcess(-1));

        // rect(3, 6, '*');
        // triangleUp(5, '*');
        // triangleDown(5, '*');
        // pyramid(5, '*');
        // chessboard(4, 6, 'X', 'O');

        // System.out.println(sumOfDigits(12345));
        // System.out.println(factorial(6));
        // System.out.println(powInt(2, 10));
        // System.out.println(isPrime(29));

        // System.out.println(mmToUnits(2127));
        // System.out.println(secondsToHMS(3661));

        // System.out.println(add(3, 7));
        // printLine(10, '-'); System.out.println();
        // System.out.println(formatMm(2127));

        // System.out.println(switchMenu(2));
        // System.out.println(printf2(3.14159));

        // System.out.println(validateAndProcess(-5));
        // System.out.println(findFirstGreaterThan100(new int[]{5, 20, 150, 3}));
        // System.out.println(Arrays.toString(countEvenOdd(new int[]{1,2,3,4,5,6})));
    }

    // ======================================
    // 1) If / Else – validation & branching
    // ======================================
    public static String ifElseValidate(int x)
    {
        if (x < 0)
        {
            return "Invalid value.";
        }
        else if (x == 0)
        {
            return "Zero.";
        }
        else
        {
            return "Positive.";
        }
    }

    // =====================================
    // 2) While – read numbers until 0 (Ø/Σ)
    // returns a summary string; adapt as needed
    // =====================================
    public static String readUntilZero()
    {
        int count = 0;
        long sum = 0;

        int v = SC.nextInt();
        while (v != 0)
        {
            if (v < 0)
            {
                // skip negatives (example behavior)
                v = SC.nextInt();
                continue;
            }
            sum += v;
            count++;
            v = SC.nextInt();
        }

        if (count == 0) return "No valid entries.";
        double avg = sum / (double) count;
        return String.format("Average: %.2f, Sum: %d, Count: %d", avg, sum, count);
    }

    // =================================
    // 3) For – fixed number of repeats
    // =================================
    public static void forRepeat(int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("i = " + i);
        }
    }

    // ==========================================
    // 4) Do-While – run at least once (demo)
    // ==========================================
    public static void doWhileExample()
    {
        int x;
        do
        {
            x = SC.nextInt();
            System.out.println("You typed: " + x);
        } while (x != 0);
    }

    // ==================================================
    // 5) break / continue inside loops (demo structure)
    // ==================================================
    public static void loopWithBreakContinue(int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (i == 2) continue;     // skip i==2
            if (i == 7) break;        // stop loop at i==7
            System.out.println("i = " + i);
        }
    }

    // ==========================================
    // 6) return – exit whole method early
    // ==========================================
    public static String earlyReturnProcess(int x)
    {
        if (x < 0) return "Invalid."; // ends the method immediately
        // more work here...
        return "OK";
    }

    // ======================
    // 7) Rectangle (rows×cols)
    // ======================
    public static void rect(int rows, int cols, char ch)
    {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++) System.out.print(ch);
            System.out.println();
        }
    }

    // ==============================
    // 8) Left-aligned ascending tri
    // ==============================
    public static void triangleUp(int h, char ch)
    {
        for (int r = 1; r <= h; r++)
        {
            for (int c = 1; c <= r; c++) System.out.print(ch);
            System.out.println();
        }
    }

    // ================================
    // 9) Inverted (descending) triangle
    // ================================
    public static void triangleDown(int h, char ch)
    {
        for (int r = h; r >= 1; r--)
        {
            for (int c = 1; c <= r; c++) System.out.print(ch);
            System.out.println();
        }
    }

    // ==========================================
    // 10) Symmetric pyramid (with leading spaces)
    // ==========================================
    public static void pyramid(int h, char ch)
    {
        for (int r = 0; r < h; r++)
        {
            for (int s = 0; s < h - r - 1; s++) System.out.print(' ');
            for (int k = 0; k < 2 * r + 1; k++) System.out.print(ch);
            System.out.println();
        }
    }

    // ===================================
    // 11) Chessboard / alternating chars
    // ===================================
    public static void chessboard(int rows, int cols, char a, char b)
    {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++)
            {
                System.out.print(((r + c) % 2 == 0) ? a : b);
            }
            System.out.println();
        }
    }

    // ========================
    // 12) Sum of digits (Σdigits)
    // ========================
    public static int sumOfDigits(int n)
    {
        int x = Math.abs(n),
                sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    // ===============
    // 13) Factorial n!
    // ===============
    public static long factorial(int n)
    {
        long f = 1L;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    // ==========================================
    // 14) Integer power (no Math.pow, exp>=0)
    // ==========================================
    public static long powInt(int base, int exp)
    {
        long p = 1L;
        for (int i = 0; i < exp; i++) p *= base;
        return p;
    }

    // ======================
    // 15) Simple prime check
    // ======================
    public static boolean isPrime(int n)
    {
        if (n < 2) return false;
        for (int d = 2; d * d <= n; d++)
        {
            if (n % d == 0) return false;
        }
        return true;
    }

    // ==================================================
    // 16) Convert mm → "m: <m>, cm: <cm>, mm: <mmRest>"
    // ==================================================
    public static String mmToUnits(int mm)
    {
        if (mm < 0) return "Invalid value.";
        int m = mm / 1000;
        int rest = mm % 1000;
        int cm = rest / 10;
        int mmRest = rest % 10;
        return "m: " + m + ", cm: " + cm + ", mm: " + mmRest;
    }

    // ================================
    // 17) Seconds → "hh:mm:ss" string
    // ================================
    public static String secondsToHMS(int sec)
    {
        if (sec < 0) return "Invalid value.";
        int h = sec / 3600;
        int r1 = sec % 3600;
        int m = r1 / 60;
        int s = r1 % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

    // =========================
    // 18) Method with return
    // =========================
    public static int add(int a, int b)
    {
        return a + b;
    }

    // ============================
    // 19) Void method (just print)
    // ============================
    public static void printLine(int n, char ch)
    {
        for (int i = 0; i < n; i++) System.out.print(ch);
    }

    // ==================================================
    // 20) Guard clause pattern (early return formatting)
    // ==================================================
    public static String formatMm(int mm)
    {
        if (mm < 0) return "Invalid value.";
        int m = mm / 1000, rest = mm % 1000, cm = rest / 10, mmR = rest % 10;
        return "m: " + m + ", cm: " + cm + ", mm: " + mmR;
    }

    // ==========================
    // 21) Simple switch "menu"
    // ==========================
    public static String switchMenu(int choice)
    {
        switch (choice) {
            case 1:
                return "Option 1";
            case 2:
                return "Option 2";
            default:
                return "Invalid choice.";
        }
    }

    // ==========================================
    // 22) printf 2 decimal places (returns text)
    // ==========================================
    public static String printf2(double val)
    {
        return String.format("%.2f", val);
    }

    // ===================================================
    // 23) Validate & skip (continue-like pattern inline)
    // ===================================================
    public static String validateAndProcess(int x)
    {
        if (x < 0) return "Invalid."; // mimic continue by not processing
        // do work...
        return "Processed " + x;
    }

    // ======================================================
    // 24) Find first element > 100; return index or -1
    // ======================================================
    public static int findFirstGreaterThan100(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) return i;  // break + return pattern
        }
        return -1;
    }

    // ==============================================
    // 25) Count even/odd numbers in an int array
    // returns [even, odd]
    // ==============================================
    public static int[] countEvenOdd(int[] arr)
    {
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0) even++;
            else odd++;
        }
        return new int[]{even, odd};
    }
}

