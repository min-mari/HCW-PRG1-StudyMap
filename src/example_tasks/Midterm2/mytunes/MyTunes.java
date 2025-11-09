package example_tasks.Midterm2.mytunes;

public class MyTunes
{
    private Music[] pieces;
    private int size; // number of stored Music objects

    // Aufgabe 3: Konstruktor mit Kapazität
    public MyTunes(int capacity)
    {
        if (capacity < 0)
        {
            capacity = 0;
        }
        this.pieces = new Music[capacity];
        this.size = 0;
    }

    // Aufgabe 4: Musikstück hinzufügen
    public boolean addPiece(Music m)
    {
        if (m == null)
        {
            return false;
        }

        if (size >= pieces.length)
        {
            return false;
        }

        pieces[size] = m;
        size++;
        return true;
    }

    // Aufgabe 5: alle gespeicherten Stücke zurückgeben (ohne nulls)
    public Music[] getAllPieces()
    {
        if (size == 0)
        {
            return new Music[0];
        }

        Music[] result = new Music[size];
        for (int i = 0; i < size; i++)
        {
            result[i] = pieces[i];
        }
        return result;
    }

    // Aufgabe 6: Gesamtlänge aller Stücke in Sekunden
    public int getTotalMusicLength()
    {
        int total = 0;
        for (int i = 0; i < size; i++)
        {
            total += pieces[i].getSecondsLength();
        }
        return total;
    }

    // Aufgabe 7: alle Stücke eines bestimmten Künstlers
    public Music[] getPieces(String artist)
    {
        if (artist == null || size == 0)
        {
            return new Music[0];
        }

        // zuerst Anzahl der Treffer zählen
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (artist.equals(pieces[i].getArtist()))
            {
                count++;
            }
        }

        if (count == 0)
        {
            return new Music[0];
        }

        // dann Array mit passender Größe erzeugen
        Music[] result = new Music[count];
        int index = 0;
        for (int i = 0; i < size; i++)
        {
            if (artist.equals(pieces[i].getArtist()))
            {
                result[index] = pieces[i];
                index++;
            }
        }

        return result;
    }
}
