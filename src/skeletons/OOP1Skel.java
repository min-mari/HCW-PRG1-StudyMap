package skeletons;

/*
===============================================
🧠 UNIVERSAL OOP1 SKELETON (StudyMap Blueprint)
===============================================
Verwendung: als Startpunkt für beliebige Aufgaben,
die mehrere Klassen, Beziehungen und Methoden verlangen.

🎯 Ziel:
- Schnell Struktur tippen
- TODOs gezielt ergänzen
- Keine Zeit verlieren mit Syntax

💡 Enthält:
1️⃣ Entity / Model Class
2️⃣ Container / Manager Class
3️⃣ Application / CLI main()
===============================================
*/

public class OOP1Skel
{
    /*
    ======================================================
    1️⃣ ENTITY / MODEL CLASS
    ------------------------------------------------------
    Repräsentiert ein einzelnes Objekt (z.B. Car, Book, Product)
    Enthält:
        • Attribute (Instanzvariablen)
        • Konstruktor
        • Getter (+ evtl. Setter)
        • toString()
    ======================================================
    */
    public static class Entity
    {
        // ===============================
        // 1) FELDER
        // -------------------------------
        // TODO: Attribute aus Angabe übernehmen
        private String id;
        private String name;
        private int value;

        // ===============================
        // 2) KONSTRUKTOR
        // -------------------------------
        // TODO: Reihenfolge wie Angabe!
        public Entity(String id, String name, int value)
        {
            this.id = id;
            this.name = name;
            this.value = value;
        }

        // ===============================
        // 3) GETTER (und evtl. SETTER)
        // -------------------------------
        public String getId()
        {
            return id;
        }

        public String getName()
        {
            return name;
        }

        public int getValue()
        {
            return value;
        }

        // ===============================
        // 4) toString()
        // -------------------------------
        // TODO: Format aus Angabe übernehmen!
        @Override
        public String toString()
        {
            return name + " (" + id + ") - " + value;
        }
    }


    /*
    ======================================================
    2️⃣ CONTAINER / MANAGER CLASS
    ------------------------------------------------------
    Verwaltet mehrere Entities:
        • Array oder ArrayList
        • Methoden zum Hinzufügen, Suchen, Entfernen, Anzeigen
    ======================================================
    */
    public static class Manager
    {
        // ===============================
        // 1) FELDER
        // -------------------------------
        // TODO: Name, Kapazität, Array/ArrayList
        private String name;
        private Entity[] entities;

        // ===============================
        // 2) KONSTRUKTOR
        // -------------------------------
        public Manager(String name, int capacity)
        {
            this.name = name;
            this.entities = new Entity[capacity];
        }

        // ===============================
        // 3) ADD METHOD
        // -------------------------------
        // TODO: prüfen auf freien Platz, dann einfügen
        public boolean add(Entity e)
        {
            for (int i = 0; i < entities.length; i++)
            {
                if (entities[i] == null)
                {
                    entities[i] = e;
                    return true;
                }
            }
            return false; // kein Platz frei
        }

        // ===============================
        // 4) REMOVE METHOD
        // -------------------------------
        public boolean removeById(String id)
        {
            for (int i = 0; i < entities.length; i++)
            {
                if (entities[i] != null && entities[i].getId().equals(id))
                {
                    entities[i] = null;
                    return true;
                }
            }
            return false;
        }

        // ===============================
        // 5) SEARCH METHOD
        // -------------------------------
        public Entity findById(String id)
        {
            for (Entity e : entities)
            {
                if (e != null && e.getId().equals(id))
                {
                    return e;
                }
            }
            return null;
        }

        // ===============================
        // 6) DISPLAY METHOD
        // -------------------------------
        public void showAll()
        {
            System.out.println("Manager: " + name);
            for (Entity e : entities)
            {
                if (e != null)
                {
                    System.out.println(e);
                }
                else
                {
                    System.out.println("(empty)");
                }
            }
        }

        // ===============================
        // 7) GETTER
        // -------------------------------
        public String getName()
        {
            return name;
        }

        public int getSize()
        {
            return entities.length;
        }
    }


    /*
    ======================================================
    3️⃣ APPLICATION / CLI MAIN
    ------------------------------------------------------
    Verwaltet Interaktion (Scanner, Menü, Schleifen)
    ======================================================
    */
    public static class App
    {
        public static void main(String[] args)
        {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            Manager manager = new Manager("DemoManager", 3);
            boolean running = true;

            while (running)
            {
                System.out.println();
                System.out.println("--- MENU ---");
                System.out.println("1: Add Entity");
                System.out.println("2: Remove Entity");
                System.out.println("3: Show All");
                System.out.println("4: Exit");
                System.out.print("Choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // buffer clear

                if (choice == 1)
                {
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Value: ");
                    int value = scanner.nextInt();
                    scanner.nextLine();

                    Entity e = new Entity(id, name, value);
                    if (manager.add(e))
                    {
                        System.out.println("Added: " + e);
                    }
                    else
                    {
                        System.out.println("No space left!");
                    }
                }
                else if (choice == 2)
                {
                    System.out.print("ID to remove: ");
                    String id = scanner.nextLine();
                    if (manager.removeById(id))
                    {
                        System.out.println("Removed.");
                    }
                    else
                    {
                        System.out.println("Not found.");
                    }
                }
                else if (choice == 3)
                {
                    manager.showAll();
                }
                else if (choice == 4)
                {
                    running = false;
                    System.out.println("Goodbye!");
                }
                else
                {
                    System.out.println("Invalid choice!");
                }
            }
        }
    }
}

/*Optionale Methoden:
public int countFreeSlots()
{
    int count = 0;
    for (Entity e : entities)
    {
        if (e == null)
        {
            count++;
        }
    }
    return count;
}

// Alternative Collection:
private java.util.ArrayList<Entity> list = new java.util.ArrayList<>();

// Hinzufügen:
list.add(e);

// Entfernen:
list.removeIf(x -> x.getId().equals(id));*/
