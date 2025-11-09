package example_tasks.Midterm2.shoppingcart;
/*
Exercise: Shopping Cart System

Create two classes: Product and Cart, and a main class ShoppingApp to test them.

-------------------------------
Class: Product
-------------------------------
• A Product has the following attributes:
    - name (String)
    - price (double)
    - vat (int)  // VAT percentage
    - articleNumber (String)

• Implement a constructor that initializes all fields.

• Implement the following methods:
    - getPrice(): returns the net price.
    - getPriceInclusiveTax(): returns the price including VAT (price + price * vat / 100).
    - getArticleNumber(): returns the article number.
    - toString(): returns a formatted String like
      "Laptop (A123): 1200.0".

-------------------------------
Class: Cart
-------------------------------
• A Cart has the following attributes:
    - cartName (String)
    - items (array of Product)
    - itemCount (int)
    - static int cartCount  // total number of carts created
    - static double revenue // total net revenue of all carts
    - static double revenueInclTax // total gross revenue of all carts

• Implement the following constructors:
    1. Cart(): creates a cart with a capacity of 10 products.
    2. Cart(int numberItems): creates a cart with a custom capacity.
       Each cart should have a name like "Cart 1", "Cart 2", etc.
    3. Cart(Product[] products): creates a cart containing the given array of products,
       counts non-null products, and initializes revenue and revenueInclTax accordingly.

• Implement the following methods:
    - isFull(): returns true if the cart is full.
    - isEmpty(): returns true if the cart has no products.
    - addItem(Product product): adds a product if the cart is not full,
      updates itemCount, revenue, and revenueInclTax.
      Prints "Cart is full. Product cannot be added." if full.
    - removeItem(String articleNumber): removes the product with the given article number,
      updates counters and revenues accordingly.
      Prints "Product not found." if not found.
    - enlargeCart(): increases the cart capacity by 5, copying existing items into the new array.
    - getTotal(): returns the total net price of all products in the cart.
    - getTotalInclusiveTax(): returns the total gross price (including VAT).
    - printCart(): prints all products and total prices of the cart.
    - static analyzeCarts(): prints the number of carts created and the overall revenue.

-------------------------------
Class: ShoppingApp (main)
-------------------------------
• Create several Product objects.
• Create multiple Cart objects using different constructors.
• Add and remove items from carts.
• Enlarge a cart.
• Call Cart.analyzeCarts() after changes to verify totals.
• Print the contents of each cart using printCart().
*/

public class Cart
{
    private String cartName;
    private Product[] items;
    private int itemCount;
    private static int cartCount;
    private static double revenue;
    private static double revenueInclTax;

    public Cart()
    {
        this(10);
    }

    public Cart(int numberItems)
    {
        this.cartName = "Cart " + ++cartCount;
        this.items = new Product[numberItems];
    }

    public Cart(Product[] products)
    {
        this.cartName = "Cart " + ++cartCount;
        this.items = products;

        for (Product product : products)
        {
            if (product != null)
            {
                this.itemCount++;
            }
        }

        revenue = this.getTotal();
        revenueInclTax = this.getTotalInclusiveTax();
    }

    public boolean isFull()
    {
        return this.items.length == this.itemCount;
    }

    public boolean isEmpty()
    {
        return this.itemCount == 0;
    }

    public boolean addItem(Product product)
    {
        if (!isFull())
        {
            for (int i = 0; i < this.items.length; i++)
            {
                if (this.items[i] == null)
                {
                    this.items[i] = product;

                    this.itemCount++;
                    revenue += product.getPrice();
                    revenueInclTax += product.getPriceInclusiveTax();

                    return true;
                }
            }
        }

        System.out.println("Cart is full. Product cannot be added.");

        return false;
    }

    public boolean removeItem(String articleNumber)
    {
        if (!isEmpty())
        {
            for (int i = 0; i < this.items.length; i++)
            {
                if (this.items[i].getArticleNumber().equals(articleNumber))
                {
                    this.itemCount--;
                    revenue -= this.items[i].getPrice();
                    revenueInclTax -= this.items[i].getPriceInclusiveTax();

                    this.items[i] = null;

                    return true;
                }
            }
        }

        System.out.println("Product not found.");

        return false;
    }

    public void enlargeCart()
    {
        Product[] newProducts = new Product[this.items.length + 5];

        // copy old products in new array
        for (int i = 0; i < this.items.length; i++)
        {
            newProducts[i] = this.items[i];
        }

        this.items = newProducts;
    }

    public double getTotal()
    {
        double total = 0;

        for (Product product : this.items)
        {
            if (product != null)
            {
                total += product.getPrice();
            }
        }

        return total;
    }

    public double getTotalInclusiveTax()
    {
        double total = 0;

        for (Product product : this.items)
        {
            if (product != null)
            {
                total += product.getPriceInclusiveTax();
            }
        }

        return total;
    }

    public void printCart()
    {
        System.out.println("Products in " + this.cartName + " (size: " + this.items.length + "):");

        for (Product product : this.items)
        {
            if (product != null)
            {
                System.out.println(product);
            }
        }

        System.out.println("----------");
        System.out.println("Total: " + this.getTotal());
        System.out.println("Total incl. Tax: " + this.getTotalInclusiveTax());
        System.out.println("----------");
    }

    public static void analyzeCarts()
    {
        System.out.println("Number of carts: " + cartCount);
        System.out.printf("The overall net revenue is %.0f.%n", revenue);
    }
}
