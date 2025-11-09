package example_tasks.Midterm1;

public class RND5_FloatCompareExample
{
    public static void main(String[] args)
    {
        double a = 0.1 + 0.2;
        double b = 0.3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Direkter Vergleich (==): " + (a == b));

        //Rundung eps - verhindert rundungsfehler
        final double eps = 1e-9; // Epsilon: kleiner Toleranzwert für float & double-Vergleiche
        boolean equalWithEps = Math.abs(a - b) < eps;

        System.out.println("Vergleich: " + equalWithEps);
    }

}
