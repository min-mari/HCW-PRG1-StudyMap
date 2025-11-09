package homeworks.hm4;

public class Car
{

    private String licensePlate;
    private String color;

    public String getColor()
    {
        return color;
    }

    public String getLicensePlate()
    {
        return licensePlate;
    }



    public Car(String licensePlate, String color)
    {
        this.licensePlate = licensePlate;
        this.color = color;
    }
    @Override
    public String toString()
    {
        return "Car " + licensePlate + " (" + color + ")";
    }
}
