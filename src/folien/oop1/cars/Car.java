package folien.oop1.cars;
/*Exercise
Define a Car class.
Cars have a brand, a year of permit (Zulassung), a type of engine and a speed.
Write at least two constructors.
Write getter and setter function for your class properties.
Write a function honk that writes “{brand}: beep beep!” to the console and returns nothing.
Write a function isElectric that returns true if the Car object has electric engine and false if anything else.
Create another Class with a main method; create Car objects and call their methods.
Write a method accelerate that enhances the speed of the Car object by 10 and returns the new speed value.
Write a function brake that decreases the speed of the Car object by 10. and returns the new speed value.
Overload accelerate method to let the client set the acceleration increment.
Same for brake method.*/
public class Car
{
    private String brand;
    private int yearOfPermit;
    private String typeOfEngine;
    private int speed;

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public int getYearOfPermit()
    {
        return yearOfPermit;
    }

    public void setYearOfPermit(int yearOfPermit)
    {
        this.yearOfPermit = yearOfPermit;
    }

    public String getTypeOfEngine()
    {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine)
    {
        this.typeOfEngine = typeOfEngine;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }


    public Car(String brand, int yearOfPermit, String typeOfEngine, int speed)
    {
        this.brand = brand;
        this.yearOfPermit = yearOfPermit;
        this.typeOfEngine = typeOfEngine;
        this.speed = speed;
    }
    public Car()
    {
        this("Unknown", 0, "Unknown", 0);
    }


    public void honk()
    {
        System.out.println(this.brand + " : beep beep!");

    }

    public boolean isElectric()
    {
        return typeOfEngine.equalsIgnoreCase("Electric");
    }

    public int accelerate() //default no values
    {
        int oldSpeed = speed;
        speed += 10;
        System.out.println(brand + " accelerated from " + oldSpeed + " km/h to " + speed + " km/h.");
        return speed;
    }

    public int accelerate(int increment) //overloaded option with user-entered increments
    {
        int oldSpeed = speed;
        speed += increment;
        System.out.println(brand + " accelerated from " + oldSpeed + " km/h to " + speed + " km/h.");
        return speed;
    }

    public int brake() //default no values
    {
        int oldSpeed = speed;
        speed -= 40;
        if (speed < 0) speed = 0;
        System.out.println(brand + " braking from " + oldSpeed + " km/h to " + speed + " km/h.");
        return speed;
    }

    public int brake(int decrement) //overloaded option with user-entered increments
    {
        int oldSpeed = speed;
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println(brand + " braking from " + oldSpeed + " km/h to " + speed + " km/h.");
        return speed;
    }

}
