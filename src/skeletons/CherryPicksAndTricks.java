package skeletons;
import java.util.*;
public class CherryPicksAndTricks
{
        // ======================
        // main sandbox (optional)
        // ======================
        public static void main(String[] args)
        {
            // leave empty or use local tests here if you want
            // (interactive methods create their own Scanner)
        }

        // ================
        // TYPE 1 – read until 0, compute summary
        // ================
        public static String solveType1_ReadUntilZeroSummary()
        {
            Scanner sc = new Scanner(System.in);
            long sum = 0; int count = 0;
            int v = sc.nextInt();
            while (v != 0)
            {
                if (v >= 0)
                {
                    sum += v; count++; // adjust if negatives should count
                }
                v = sc.nextInt();
            }
            if (count == 0) return "No valid entries.";
            double avg = sum / (double) count;
            return String.format("Average: %.2f | Sum: %d | Count: %d", avg, sum, count);
        }

        // =========================
        // TYPE 2 – compare up to N decimals (epsilon)
        // =========================
        public static boolean solveType2_CompareDecimals(double a, double b, int decimals)
        {
            double eps = Math.pow(10, -decimals);    // 3 -> 0.001
            return Math.abs(a - b) < eps;            // strict < unless spec says <=
        }

        // ===========================
        // TYPE 3 – order of three ints (1 asc, -1 desc, 0 none)
        // ===========================
        public static int solveType3_OrderOfThree(int n1, int n2, int n3)
        {
            if (n1 < n2 && n2 < n3) return 1;
            if (n1 > n2 && n2 > n3) return -1;
            return 0;
        }

        // =========================================
        // TYPE 4 – unit conversions / decompositions
        // (A) mm -> "m: x, cm: y, mm: z"
        // =========================================
        public static String solveType4_mmToUnits(int mm)
        {
            if (mm < 0) return "Invalid value.";
            int m = mm / 1000, rest = mm % 1000, cm = rest / 10, mmR = rest % 10;
            return "m: " + m + ", cm: " + cm + ", mm: " + mmR;
        }
        // (B) seconds -> "hh:mm:ss"
        public static String solveType4_SecToHMS(int sec)
        {
            if (sec < 0) return "Invalid value.";
            int h = sec / 3600, r1 = sec % 3600, m = r1 / 60, s = r1 % 60;
            return String.format("%02d:%02d:%02d", h, m, s);
        }

