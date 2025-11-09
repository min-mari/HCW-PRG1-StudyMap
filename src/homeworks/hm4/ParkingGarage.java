package homeworks.hm4;

public class ParkingGarage
{
    private String name;
    private ParkingSpot[] spots;

    public ParkingGarage(String name, int capacity) {
        this.name = name;
        this.spots = new ParkingSpot[capacity];
        for (int i = 0; i < capacity; i++) {
            this.spots[i] = new ParkingSpot(i + 1);
        }
    }


    public boolean parkCar(Car car) {
        for (ParkingSpot spot : spots) {
            if (spot.isFree()) {
                spot.parkCar(car);
                return true;
            }
        }
        return false;
    }


    public boolean removeCar(String licensePlate) {
        for (ParkingSpot spot : spots) {
            Car c = spot.getCar();
            if (c != null && c.getLicensePlate().equals(licensePlate)) {
                spot.removeCar();
                return true;
            }
        }
        return false;
    }


    public void showGarage() {
        System.out.println("Parking Garage " + name);
        for (ParkingSpot spot : spots) {
            System.out.println(spot.toString());
        }
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return spots.length;
    }
}