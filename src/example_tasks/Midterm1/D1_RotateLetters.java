package example_tasks.Midterm1;

/*
Aufgabe 1 (PDF D): Buchstabendreher (4 Classroom Punkte)

Schreiben Sie eine Funktion rotateLetters, welcher ein Text (String) und eine Anzahl
an Rotationen (int) übergeben werden. Buchstaben des Textes werden zyklisch nach rechts
verschoben. Groß-/Kleinschreibung sowie Leerzeichen sollen nicht beachtet werden.
Der zurückgegebene Text besteht nur aus Großbuchstaben.
Wenn Rotationen negativ -> leerer String.
*/

public class D1_RotateLetters
{
    public static String rotateLetters(String text, int rotations)
    {
        if (rotations < 0)
        {
            return "";
        }

        String upper = text.toUpperCase();
        String result = "";
        int steps = rotations % 26;

        for (int index = 0; index < upper.length(); index++)
        {
            char ch = upper.charAt(index);

            if (ch >= 'A' && ch <= 'Z')
            {
                int position = ch - 'A';
                int newPosition = position + steps;
                if (newPosition >= 26)
                {
                    newPosition = newPosition - 26;
                }
                char rotatedChar = (char) ('A' + newPosition);
                result = result + rotatedChar;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(rotateLetters("buchstabendreher", 0));
        System.out.println(rotateLetters("buchstabendreher ", 1));
        System.out.println(rotateLetters("buchstaben dreher", 5));
        System.out.println(rotateLetters("buchstabendreher", -1));
    }
}
