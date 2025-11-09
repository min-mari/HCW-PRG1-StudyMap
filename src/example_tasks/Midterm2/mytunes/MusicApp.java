package example_tasks.Midterm2.mytunes;
import java.util.Scanner;
public class MusicApp
{
    // Aufgabe 8
    public static void run(int capacity, Scanner scanner)
    {
        MyTunes myTunes = new MyTunes(capacity);

        while (true)
        {
            System.out.print(">mytunes: enter command(1:insert, 2:list, 3:artist-list, 4:total-length, 5:exit): ");
            String commandLine = scanner.nextLine();
            int command = Integer.parseInt(commandLine);

            if (command == 1)
            {
                // insert
                System.out.print("enter artist: ");
                String artist = scanner.nextLine();

                System.out.print("enter title: ");
                String title = scanner.nextLine();

                System.out.print("enter length(sec): ");
                String lengthLine = scanner.nextLine();
                int secondsLength = Integer.parseInt(lengthLine);

                System.out.print("enter genre: ");
                String genre = scanner.nextLine();

                Music m = new Music(title, secondsLength, artist, genre);
                boolean inserted = myTunes.addPiece(m);

                if (inserted)
                {
                    System.out.println("music inserted: " + m.toString());
                }
                else
                {
                    System.out.println("error: no space left for new pieces.");
                }
            }
            else if (command == 2)
            {
                // list all pieces
                System.out.println("list of all pieces:");
                Music[] all = myTunes.getAllPieces();
                for (int i = 0; i < all.length; i++)
                {
                    System.out.println(all[i].toString());
                }
            }
            else if (command == 3)
            {
                // list by artist
                System.out.print("enter artist: ");
                String artist = scanner.nextLine();

                System.out.println("list of pieces by " + artist + ":");
                Music[] byArtist = myTunes.getPieces(artist);
                for (int i = 0; i < byArtist.length; i++)
                {
                    System.out.println(byArtist[i].toString());
                }
            }
            else if (command == 4)
            {
                // total length
                int totalSeconds = myTunes.getTotalMusicLength();
                String formatted = Music.formatMusicLength(totalSeconds);
                System.out.println("total length of all pieces: " + formatted + " min");
            }
            else if (command == 5)
            {
                // exit
                System.out.println("bye.");
                break;
            }
            else
            {
                // invalid command
                System.out.println("error: invalid command.");
            }


        }

    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        MusicApp.run(2, scanner); // capacity = 2 for example
    }
}

