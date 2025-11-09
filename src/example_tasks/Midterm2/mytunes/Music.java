package example_tasks.Midterm2.mytunes;
/*
=========================================================
FH Campus Wien – Programmieren 1
Assignment: MyTunes (Music Management Program)
=========================================================

Allgemeine Beschreibung der Aufgabe:
------------------------------------
Ihre Aufgabe ist es, ein Verwaltungsprogramm "MyTunes" für Musiktitel zu entwickeln.
Die Benutzer*innen sollen Musiktitel erfassen und auf verschiedene Arten auflisten und auswerten können.
Die Bedienung des Programmes "MyTunes" erfolgt über die Kommandozeile.

---------------------------------------------------------
Aufgabe 1 (1 Punkt)
---------------------------------------------------------
Definieren Sie eine Klasse Music im Package ac.at.fhcampuswien und implementieren Sie dazu einen Konstruktor, der die folgende Signatur hat:

    public Music(String title, int secondsLength, String artist, String genre)

Definieren Sie die privaten Instanzvariablen title, secondsLength, artist, genre
mit den Typen wie sie im Konstruktor angegeben sind.
Implementieren Sie für jede Instanzvariable X eine öffentliche getX()-Methode.

---------------------------------------------------------
Aufgabe 2 (2 Punkte)
---------------------------------------------------------
a) Implementieren Sie die folgende Methode der Music-Klasse:

    public String toString()

Das Ergebnis soll folgende Form haben:
    <artist>: <title> - <genre> - <min:sec>
Beispiel: "Michael Jackson: Thriller - Pop - 05:57"

b) Implementieren Sie die folgende statische Methode der Music-Klasse:

    public static String formatMusicLength(int seconds)

Die übergebenen Sekunden werden im Format <min:sec> zurückgegeben.
Sowohl <min> als auch <sec> sind zweistellig mit führenden Nullen auszugeben.

Beispiele:
    formatMusicLength(20)   -> "00:20"
    formatMusicLength(2340) -> "39:00"
    formatMusicLength(2142) -> "35:42"

---------------------------------------------------------
Aufgabe 3 (1 Punkt)
---------------------------------------------------------
Definieren Sie eine Klasse MyTunes im Package ac.at.fhcampuswien.
Der Zweck der Klasse ist das Speichern von mehreren Music-Objekten
in einer privaten Instanzvariablen der MyTunes-Klasse (z.B. Music[]).

Implementieren Sie einen Konstruktor mit der Signatur:

    public MyTunes(int capacity)

Der Parameter capacity gibt die maximale Anzahl der Music-Objekte an,
die das MyTunes-Objekt speichern kann.

---------------------------------------------------------
Aufgabe 4 (3 Punkte)
---------------------------------------------------------
Implementieren Sie folgende Methode der Klasse MyTunes:

    public boolean addPiece(Music m)

Es wird true zurückgegeben, wenn das Music-Objekt gespeichert wurde.
Die Methode gibt false zurück, wenn:
- das übergebene Objekt null ist, oder
- das Objekt wegen Erreichen der Kapazität nicht gespeichert werden konnte.

---------------------------------------------------------
Aufgabe 5 (3 Punkte)
---------------------------------------------------------
Implementieren Sie folgende Methode der Klasse MyTunes:

    public Music[] getAllPieces()

Diese Methode gibt alle gespeicherten Music-Objekte zurück
oder ein leeres Array, wenn noch nichts gespeichert wurde.
Das zurückgegebene Array darf keine null-Objekte enthalten.

---------------------------------------------------------
Aufgabe 6 (3 Punkte)
---------------------------------------------------------
Implementieren Sie folgende Methode der Klasse MyTunes:

    public int getTotalMusicLength()

Diese Methode berechnet die gesamte Dauer aller gespeicherten Songs in Sekunden (0, wenn nichts gespeichert wurde).

---------------------------------------------------------
Aufgabe 7 (3 Punkte)
---------------------------------------------------------
Implementieren Sie folgende Methode der Klasse MyTunes:

    public Music[] getPieces(String artist)

Diese Methode gibt alle Songs eines bestimmten Künstlers als Array zurück.
Das Array darf leer sein, wenn kein Song gefunden wurde.

---------------------------------------------------------
Aufgabe 8 (4 Punkte)
---------------------------------------------------------
Implementieren Sie in der Klasse ac.at.fhcampuswien.App die Methode:

    public static void run(int capacity, Scanner scanner)

Diese Methode steuert das gesamte Programm über die Kommandozeile.
Sie erstellt ein MyTunes-Objekt mit der Kapazität capacity und ermöglicht folgende Kommandos:

    1: insert      -> fügt neue Musik hinzu (siehe Aufgabe 4)
    2: list        -> listet alle Stücke (siehe Aufgabe 5)
    3: artist-list -> listet Stücke eines Künstlers (siehe Aufgabe 7)
    4: total-length-> zeigt Gesamtdauer aller Stücke im Format min:sec
    5: exit        -> beendet das Programm

Beispielhafte Konsolenausgabe:
------------------------------
>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 1
enter artist: Michael Jackson
enter title: Thriller
enter length(sec): 357
enter genre: Pop
music inserted: Michael Jackson: Thriller - Pop - 05:57

>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 1
enter artist: Josh
enter title: Martina
enter length(sec): 218
enter genre: Pop
music inserted: Josh: Martina - Pop - 03:38

>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 1
error: no space left for new pieces.

>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 2
list of all pieces:
Michael Jackson: Thriller - Pop - 05:57
Josh: Martina - Pop - 03:38

>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 3
enter artist: Josh
list of pieces by Josh:
Josh: Martina - Pop - 03:38

>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 4
total length of all pieces: 09:35 min

>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 8
error: invalid command.

>mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): 5
bye.
=========================================================
*/

public class Music
{
    private String title;
    private int secondsLength;
    private String artist;
    private String genre;

    // Konstruktor entsprechend der Aufgabenstellung
    public Music(String title, int secondsLength, String artist, String genre)
    {
        this.title = title;
        this.secondsLength = secondsLength;
        this.artist = artist;
        this.genre = genre;
    }

    // Getter-Methoden
    public String getTitle()
    {
        return title;
    }

    public int getSecondsLength()
    {
        return secondsLength;
    }

    public String getArtist()
    {
        return artist;
    }

    public String getGenre()
    {
        return genre;
    }

    // Aufgabe 2a: Ausgabe in der geforderten Form
    @Override
    public String toString()
    {
        return artist + ": " + title + " - " + genre + " - " + formatMusicLength(secondsLength);
    }

    // Aufgabe 2b: statische Hilfsmethode zur Formatierung der Länge
    public static String formatMusicLength(int seconds)
    {
        if (seconds < 0)
        {
            seconds = 0; // defensiv, damit nichts Negatives formatiert wird
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        // Zweistellig mit führenden Nullen
        return String.format("%02d:%02d", minutes, remainingSeconds);
    }
}
