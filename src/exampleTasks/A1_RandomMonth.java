package exampleTasks;
import java.util.Random;

/**
 * AUFGABENSTELLUNG (Midterm 2021 A – Task 1)
 * generateRandomMonth():
 *   - Erzeuge eine zufällige ganze Zahl im Bereich 1..12 (inklusive).
 *   - Gib diesen Wert zurück (repräsentiert einen Monat).
 *   - Tipp: Random.nextInt(12) → 0..11, daher +1 für 1..12.
 */
public class A1_RandomMonth
{
    public static int generateRandomMonth()
    {
        Random rnd = new Random();
        return rnd.nextInt(12) + 1;  // 1..12
    }
    public static void main(String[] args) {
        System.out.println(generateRandomMonth());
    }
}