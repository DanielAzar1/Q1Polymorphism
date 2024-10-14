import java.util.Scanner;

public class ShoppingCart{
    Product[] list;
    Scanner input = new Scanner(System.in);

    public Product[] createList()
    {
        int price;
        for(int i = 0; i < 10; i++) {
            price = input.nextInt();

            list[i] = new Product(Integer.toString(i), price, "Item in list");
        }
        return list;
    }

    public int CalculateTotal(Product[] List)
    {
        int total = 0;

        for(int i = 0; i < 10; i++) {
            total += list[i].getPrice();
        }
        return total;
    }
}
