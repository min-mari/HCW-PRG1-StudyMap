package homeworks.hm4;

public class Task4
{
    /*
------------------------------------------------------------
AUFGABE 4 – PARKING GARAGE
------------------------------------------------------------
Schreiben Sie ein Programm, das ein einfaches Parkhaus simuliert.

Das Parkhaus besteht aus mehreren Parkplätzen, auf denen Autos
geparkt werden können. Jedes Auto hat ein Kennzeichen und eine Farbe.

Implementieren Sie dazu folgende Klassen:

1) Car
   - Attribute:
       • licensePlate (String)
       • color (String)
   - Konstruktor, Getter und eine toString()-Methode

2) ParkingSpot
   - Attribute:
       • spotNumber (int)
       • car (Car)
   - Konstruktor, Methoden:
       • isFree() → true, wenn kein Auto geparkt ist
       • parkCar(Car c)
       • removeCar()
       • getCar()
       • toString() → „Spot X: free“ oder „Spot X: Car AB-123CD (red)“

3) ParkingGarage
   - Attribute:
       • name (String)
       • spots (Array von ParkingSpot)
   - Konstruktor:
       • Parameter: Name, Kapazität
       • Initialisiert das Array mit Parkplätzen 1…capacity
   - Methoden:
       • parkCar(Car c) → sucht den ersten freien Platz, parkt Auto
       • removeCar(String licensePlate) → entfernt Auto mit diesem Kennzeichen
       • showGarage() → gibt alle Parkplätze auf der Konsole aus

4) App (main)
   - Menü zur Interaktion über Konsole:
       1: Park a new car
       2: Remove a car
       3: Show garage
       4: Exit

Beispielausgabe:
----------------------------------
--- Menu ---
1: Park a new car
2: Remove a car
3: Show garage
4: Exit
Choice: 1
License plate: W-123XY
Color: red
Car parked: Car W-123XY (red)
----------------------------------

Hinweise:
- Verwenden Sie sinnvolle Methodennamen.
- Nutzen Sie Scanner für Benutzereingaben.
- Prüfen Sie auf belegte Plätze, bevor ein Auto geparkt wird.
- Das Array soll die maximale Kapazität des Parkhauses darstellen.
------------------------------------------------------------
*/

}
