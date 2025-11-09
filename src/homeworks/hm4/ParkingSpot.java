package homeworks.hm4;

public class ParkingSpot
{
    private int spotNumber;
    private Car car;



    public ParkingSpot(int spotNumber)
    {
        this.spotNumber = spotNumber;
        this.car = null;
    }

    public boolean isFree()
    {
        if (car == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void parkCar(Car car)
    {
        this.car = car;
    }

    public void removeCar()
    {
        this.car = null;
    }

    public Car getCar()
    {
        return car;
    }

    @Override
    public String toString()
    {
        if (car == null)
        {
            return "Spot " + spotNumber + ": free";
        }
        return "Spot " + spotNumber + ": " + car.toString();
    }

}