    // ===========================
    // TYPE 5 – pattern printing
    // ===========================
    public static void solveType5_Rect(int rows, int cols, char ch)
    {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++)
                System.out.print(ch);
            System.out.println();
        }
    }

    public static void solveType5_TriUp(int h, char ch)
    {
        for (int r = 1; r <= h; r++)
        {
            for (int c = 1; c <= r; c++)
                System.out.print(ch);
            System.out.println();
        }
    }

    public static void solveType5_TriDown(int h, char ch)
    {
        for (int r = h; r >= 1; r--)
        {
            for (int c = 1; c <= r; c++)
                System.out.print(ch);
            System.out.println();
        }
    }

    public static void solveType5_Pyramid(int h, char ch)
    {
        for (int r = 0; r < h; r++)
        {
            for (int s = 0; s < h - r - 1; s++) System.out.print(' ');
            for (int k = 0; k < 2 * r + 1; k++) System.out.print(ch);
            System.out.println();
        }
    }

    public static void solveType5_Chessboard(int rows, int cols, char a, char b) {
        for (int r = 0; r < rows; r++)
        {
            for (int c = 0; c < cols; c++) System.out.print(((r + c) % 2 == 0) ? a : b);
            System.out.println();
        }
    }

    // ===================================================
    // TYPE 6 – 1-based position + name storage in String[]
    // interactive: P (position), N (name); 0 to end
    // ===================================================
    public static String[] solveType6_1BasedInsertNames(int max)
    {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[max];
        System.out.println("Verwaltbare Positionen: " + max);
        System.out.print("P: ");
        int pos = sc.nextInt();
        while (pos != 0) {
            if (pos < 1 || pos > max)
            {
                System.out.println("Ungueltige Position eingegeben");
            }
            else
            {
                int idx = pos - 1;
                if (a[idx] != null)
                {
                    System.out.println("Speicherstelle bereits belegt");
                }
                else
                {
                    System.out.print("N: ");
                    sc.nextLine();            // consume leftover newline
                    a[idx] = sc.nextLine();   // actual name
                }
            }
            System.out.print("P: ");
            pos = sc.nextInt();
        }
        return a;
    }

    // ==========================================================
    // TYPE 7 – create array; fill; if 0 → fill rest with filler
    // ==========================================================
    public static int[] solveType7_FillArrayUntilZeroSetRest(int filler, int length) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
        {
            int v = sc.nextInt();
            if (v == 0)
            {
                for (int j = i; j < length; j++) arr[j] = filler;
                break;
            }
            else
            {
                arr[i] = v;
            }
        }
        return arr;
    }

    // =================================================================
    // TYPE 8 – print multiplication table and collect even products
    // (parameters only; no scanning here)
    // =================================================================
    public static int[] solveType8_TableCollectEven(int number, int rows) {
        if (number < 1 || rows < 1)
        {
            System.out.println("Invalid input");
            return null;
        }
        int[] ev = new int[0];
        for (int i = 0; i < rows; i++)
        {
            int p = number * i;
            System.out.println(number + " * " + i + " = " + p);
            if (p % 2 == 0)
            {
                int[] t = new int[ev.length + 1];
                for (int k = 0; k < ev.length; k++) t[k] = ev[k];
                t[ev.length] = p;
                ev = t;
            }
        }
        return ev;
    }

    // ======================================================
    // TYPE 9 – count strings starting with prefix (case-sensitive)
    // ======================================================
    public static int solveType9_CountStartsWith(String[] arr, String prefix) {
        int cnt = 0;
        for (String s : arr)
            if (s != null && s.startsWith(prefix)) cnt++;
        return cnt;
    }

    // ============================================================
    // TYPE 10 – min & max with variants: [], [x], or [max,min]
    // ============================================================
    public static int[] solveType10_MinMaxVariant(int[] arr)
    {
        if (arr == null || arr.length == 0) return null;
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        return (min == max) ? new int[]{max} : new int[]{max, min};   // match spec order
    }

    // ===================================================
    // TYPE 11 – fairy lights: only r/g/b; repeat until filled
    // ===================================================
    public static char[] solveType11_FairyLights(int length)
    {
        Scanner sc = new Scanner(System.in);
        char[] lights = new char[length];
        for (int i = 0; i < length; i++)
        {
            System.out.println("Choose a light color (r,g,b):");
            String in = sc.nextLine();
            if (in.length() == 1)
            {
                char c = in.charAt(0);
                if (c == 'r' || c == 'g' || c == 'b')
                {
                    lights[i] = c;
                    continue;
                }
            }
            System.out.println("Invalid input");
            i--; // re-ask same position
        }
        return lights;
    }

    // ==========================================================
    // TYPE 12 – extend/weave arrays depending on lengths
    // ==========================================================
    public static int[] solveType12_ExtendWeave(int[] A, int[] B)
    {
        int la = A.length, lb = B.length;
        int[] R = new int[la + lb];
        int k = 0;
        if (la > lb)
        {
            for (int x : B) R[k++] = x;
            for (int x : A) R[k++] = x;
        }
        else if (la < lb)
        {
            for (int x : A) R[k++] = x;
            for (int x : B) R[k++] = x;
        }
        else
        {
            for (int i = 0; i < la; i++) {
                R[k++] = B[i];
                R[k++] = A[i];
            }
        }
        return R;
    }

    // ==========================================
    // TYPE 13 – math utilities (sum/fact/pow/prime)
    // ==========================================
    public static int solveType13_SumDigits(int n)
    {
        int s = 0, x = Math.abs(n);
        while (x > 0)
        {
            s += x % 10;
            x /= 10;
        }
        return s;
    }

    public static long solveType13_Factorial(int n)
    {
        long f = 1L;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static long solveType13_PowInt(int base, int exp)
    {
        long p = 1L;
        for (int i = 0; i < exp; i++) p *= base;
        return p;
    }

    public static boolean solveType13_IsPrime(int n)
    {
        if (n < 2) return false;
        for (int d = 2; d * d <= n; d++) if (n % d == 0) return false;
        return true;
    }

    // ===================================================
    // TYPE 14 – exact prompts "Number1:" "Number2:" "Number3:"
    // returns 1/-1/0 (same logic as Type 3), but with exact I/O
    // ===================================================
    public static int solveType14_PromptExact()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number1:");
        int a = sc.nextInt();
        System.out.print("Number2:");
        int b = sc.nextInt();
        System.out.print("Number3:");
        int c = sc.nextInt();
        if (a < b && b < c) return 1;
        if (a > b && b > c) return -1;
        return 0;
    }

    // ===================================================
    // TYPE 15 – nextInt/nextLine trap (demo safe pattern)
    // returns the string read after consuming newline
    // ===================================================
    public static String solveType15_NextIntNextLineTrap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // leaves '\n' in buffer
        sc.nextLine();        // consume it
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        return "n=" + n + ", line=" + line;
    }

}
