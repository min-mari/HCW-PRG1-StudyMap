package folien.oop1.cars;

public class CarApp
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Toyota",2005,"Diesel",200);
        Car car2 = new Car ("Audi",2024,"Electric",250);
        Car car3 = new Car ("Tesla",2025,"Electric",300);

        car1.honk();
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year of Permit: " + car1.getYearOfPermit());
        System.out.println("Engine: " + car1.getTypeOfEngine());
        System.out.println("Is this car electric (true/false): " + car1.isElectric());
        car1.accelerate(100);
        car1.brake(25);
        System.out.println("********************");

        /*car2.honk();
        System.out.println("Brand: " + car2.getBrand());
        System.out.println("Year of Permit: " + car2.getYearOfPermit());
        System.out.println("Engine: " + car2.getTypeOfEngine());
        System.out.println("Is this car electric (true/false): " + car2.isElectric());
        car2.accelerate();
        car2.brake();
        System.out.println("********************");

        car3.honk();
        System.out.println("Brand: " + car3.getBrand());
        System.out.println("Year of Permit: " + car3.getYearOfPermit());
        System.out.println("Engine: " + car3.getTypeOfEngine());
        System.out.println("Is this car electric (true/false): " + car3.isElectric());
        car3.accelerate();
        car3.brake();
        System.out.println("********************");*/

    }
}
