package folien.oop1.cats;

public class Cat
{
    private String name;
    private int age;
    private String breed;

    public Cat(int age, String breed, String name) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }


    public void meow()
    {
        System.out.println(this.name + " says: Meow! Hiss! Prr!");
    }

    public void fight(Cat otherCat)
    {
        System.out.println(this.name + " is fighting with " + otherCat.name);
    }
}
