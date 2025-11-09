package folien.oop1.cats;

public class CatApp
{
    public static void main(String[] args)
    {

        Cat cat1 = new Cat(11, "BKH", "Tamina");
        cat1.meow();


        Cat cat2 = new Cat(7, "Siamese", "Cookie");
        cat2.meow();

        cat2.fight(cat1);

    }
}
