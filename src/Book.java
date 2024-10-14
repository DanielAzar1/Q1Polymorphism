public class Book extends Product
{

    public Book(String name, int price) {
        super(name, price, "A collection of papers with text on them");
    }

    public void read()
    {
        System.out.println("Reading book");
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
